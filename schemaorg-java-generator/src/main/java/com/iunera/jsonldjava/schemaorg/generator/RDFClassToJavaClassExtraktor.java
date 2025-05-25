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

package com.iunera.jsonldjava.schemaorg.generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Utility class to extract Schema.org entity information from a JSON-LD node.
 * If the node represents a Schema.org class, its properties can be accessed directly or via provided methods.
 * If the node is not a class, {@link #isMainEntity()} returns {@code false}.
 *
 * @author Tim Frey
 */
public class RDFClassToJavaClassExtraktor {
    private final Map<String, Object> entity;
    private boolean isMainEntity = false;
    private String entityName;
    private boolean isDeprecated = false;

    /**
     * Constructs an extractor for a JSON-LD entity.
     *
     * @param entity A map representing the JSON-LD node.
     */
    public RDFClassToJavaClassExtraktor(Map<String, Object> entity) {
        this.entity = entity;

        for (Map.Entry<String, Object> entityProperties : entity.entrySet()) {
            if (entityProperties.getKey().equals("@id")) {
                entityName = entityProperties.getValue().toString().replace("http://schema.org/", "");
                if (Character.isLowerCase(entityName.charAt(0))) {
                    entityName = entityProperties.getValue().toString().replace("http://schema.org/", "");
                } else {
                    isMainEntity = true;
                }
                break;
            }
        }
        if (entity.containsKey("http://schema.org/supersededBy")) {
            isDeprecated = true;
        }
    }

    /**
     * Returns the entity's Schema.org identifier.
     *
     * @return The entity's "@id" value (e.g., "http://schema.org/Person").
     */
    public String getID() {
        return this.entity.get("@id").toString();
    }

    /**
     * Checks if the entity is a basic Schema.org datatype (e.g., Boolean, Date, Text).
     *
     * @return {@code true} if the entity is a basic datatype, {@code false} otherwise.
     */
    public boolean isBasicEntity() {
        String idValue = entity.get("@id").toString();
        String typeValue = entity.get("@type").toString();
        return idValue.contains("http://schema.org/Boolean")
                || idValue.contains("http://schema.org/Date")
                || idValue.contains("http://schema.org/DateTime")
                || idValue.contains("http://schema.org/Number")
                || idValue.contains("http://schema.org/Text")
                || idValue.contains("http://schema.org/Float")
                || idValue.contains("http://schema.org/URL")
                || idValue.contains("http://schema.org/Time")
                || idValue.contains("http://schema.org/Integer")
                || typeValue.contains("http://schema.org/Boolean")
                || typeValue.contains("http://schema.org/Date")
                || typeValue.contains("http://schema.org/Float")
                || typeValue.contains("http://schema.org/Integer")
                || typeValue.contains("http://schema.org/DateTime")
                || typeValue.contains("http://schema.org/Number")
                || typeValue.contains("http://schema.org/Text")
                || typeValue.contains("http://schema.org/URL")
                || typeValue.contains("http://schema.org/Time");
    }

    /**
     * Retrieves the Javadoc comment for the entity, derived from its RDF schema comment.
     * Removes any dollar signs and returns an empty string if no comment exists.
     *
     * @return The cleaned Javadoc comment, or an empty string if none exists.
     */
    public String getJavaDoc() {
        Object commentObj = entity.get("http://www.w3.org/2000/01/rdf-schema#comment");
        String comment = (commentObj != null) ? commentObj.toString() : "";
        return comment.replace("$", "");
    }

    /**
     * Checks if the entity is deprecated (superseded by another entity).
     *
     * @return {@code true} if the entity is deprecated, {@code false} otherwise.
     */
    public boolean isDeprecated() {
        return isDeprecated;
    }

    /**
     * Checks if the entity is a main Schema.org class (starts with an uppercase letter).
     *
     * @return {@code true} if the entity is a main class, {@code false} otherwise.
     */
    public boolean isMainEntity() {
        return isMainEntity;
    }

    /**
     * Returns the name of the entity, derived from its Schema.org identifier.
     *
     * @return The entity name (e.g., "Person").
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Retrieves the super types (parent classes) of the entity.
     * Excludes RDF schema classes and handles malformed super type data.
     *
     * @return A list of {@link Type} objects representing the super types.
     */
    public List<Type> getSuperTypes() {
        List<Type> ret = new ArrayList<>();
        Object superTypesString = entity.get("http://www.w3.org/2000/01/rdf-schema#subClassOf");
        String typeString = entity.get("@type").toString().replace("http://schema.org/", "");
        if (superTypesString == null && typeString.contains("rdfs:Class")) {
            return ret;
        }
        try {
            List<String> superTypes = new ArrayList<>();
            superTypes.add(typeString);
            if (superTypesString != null) {
                Collections.addAll(superTypes, superTypesString.toString()
                        .replace("@id=http://schema.org/", "")
                        .replace("}", "").replace("{", "").replace("[", "").replace("]", "")
                        .split(","));
            }
            for (String superType : superTypes) {
                superType = superType.trim();
                if (superType.equalsIgnoreCase("@id=http://www.w3.org/2000/01/rdf-schema#Class")
                        || superType.equalsIgnoreCase("@id=http://www.w3.org/2000/01/rdf-schema#class")
                        || superType.contains("http://www.w3.org/2000/01/rdf-schema#Class")
                        || superType.contains("http://www.w3.org/2000/01/rdf-schema#class")
                        || superType.contains("rdfs:Class")) {
                    continue; // Skip RDF schema classes
                }
                ret.add(new Type(superType, "", ""));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

    /**
     * Represents a Schema.org type with its name, type identifier, and associated Javadoc comment.
     */
    public static class Type {
        public String type;
        public String name;
        public String javadoc;

        /**
         * Constructs a Type instance.
         *
         * @param type    The Schema.org type identifier (e.g., "http://schema.org/Person").
         * @param name    The name of the type (e.g., "Person").
         * @param javadoc The Javadoc comment describing the type.
         */
        public Type(String type, String name, String javadoc) {
            this.type = type;
            this.name = name;
            this.javadoc = javadoc;
        }
    }
}
