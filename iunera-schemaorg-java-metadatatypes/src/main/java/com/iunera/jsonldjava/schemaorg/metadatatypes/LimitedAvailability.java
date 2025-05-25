package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Indicates that the item has limited availability. */
@Vertex
@JsonldType("http://schema.org/LimitedAvailability")
public class LimitedAvailability extends ItemAvailability {
}
