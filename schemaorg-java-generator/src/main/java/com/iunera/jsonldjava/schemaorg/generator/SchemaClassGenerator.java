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

import com.github.jsonldjava.core.JsonLdError;
import com.github.jsonldjava.core.JsonLdOptions;
import com.github.jsonldjava.core.JsonLdProcessor;
import com.github.jsonldjava.utils.JsonUtils;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.squareup.javapoet.*;

import javax.lang.model.element.Modifier;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

/**
 * Generates Java classes from Schema.org JSON-LD definitions, creating semantically clear classes for use in AI-driven
 * applications like NLWeb. Handles multi-inheritance by using aggregation for additional superclasses beyond the first,
 * as Java does not support multiple class inheritance. The generated classes include Schema.org properties and annotations
 * for JSON-LD and graph database compatibility.
 *
 * @author Tim Frey
 */
public class SchemaClassGenerator {

    /**
     * Package name for generated Schema.org type classes (e.g., Person, CreativeWork).
     */
    public static String TYPEPACKAGE = "com.iunera.jsonldjava.schemaorg.metadatatypes";

    /**
     * Package name for Schema.org annotation classes (e.g., JsonldType, JsonldProperty).
     */
    public static String ANNOTATIONPACKAGE = "com.iunera.jsonldjava.schemaorg.associations";

    /**
     * Main method to generate Java classes from a Schema.org JSON-LD file. Reads the JSON-LD file, processes entities to
     * identify classes and properties, and generates corresponding Java classes with appropriate superclasses, properties,
     * and annotations. Writes the generated classes to the file system.
     *
     * @param args Command-line arguments (not used).
     * @throws JsonLdError If JSON-LD processing fails.
     * @throws IOException If file reading or writing fails.
     */
    public static void main(String[] args) throws JsonLdError, IOException {
        // Read the Schema.org JSON-LD file (update from https://schema.org/docs/developers.html#defs)
        File file = new File("src/main/resources/schema.jsonld");
        try (FileInputStream fis = new FileInputStream(file)) {
            // Parse the JSON-LD file into an object
            Object jsonObject = JsonUtils.fromInputStream(fis);

            // Create a context for JSON-LD processing
            Map<String, Object> context = new HashMap<>();
            JsonLdOptions options = new JsonLdOptions();

            // Extract the JSON-LD graph
            List<Map<String, Object>> compact = (List<Map<String, Object>>) JsonLdProcessor.compact(
                    jsonObject, context, options).get("@graph");

            // Map to store class properties for code generation
            Multimap<String, FieldSpec> properties = HashMultimap.create();
            Set<String> inverses = new HashSet<>();

            // First pass: Identify properties and associate them with classes
            for (Map<String, Object> entity : compact) {
                RDFProperty property = new RDFProperty(entity);
                if (!property.isDeprecated() && property.isProperty() && !inverses.contains(property.getName())) {
                    if (property.hasInverse()) {
                        inverses.add(property.getInverse());
                    }
                    Set<String> propertyEntities = property.getEntities();
                    if (propertyEntities != null) {
                        for (String propertyEntity : propertyEntities) {
                            properties.putAll(propertyEntity, new HashSet<>(property.getFields()));
                        }
                    }
                }
            }

            // Second pass: Generate Java classes for main entities
            for (Map<String, Object> entity : compact) {
                RDFClassToJavaClassExtraktor entityEx = new RDFClassToJavaClassExtraktor(entity);
                if (!entityEx.isMainEntity() || entityEx.isDeprecated() || entityEx.isBasicEntity()) {
                    continue; // Skip non-main entities, deprecated entities, or basic datatypes
                }

                // Build the Java class with annotations and Javadoc
                AnnotationSpec vertexAnnotation = AnnotationSpec.builder(
                        ClassName.get(ANNOTATIONPACKAGE, "Vertex")).build();
                AnnotationSpec jsonldTypeAnnotation = AnnotationSpec.builder(
                                ClassName.get(ANNOTATIONPACKAGE, "JsonldType"))
                        .addMember("value", "\"$L\"", entityEx.getID())
                        .build();

                TypeSpec.Builder javaBuilder;
                List<RDFClassToJavaClassExtraktor.Type> superTypes = entityEx.getSuperTypes();
                if (superTypes.isEmpty()) {
                    // No superclass
                    javaBuilder = TypeSpec.classBuilder(entityEx.getEntityName())
                            .addModifiers(Modifier.PUBLIC)
                            .addAnnotation(vertexAnnotation)
                            .addAnnotation(jsonldTypeAnnotation)
                            .addJavadoc("$L", entityEx.getJavaDoc());
                } else if (superTypes.size() == 1) {
                    // Single superclass
                    ClassName superClass = ClassName.get(TYPEPACKAGE, superTypes.get(0).type);
                    javaBuilder = TypeSpec.classBuilder(entityEx.getEntityName())
                            .addModifiers(Modifier.PUBLIC)
                            .superclass(superClass)
                            .addAnnotation(vertexAnnotation)
                            .addAnnotation(jsonldTypeAnnotation)
                            .addJavadoc("$L", entityEx.getJavaDoc());
                } else {
                    // Multiple superclasses (use aggregation for additional ones)
                    ClassName superClass = ClassName.get(TYPEPACKAGE, superTypes.get(0).type);
                    javaBuilder = TypeSpec.classBuilder(entityEx.getEntityName())
                            .addModifiers(Modifier.PUBLIC)
                            .superclass(superClass)
                            .addAnnotation(vertexAnnotation)
                            .addAnnotation(jsonldTypeAnnotation)
                            .addJavadoc("$L", entityEx.getJavaDoc());

                    // Add fields for additional superclasses as aggregation
                    for (int i = 1; i < superTypes.size(); i++) {
                        TypeName typeName = ClassName.get(TYPEPACKAGE, superTypes.get(i).type);
                        String fieldName = Character.toLowerCase(superTypes.get(i).type.charAt(0))
                                + superTypes.get(i).type.substring(1);
                        AnnotationSpec propertyAnnotation = AnnotationSpec.builder(
                                        ClassName.get(ANNOTATIONPACKAGE, "JsonldProperty"))
                                .addMember("value", "\"$L\"", "http://schema.org/" + superTypes.get(i).type)
                                .build();
                        FieldSpec field = FieldSpec.builder(typeName, fieldName, Modifier.PUBLIC)
                                .addAnnotation(propertyAnnotation)
                                .addJavadoc("Represents an additional superclass from Schema.org. Since Java does not "
                                        + "support multiple inheritance, this is implemented as a composition.")
                                .build();
                        javaBuilder.addField(field);
                    }
                }

                // Add properties to the class
                try {
                    if (properties.containsKey(entityEx.getEntityName())) {
                        for (FieldSpec field : properties.get(entityEx.getEntityName())) {
                            javaBuilder.addField(field);
                        }
                    }
                } catch (Exception e) {
                    System.err.println("Error adding properties to class " + entityEx.getEntityName());
                    e.printStackTrace();
                }

                // Write the generated class to the file system
                TypeSpec currentClass = javaBuilder.build();
                JavaFile javaFile = JavaFile.builder(TYPEPACKAGE, currentClass).build();
                javaFile.writeTo(new File("src/main/java/"));
            }
        }
    }
}
