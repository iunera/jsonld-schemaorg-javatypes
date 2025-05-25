package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An agent quotes/estimates/appraises an object/product/service with a price at a location/store. */
@Vertex
@JsonldType("http://schema.org/QuoteAction")
public class QuoteAction extends TradeAction {
}
