package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Indicates that the item is available only online. */
@Vertex
@JsonldType("http://schema.org/OnlineOnly")
public class OnlineOnly extends ItemAvailability {
}
