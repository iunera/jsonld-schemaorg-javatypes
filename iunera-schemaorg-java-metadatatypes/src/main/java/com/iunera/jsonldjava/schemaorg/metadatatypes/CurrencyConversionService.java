package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A service to convert funds from one currency to another currency. */
@Vertex
@JsonldType("http://schema.org/CurrencyConversionService")
public class CurrencyConversionService extends FinancialProduct {
}
