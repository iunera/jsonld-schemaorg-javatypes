package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Indicates that the item is available for ordering and delivery before general availability. */
@Vertex
@JsonldType("http://schema.org/PreSale")
public class PreSale extends ItemAvailability {
}
