package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The payment is due and considered late. */
@Vertex
@JsonldType("http://schema.org/PaymentPastDue")
public class PaymentPastDue extends PaymentStatusType {
}
