package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Indicates that the item is damaged. */
@Vertex
@JsonldType("http://schema.org/DamagedCondition")
public class DamagedCondition extends OfferItemCondition {
}
