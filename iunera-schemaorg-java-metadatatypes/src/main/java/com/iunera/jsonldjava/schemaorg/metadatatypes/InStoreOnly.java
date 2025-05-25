package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Indicates that the item is available only at physical locations. */
@Vertex
@JsonldType("http://schema.org/InStoreOnly")
public class InStoreOnly extends ItemAvailability {
}
