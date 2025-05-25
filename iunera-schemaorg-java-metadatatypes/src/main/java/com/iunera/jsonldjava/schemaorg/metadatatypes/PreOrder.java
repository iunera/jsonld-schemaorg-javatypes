package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Indicates that the item is available for pre-order, but will be delivered when generally available. */
@Vertex
@JsonldType("http://schema.org/PreOrder")
public class PreOrder extends ItemAvailability {
}
