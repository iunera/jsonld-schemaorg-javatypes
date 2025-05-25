package com.iunera.jsonldjava.schemaorg.associations;

import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface JsonldLinks {
    JsonldLink[] value();
}
