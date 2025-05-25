package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The payment is due, but still within an acceptable time to be received. */
@Vertex
@JsonldType("http://schema.org/PaymentDue")
public class PaymentDue extends PaymentStatusType {
}
