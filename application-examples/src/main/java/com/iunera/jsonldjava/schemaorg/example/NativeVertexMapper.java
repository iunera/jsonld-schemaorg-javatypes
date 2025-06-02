/*
 * Copyright (C) 2025.  Tim Frey, Christian Schmitt
 *
 * Licensed under the OPEN COMPENSATION TOKEN LICENSE (the "License").
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at <a href="https://www.license-token.com/license/text">https://www.license-token.com/license/text</a>
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either expressed or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @octl.sid: 4efebf98-4efe-ff98-bf98-00004eb04127
 *
 */

package com.iunera.jsonldjava.schemaorg.example;

import com.iunera.jsonldjava.schemaorg.metadatatypes.*;
import com.iunera.jsonldjava.schemaorg.annotations.Vertex;
import org.apache.tinkerpop.gremlin.driver.Client;
import org.apache.tinkerpop.gremlin.driver.Cluster;
import org.apache.tinkerpop.gremlin.driver.remote.DriverRemoteConnection;
import org.apache.tinkerpop.gremlin.process.traversal.AnonymousTraversalSource;
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.GraphTraversalSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.*;

/**
 * Manages persistence and querying of Schema.org objects as vertices in OrientDB using the Gremlin driver.
 * Handles nested types, references, and updates for @Vertex-annotated classes.
 */
@Component
public class NativeVertexMapper {
    private static final Logger LOGGER = LoggerFactory.getLogger(NativeVertexMapper.class);

    @Value("${gremlin.host:localhost}")
    private String gremlinHost;

    @Value("${gremlin.port:8182}")
    private int gremlinPort;

    private final Cluster cluster;

    /**
     * Constructs a NativeVertexMapper, initializing the Gremlin cluster for OrientDB connections.
     */
    public NativeVertexMapper() {
        cluster = Cluster.build()
                .addContactPoint(gremlinHost)
                .port(gremlinPort)
                .path("/gremlin")
                .create();
    }

    /**
     * Saves a Schema.org object as a vertex in OrientDB, handling nested @Vertex-annotated types and references.
     * Creates or updates vertices and their relationships.
     * @param schemaOrgObject The Schema.org object to save or update.
     * @throws IllegalArgumentException If the object is null or not @Vertex-annotated.
     * @throws RuntimeException If saving or updating fails due to database errors.
     */
    public void saveVertex(Object schemaOrgObject) {
        if (schemaOrgObject == null) {
            LOGGER.error("Cannot save null Schema.org object");
            throw new IllegalArgumentException("Schema.org object cannot be null");
        }

        Client client = cluster.connect();
        try (GraphTraversalSource g = AnonymousTraversalSource.traversal()
                .withRemote(DriverRemoteConnection.using(client))) {
            saveVertexRecursive(schemaOrgObject, g, null, null);
        } catch (Exception e) {
            LOGGER.error("Failed to save vertex: {}", e.getMessage(), e);
            throw new RuntimeException("Failed to save vertex", e);
        } finally {
            client.close();
        }
    }

    /**
     * Recursively creates or updates a Schema.org object as a vertex in OrientDB, handling nested @Vertex-annotated
     * types and creating or updating edges for references.
     * @param schemaOrgObject The Schema.org object to create or update.
     * @param g The Gremlin traversal source for database operations.
     * @param parentObject The parent object, if any, for edge linking (e.g., Person for PostalAddress).
     * @param edgeLabel The edge label for linking to the parent, if any (e.g., "address").
     * @return The vertex ID of the created or updated vertex, or null if not processed.
     */
    private String saveVertexRecursive(Object schemaOrgObject, GraphTraversalSource g, Object parentObject, String edgeLabel) {
        if (schemaOrgObject == null) {
            return null;
        }

        Class<?> schemaClass = schemaOrgObject.getClass();
        if (!schemaClass.isAnnotationPresent(Vertex.class)) {
            LOGGER.debug("Class {} is not annotated with @Vertex, skipping vertex processing", schemaClass.getSimpleName());
            return null;
        }

        String vertexTypeName = schemaClass.getSimpleName();
        String vertexId = getId(schemaOrgObject);

        var vertexTraversal = g.V();
        if (vertexId != null && g.V(vertexId).hasLabel(vertexTypeName).hasNext()) {
            LOGGER.debug("Updating existing vertex {} with ID {}", vertexTypeName, vertexId);
            vertexTraversal = g.V(vertexId).hasLabel(vertexTypeName);
        } else {
            LOGGER.debug("Creating new vertex {} for {}", vertexTypeName, schemaClass.getSimpleName());
            vertexTraversal = g.addV(vertexTypeName);
        }

        // Set properties using reflection
        Method[] methods = schemaClass.getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("get") && method.getParameterCount() == 0 && !method.getName().equals("getClass")) {
                String propertyName = toCamelCase(method.getName().substring(3));
                try {
                    Object value = method.invoke(schemaOrgObject);
                    if (value != null) {
                        if (value.getClass().isAnnotationPresent(Vertex.class)) {
                            // Handle nested @Vertex-annotated object
                            String nestedVertexId = saveVertexRecursive(value, g, schemaOrgObject, propertyName);
                            if (nestedVertexId != null && parentObject != null) {
                                String parentId = getId(parentObject);
                                if (parentId != null) {
                                    // Remove existing edges for this property
                                    g.V(parentId).outE(propertyName).drop().iterate();
                                    // Add new edge
                                    g.V(parentId).addE(propertyName).to(g.V(nestedVertexId)).next();
                                }
                            }
                        } else if (value instanceof List && !((List<?>) value).isEmpty() && ((List<?>) value).get(0).getClass().isAnnotationPresent(Vertex.class)) {
                            // Handle list of @Vertex-annotated objects
                            if (parentObject != null) {
                                String parentId = getId(parentObject);
                                if (parentId != null) {
                                    g.V(parentId).outE(propertyName).drop().iterate();
                                }
                            }
                            for (Object item : (List<?>) value) {
                                String nestedVertexId = saveVertexRecursive(item, g, schemaOrgObject, propertyName);
                                if (nestedVertexId != null && parentObject != null) {
                                    String parentId = getId(parentObject);
                                    if (parentId != null) {
                                        g.V(parentId).addE(propertyName).to(g.V(nestedVertexId)).next();
                                    }
                                }
                            }
                        } else if (!value.toString().isEmpty()) {
                            // Handle simple properties
                            vertexTraversal.property(propertyName, value);
                        } else {
                            // Remove empty properties
                            vertexTraversal.property(propertyName).remove();
                        }
                    } else {
                        // Remove null properties
                        vertexTraversal.property(propertyName).remove();
                    }
                } catch (Exception e) {
                    LOGGER.warn("Failed to process property {}: {}", propertyName, e.getMessage());
                }
            }
        }

        // Save or update vertex and get ID
        Map<Object, Object> vertex = vertexTraversal.next();
        String vertexIdResult = vertex.get("id").toString();
        setId(schemaOrgObject, vertexIdResult);

        // Update parent edge if applicable
        if (parentObject != null && edgeLabel != null) {
            String parentId = getId(parentObject);
            if (parentId != null) {
                g.V(parentId).outE(edgeLabel).drop().iterate();
                g.V(parentId).addE(edgeLabel).to(g.V(vertexIdResult)).next();
            }
        }

        LOGGER.info("Successfully {} vertex {} with ID: {}", vertexId != null ? "updated" : "created", vertexTypeName, vertexIdResult);
        return vertexIdResult;
    }

    /**
     * Retrieves all vertices of a specified Schema.org type, optionally including related vertices.
     * @param vertexClass The Class of the Schema.org type (must be @Vertex-annotated).
     * @param includeRelated If true, includes related vertices linked by edges.
     * @param <T> The type of Schema.org object.
     * @return A list of vertices mapped to the specified type.
     * @throws IllegalArgumentException If vertexClass is null or not @Vertex-annotated.
     * @throws RuntimeException If querying fails.
     */
    public <T> List<T> findAllVertices(Class<T> vertexClass, boolean includeRelated) {
        if (vertexClass == null || !vertexClass.isAnnotationPresent(Vertex.class)) {
            LOGGER.error("Class {} is not annotated with @Vertex or is null", vertexClass != null ? vertexClass.getSimpleName() : "null");
            throw new IllegalArgumentException("Class must be annotated with @Vertex");
        }

        String vertexTypeName = vertexClass.getSimpleName();
        List<T> results = new ArrayList<>();

        Client client = cluster.connect();
        try (GraphTraversalSource g = AnonymousTraversalSource.traversal()
                .withRemote(DriverRemoteConnection.using(client))) {
            List<Map<Object, Object>> vertices = g.V().hasLabel(vertexTypeName).valueMap(true).toList();
            for (Map<Object, Object> vertex : vertices) {
                try {
                    T instance = vertexClass.getDeclaredConstructor().newInstance();
                    for (Method method : vertexClass.getMethods()) {
                        if (method.getName().startsWith("set") && method.getParameterCount() == 1) {
                            String propertyName = toCamelCase(method.getName().substring(3));
                            if (vertex.containsKey(propertyName)) {
                                Object value = vertex.get(propertyName);
                                if (value instanceof List && !((List<?>) value).isEmpty()) {
                                    value = ((List<?>) value).get(0);
                                }
                                method.invoke(instance, value);
                            }
                        }
                    }
                    String id = vertex.get("id").toString();
                    setId(instance, id);

                    if (includeRelated) {
                        List<Map<Object, Object>> related = g.V(id).inE().otherV().valueMap(true).toList();
                        for (Map<Object, Object> relVertex : related) {
                            String relType = relVertex.get("label").toString();
                            Class<?> relClass = getClassByVertexType(relType);
                            if (relClass != null) {
                                Object relInstance = relClass.getDeclaredConstructor().newInstance();
                                for (Method method : relClass.getMethods()) {
                                    if (method.getName().startsWith("set") && method.getParameterCount() == 1) {
                                        String propName = toCamelCase(method.getName().substring(3));
                                        if (relVertex.containsKey(propName)) {
                                            Object value = relVertex.get(propName);
                                            if (value instanceof List && !((List<?>) value).isEmpty()) {
                                                value = ((List<?>) value).get(0);
                                            }
                                            method.invoke(relInstance, value);
                                        }
                                    }
                                }
                                setId(relInstance, relVertex.get("id").toString());
                                for (Method m : vertexClass.getMethods()) {
                                    if (m.getName().startsWith("set") && m.getParameterTypes().length == 1 && m.getParameterTypes()[0].isAssignableFrom(relClass)) {
                                        m.invoke(instance, relInstance);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    results.add(instance);
                } catch (Exception e) {
                    LOGGER.warn("Failed to map vertex to {}: {}", vertexTypeName, e.getMessage());
                }
            }
            LOGGER.info("Retrieved {} vertices of type {}", results.size(), vertexTypeName);
        } catch (Exception e) {
            LOGGER.error("Failed to query {}: {}", vertexTypeName, e.getMessage(), e);
            throw new RuntimeException("Failed to query " + vertexTypeName, e);
        } finally {
            client.close();
        }
        return results;
    }

    /**
     * Retrieves a single vertex by its ID for a specified Schema.org type.
     * @param vertexClass The Class of the Schema.org type (must be @Vertex-annotated).
     * @param id The vertex ID (Record ID).
     * @param <T> The type of Schema.org object.
     * @return The vertex mapped to the specified type.
     * @throws IllegalArgumentException If vertexClass or ID is null or not @Vertex-annotated.
     * @throws RuntimeException If querying fails.
     */
    public <T> T findVertexById(Class<T> vertexClass, String id) {
        if (vertexClass == null || !vertexClass.isAnnotationPresent(Vertex.class)) {
            LOGGER.error("Class {} is not annotated with @Vertex or is null", vertexClass != null ? vertexClass.getSimpleName() : "null");
            throw new IllegalArgumentException("Class must be annotated with @Vertex");
        }
        if (id == null) {
            LOGGER.error("Vertex ID cannot be null");
            throw new IllegalArgumentException("Vertex ID cannot be null");
        }

        String vertexTypeName = vertexClass.getSimpleName();

        Client client = cluster.connect();
        try (GraphTraversalSource g = AnonymousTraversalSource.traversal()
                .withRemote(DriverRemoteConnection.using(client))) {
            Map<Object, Object> vertex = g.V(id).hasLabel(vertexTypeName).valueMap(true).next();
            T instance = vertexClass.getDeclaredConstructor().newInstance();
            for (Method method : vertexClass.getMethods()) {
                if (method.getName().startsWith("set") && method.getParameterCount() == 1) {
                    String propertyName = toCamelCase(method.getName().substring(3));
                    if (vertex.containsKey(propertyName)) {
                        Object value = vertex.get(propertyName);
                        if (value instanceof List && !((List<?>) value).isEmpty()) {
                            value = ((List<?>) value).get(0);
                        }
                        method.invoke(instance, value);
                    }
                }
            }
            setId(instance, id);
            LOGGER.info("Retrieved vertex {} with ID {}", vertexTypeName, id);
            return instance;
        } catch (Exception e) {
            LOGGER.error("Failed to query {} with ID {}: {}", vertexTypeName, id, e.getMessage(), e);
            throw new RuntimeException("Failed to query " + vertexTypeName + " with ID " + id, e);
        } finally {
            client.close();
        }
    }

    /**
     * Updates the properties of a vertex identified by its ID.
     * @param id The vertex ID (Record ID).
     * @param properties A map of property names to values.
     * @throws IllegalArgumentException If ID or properties are null.
     * @throws RuntimeException If updating fails.
     */
    public void updateVertexProperties(String id, Map<String, Object> properties) {
        if (id == null || properties == null) {
            LOGGER.error("Vertex ID or properties cannot be null");
            throw new IllegalArgumentException("Vertex ID and properties cannot be null");
        }

        Client client = cluster.connect();
        try (GraphTraversalSource g = AnonymousTraversalSource.traversal()
                .withRemote(DriverRemoteConnection.using(client))) {
            var vertex = g.V(id);
            if (!vertex.hasNext()) {
                LOGGER.error("Vertex with ID {} not found", id);
                throw new IllegalArgumentException("Vertex with ID " + id + " not found");
            }

            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && !value.toString().isEmpty()) {
                    vertex.property(key, value);
                } else {
                    vertex.property(key).remove();
                }
            }
            vertex.next();
            LOGGER.info("Updated properties for vertex with ID {}", id);
        } catch (Exception e) {
            LOGGER.error("Failed to update properties for vertex with ID {}: {}", id, e.getMessage(), e);
            throw new RuntimeException("Failed to update vertex properties", e);
        } finally {
            client.close();
        }
    }

    /**
     * Updates a reference (edge) from a source vertex to a target vertex for a specified property.
     * @param sourceId The source vertex ID.
     * @param propertyName The property name (edge label).
     * @param targetId The target vertex ID.
     * @throws IllegalArgumentException If any parameter is null.
     * @throws RuntimeException If updating fails.
     */
    public void updateReference(String sourceId, String propertyName, String targetId) {
        if (sourceId == null || propertyName == null || targetId == null) {
            LOGGER.error("Source ID, property name, or target ID is null");
            throw new IllegalArgumentException("Source ID, property name, and target ID cannot be null");
        }

        Client client = cluster.connect();
        try (GraphTraversalSource g = AnonymousTraversalSource.traversal()
                .withRemote(DriverRemoteConnection.using(client))) {
            g.V(sourceId).outE(propertyName).drop().iterate();
            g.V(sourceId).addE(propertyName).to(g.V(targetId)).next();
            LOGGER.info("Updated reference from {} to {} for property {}", sourceId, targetId, propertyName);
        } catch (Exception e) {
            LOGGER.error("Failed to update reference for property {}: {}", propertyName, e.getMessage(), e);
            throw new RuntimeException("Failed to update reference", e);
        } finally {
            client.close();
        }
    }

    /**
     * Retrieves the ID of a Schema.org object.
     * @param obj The Schema.org object.
     * @return The ID, or null if not found.
     */
    private String getId(Object obj) {
        try {
            Method getId = obj.getClass().getMethod("getId");
            return (String) getId.invoke(obj);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Sets the ID of a Schema.org object.
     * @param obj The Schema.org object.
     * @param id The ID to set.
     */
    private void setId(Object obj, String id) {
        try {
            Method setId = obj.getClass().getMethod("setId", String.class);
            setId.invoke(obj, id);
        } catch (Exception e) {
            LOGGER.warn("Failed to set ID for {}: {}", obj.getClass().getSimpleName(), e.getMessage());
        }
    }

    /**
     * Converts a method name to camelCase for property mapping.
     * @param name The method name.
     * @return The camelCase property name.
     */
    private String toCamelCase(String name) {
        if (name == null || name.isEmpty()) return name;
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }

    /**
     * Maps a vertex type name to its corresponding Schema.org class.
     * @param vertexType The vertex type name.
     * @return The corresponding Class, or null if not found.
     */
    private Class<?> getClassByVertexType(String vertexType) {
        Map<String, Class<?>> typeMap = new HashMap<>();
        typeMap.put("Product", Product.class);
        typeMap.put("Person", Person.class);
        typeMap.put("PostalAddress", PostalAddress.class);
        typeMap.put("Organization", Organization.class);
        return typeMap.get(vertexType);
    }

    /**
     * Closes the Gremlin cluster connection.
     */
    public void close() {
        if (cluster != null) {
            cluster.close();
        }
    }
}
