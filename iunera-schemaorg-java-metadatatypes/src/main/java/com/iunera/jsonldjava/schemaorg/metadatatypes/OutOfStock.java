package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Indicates that the item is out of stock. */
@Vertex
@JsonldType("http://schema.org/OutOfStock")
public class OutOfStock extends ItemAvailability {
}
