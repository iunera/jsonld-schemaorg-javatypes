package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Indicates that the item has been discontinued. */
@Vertex
@JsonldType("http://schema.org/Discontinued")
public class Discontinued extends ItemAvailability {
}
