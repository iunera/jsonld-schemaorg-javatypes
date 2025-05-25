package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The payment has been received and processed. */
@Vertex
@JsonldType("http://schema.org/PaymentComplete")
public class PaymentComplete extends PaymentStatusType {
}
