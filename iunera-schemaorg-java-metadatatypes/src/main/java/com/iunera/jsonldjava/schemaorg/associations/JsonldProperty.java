package com.iunera.jsonldjava.schemaorg.associations;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Inherited
public @interface JsonldProperty {
    String value();
}
