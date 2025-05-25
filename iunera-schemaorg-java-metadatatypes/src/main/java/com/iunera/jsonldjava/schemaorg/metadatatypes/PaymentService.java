package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A Service to transfer funds from a person or organization to a beneficiary person or organization. */
@Vertex
@JsonldType("http://schema.org/PaymentService")
public class PaymentService extends FinancialProduct {
}
