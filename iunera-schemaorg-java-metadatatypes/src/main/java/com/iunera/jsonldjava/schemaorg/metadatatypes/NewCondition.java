package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Indicates that the item is new. */
@Vertex
@JsonldType("http://schema.org/NewCondition")
public class NewCondition extends OfferItemCondition {
}
