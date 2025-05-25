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

import com.squareup.javapoet.*;

import javax.lang.model.element.Modifier;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Utility class for processing JSON-LD documents to identify and extract properties of Schema.org RDF classes.
 * It determines the properties associated with a given JSON-LD node and provides methods to access their metadata.
 * Note that some properties may not be fully captured due to the complexity of Schema.org definitions.
 *
 * @author Tim Frey
 */
public class RDFProperty {

    /**
     * The JSON-LD entity map representing the property node.
     */
    private final Map<String, Object> entity;
    /**
     * Indicates if the node is a Schema.org property (starts with lowercase or marked as RDF property).
     */
    private boolean isProperty = false;
    /**
     * Indicates if the property is deprecated (superseded by another property).
     */
    private boolean isDeprecated = false;
    /**
     * The name of the property, derived from its Schema.org identifier.
     */
    private String name;

    /**
     * Javadoc comment for the property (currently unused, reserved for future enhancements).
     */
    private String javadoc;

    /**
     * List of Schema.org types (currently unused, reserved for future type handling).
     */
    private List<String> Type;

    /**
     * Indicates if the property is an array (currently unused, reserved for future array handling).
     */
    private boolean isArray;

    /**
     * Indicates if the property has a reversible relationship (e.g., owns → ownedBy).
     */
    private boolean isReversible;

    /**
     * Indicates if the property targets multiple Schema.org types (currently unused, reserved for future enhancements).
     */
    private boolean hasDifferentTargetTypes;

    /**
     * Constructs an RDFProperty instance from a JSON-LD entity map.
     * Determines if the node is a Schema.org property and extracts its name and deprecation status.
     *
     * @param entity A map representing the JSON-LD node.
     */
    public RDFProperty(Map<String, Object> entity) {
        this.entity = entity;
        if (entity.containsKey("http://schema.org/supersededBy")) {
            isDeprecated = true;
        }
        String type = entity.get("@type").toString().toLowerCase();
        if (type.equals("rdf:property") || type.equals("http://www.w3.org/1999/02/22-rdf-syntax-ns#Property")) {
            isProperty = true;
            return;
        }

        String entityName = entity.get("@id").toString().replace("http://schema.org/", "");
        if (Character.isLowerCase(entityName.charAt(0))) {
            isProperty = true;
            name = entityName;
        } else {
            isProperty = false;
        }
    }

    /**
     * Checks if the node is a Schema.org property.
     *
     * @return {@code true} if the node is a property, {@code false} otherwise.
     */
    public boolean isProperty() {
        return isProperty;
    }

    /**
     * Checks if the property is deprecated.
     *
     * @return {@code true} if the property is deprecated, {@code false} otherwise.
     */
    public boolean isDeprecated() {
        return isDeprecated;
    }

    /**
     * Returns the name of the property.
     *
     * @return The property name (e.g., "givenName").
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the Schema.org entities (classes) that this property applies to, based on domainIncludes.
     *
     * @return A set of entity names (e.g., "Person", "Organization").
     */
    public Set<String> getEntities() {
        Object domainIncludes = entity.get("http://schema.org/domainIncludes");
        Set<String> ret = new HashSet<>();

        if (domainIncludes == null) {
            return ret;
        }
        if (domainIncludes instanceof List) {
            for (Object type : ((List<?>) domainIncludes)) {
                ret.add(((Map<String, String>) type).get("@id").replace("http://schema.org/", ""));
            }
        } else {
            ret.add(((Map<String, String>) domainIncludes).get("@id").replace("http://schema.org/", ""));
        }

        return ret;
    }

    /**
     * Checks if the property has an inverse relationship (e.g., owns → ownedBy).
     *
     * @return {@code true} if an inverse property exists, {@code false} otherwise.
     */
    public boolean hasInverse() {
        return entity.containsKey("http://schema.org/inverseOf");
    }

    /**
     * Returns the name of the inverse property, if it exists.
     *
     * @return The inverse property name (e.g., "ownedBy" for "owns"), or an empty string if none exists.
     */
    public String getInverse() {
        return entity.containsKey("http://schema.org/inverseOf")
                ? entity.get("http://schema.org/inverseOf").toString()
                .replace("@id=http://schema.org/", "").replace("}", "").replace("{", "")
                : "";
    }

    /**
     * Generates Java field specifications for the property, including annotations and Javadoc.
     * Supports single and multiple range types (via rangeIncludes) and array fields.
     *
     * @return A set of {@link FieldSpec} objects representing the property’s Java fields.
     */
    public Set<FieldSpec> getFields() {
        Set<FieldSpec> ret = new HashSet<>();
        Object commentObj = entity.get("http://www.w3.org/2000/01/rdf-schema#comment");
        String comment = (commentObj != null) ? commentObj.toString().replace("$", "") : "";
        boolean isMultiField = entity.get("http://schema.org/rangeIncludes").toString().contains("[");

        String field = entity.get("http://schema.org/rangeIncludes").toString()
                .replace("http://schema.org/", "").replace("}", "").replace("{", "")
                .replace("[", "").replace("]", "").replace("@id=", "");
        if (field.equals("http://www.w3.org/2000/01/rdf-schema#Class")) {
            field = "Object";
        }
        String[] types = field.split(",");
        AnnotationSpec annotationSpec = AnnotationSpec.builder(ClassName.get(
                        "com.iunera.jsonldjava.schemaorg.associations", "JsonldProperty"))
                .addMember("value", "\"$L\"", entity.get("@id").toString())
                .build();

        if (types.length < 2) {
            String type = types[0].trim();
            if (isMultiField) {
                TypeName typeName = ParameterizedTypeName.get(
                        ClassName.get(Set.class),
                        ClassName.get("com.iunera.jsonldjava.schemaorg.metadatatypes", transformType(type)));
                ret.add(FieldSpec.builder(typeName, name.trim(), Modifier.PUBLIC)
                        .addAnnotation(annotationSpec)
                        .addJavadoc("$L", comment)
                        .build());
            } else {
                ClassName clazz = ClassName.get("com.iunera.jsonldjava.schemaorg.metadatatypes", transformType(type));
                ret.add(FieldSpec.builder(clazz, name.trim(), Modifier.PUBLIC)
                        .addAnnotation(annotationSpec)
                        .addJavadoc("$L", comment)
                        .build());
            }
        } else {
            for (String type : types) {
                type = type.trim();
                String fieldName = name.trim() + Character.toUpperCase(type.charAt(0)) + type.substring(1);
                if (isMultiField) {
                    TypeName typeName = ParameterizedTypeName.get(
                            ClassName.get(List.class),
                            ClassName.get("com.iunera.jsonldjava.schemaorg.metadatatypes", transformType(type)));
                    ret.add(FieldSpec.builder(typeName, fieldName, Modifier.PUBLIC)
                            .addAnnotation(annotationSpec)
                            .addJavadoc("$L", comment)
                            .build());
                } else {
                    ClassName clazz = ClassName.get("com.iunera.jsonldjava.schemaorg.metadatatypes", transformType(type));
                    ret.add(FieldSpec.builder(clazz, fieldName, Modifier.PUBLIC)
                            .addAnnotation(annotationSpec)
                            .addJavadoc("$L", comment)
                            .build());
                }
            }
        }

        return ret;
    }

    /**
     * Transforms a Schema.org type to its corresponding Java type.
     * Maps basic Schema.org datatypes (e.g., Text, Number) to Java equivalents (e.g., String, BigDecimal).
     *
     * @param type The Schema.org type name.
     * @return The corresponding Java type name, or the original type if no mapping exists.
     */
    public String transformType(String type) {
        switch (type) {
            case "Boolean":
                return "Boolean";
            case "Text":
                return "String";
            case "Date":
            case "DateTime":
                return "java.util.Date";
            case "URL":
                return "java.net.URL";
            case "Number":
                return "java.math.BigDecimal";
            case "Time":
                return "String";
            case "Integer":
                return "Integer";
            case "Float":
                return "Float";
            default:
                return type;
        }
    }
}
