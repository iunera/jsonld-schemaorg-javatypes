package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Indicates that the item is refurbished. */
@Vertex
@JsonldType("http://schema.org/RefurbishedCondition")
public class RefurbishedCondition extends OfferItemCondition {
}
