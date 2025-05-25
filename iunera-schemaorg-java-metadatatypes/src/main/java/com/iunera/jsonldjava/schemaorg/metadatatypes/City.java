package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A city or town. */
@Vertex
@JsonldType("http://schema.org/City")
public class City extends AdministrativeArea {
}
