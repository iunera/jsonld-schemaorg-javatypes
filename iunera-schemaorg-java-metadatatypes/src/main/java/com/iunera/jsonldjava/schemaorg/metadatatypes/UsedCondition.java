package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Indicates that the item is used. */
@Vertex
@JsonldType("http://schema.org/UsedCondition")
public class UsedCondition extends OfferItemCondition {
}
