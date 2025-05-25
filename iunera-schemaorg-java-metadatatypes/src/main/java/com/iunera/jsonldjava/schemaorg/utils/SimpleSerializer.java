package com.iunera.jsonldjava.schemaorg.utils;
import com.github.jsonldjava.core.JsonLdOptions;
import com.github.jsonldjava.core.JsonLdProcessor;
import com.github.jsonldjava.utils.JsonUtils;
import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleSerializer {
     /**
     * Serializes an object to a JSON-LD string.
     *
     * @param object The object to serialize (e.g., Person, Product).
     * @return A JSON-LD string.
     * @throws Exception If serialization fails.
     */
    public static String toJsonLd(Object object) throws Exception {
        if (object == null) {
            return null;
        }

        // Create the JSON-LD map
        Map<String, Object> jsonLdMap = new HashMap<>();
        jsonLdMap.put("@context", "http://schema.org");

        // Get the @JsonldType annotation
        JsonldType typeAnnotation = object.getClass().getAnnotation(JsonldType.class);
        if (typeAnnotation != null) {
            jsonLdMap.put("@type", typeAnnotation.value().replace("http://schema.org/", ""));
        } else {
            jsonLdMap.put("@type", object.getClass().getSimpleName());
        }

        // Process fields with @JsonldProperty
        for (Field field : object.getClass().getDeclaredFields()) {
            JsonldProperty propertyAnnotation = field.getAnnotation(JsonldProperty.class);
            if (propertyAnnotation != null) {
                field.setAccessible(true);
                Object value = field.get(object);
                if (value != null) {
                    String propertyName = propertyAnnotation.value().replace("http://schema.org/", "");
                    jsonLdMap.put(propertyName, serializeValue(value));
                }
            }
        }

        // Compact the JSON-LD
        JsonLdOptions options = new JsonLdOptions();
        Object compact = JsonLdProcessor.compact(jsonLdMap, new HashMap<>(), options);
        return JsonUtils.toPrettyString(compact);
    }

    /**
     * Serializes a value (primitive, object, or collection) to JSON-LD format.
     *
     * @param value The value to serialize.
     * @return The serialized value.
     * @throws Exception If serialization fails.
     */
    private static Object serializeValue(Object value) throws Exception {
        if (value == null) {
            return null;
        }

        // Handle collections (e.g., List)
        if (value instanceof List) {
            List<Object> serializedList = new ArrayList<>();
            for (Object item : (List<?>) value) {
                serializedList.add(serializeValue(item));
            }
            return serializedList;
        }

        // Handle annotated objects (e.g., PostalAddress)
        if (value.getClass().getAnnotation(JsonldType.class) != null) {
            Map<String, Object> nestedMap = new HashMap<>();
            JsonldType typeAnnotation = value.getClass().getAnnotation(JsonldType.class);
            if (typeAnnotation != null) {
                nestedMap.put("@type", typeAnnotation.value().replace("http://schema.org/", ""));
            }
            for (Field field : value.getClass().getDeclaredFields()) {
                JsonldProperty propertyAnnotation = field.getAnnotation(JsonldProperty.class);
                if (propertyAnnotation != null) {
                    field.setAccessible(true);
                    Object fieldValue = field.get(value);
                    if (fieldValue != null) {
                        String propertyName = propertyAnnotation.value().replace("http://schema.org/", "");
                        nestedMap.put(propertyName, serializeValue(fieldValue));
                    }
                }
            }
            return nestedMap;
        }

        // Handle primitives and simple types
        return value;
    }

}
