package com.iunera.jsonldjava.schemaorg.utils;


import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FieldMapper {

    private final Map<String, String> fieldMappings;
    private final Set<String> ignoreFields;
  
    public FieldMapper(Map<String, String> fieldMappings){
        this.fieldMappings = fieldMappings != null ? fieldMappings : new HashMap<>();
        this.ignoreFields =new HashSet<>();
    }
    public FieldMapper(Map<String, String> fieldMappings,Set<String> ignoreFields) {
        this.fieldMappings = fieldMappings != null ? fieldMappings : new HashMap<>();
        this.ignoreFields = ignoreFields != null ? ignoreFields : new HashSet<>();
    }

    /**
     * Copies fields from a source object to a target object based on a field name mapping.
     *
     * @param to The target object (e.g., Person).
     * @param from The source object (e.g., DTO).
     * @param fieldMappings Map of source field names to target field names.
     * @param <T> Target object type.
     * @param <F> Source object type.
     */
    public <T, F> void copyFieldsWithMapping(T to, F from) {
        // Handle null source
        if (from == null) {
            return;
        }

        Class<?> fromClass = from.getClass();
        Class<?> toClass = to.getClass();
        List<Field> fromFields = getAllModelFields(fromClass);

        if (fromFields != null) {
            for (Field fromField : fromFields) {
                if (ignoreFields.contains(fromField.getName())) {
                    continue;
                }

                // Get the target field name from the mapping
                String targetFieldName = fieldMappings.getOrDefault(fromField.getName(), fromField.getName());
                try {
                    fromField.setAccessible(true);
                    Field toField = toClass.getDeclaredField(targetFieldName);
                    toField.setAccessible(true);
                    Object value = fromField.get(from);
                    if (value != null) {
                        toField.set(to, value);
                    }
                } catch (NoSuchFieldException e) {
                    // Target field not found; skip silently
                    System.err.println("Target field not found: " + targetFieldName);
                } catch (IllegalAccessException e) {
                    System.err.println("Access error for field: " + fromField.getName());
                    e.printStackTrace();
                } catch (NullPointerException e) {
                    System.err.println("Null value error for field: " + fromField.getName());
                    e.printStackTrace();
                } catch (SecurityException e) {
                    System.err.println("Security error for field: " + fromField.getName());
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Retrieves all declared fields of a class, including inherited ones.
     *
     * @param clazz The class to inspect.
     * @return List of fields.
     */
    private List<Field> getAllModelFields(Class<?> clazz) {
        List<Field> fields = new ArrayList<>();
        while (clazz != null && !clazz.equals(Object.class)) {
            fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
            clazz = clazz.getSuperclass();
        }
        return fields;
    }

   
}
