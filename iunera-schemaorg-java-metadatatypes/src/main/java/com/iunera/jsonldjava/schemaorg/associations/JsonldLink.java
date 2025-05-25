package com.iunera.jsonldjava.schemaorg.associations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Repeatable(JsonldLinks.class)
public @interface JsonldLink {
    String rel();
    String name();
    String href();
}
