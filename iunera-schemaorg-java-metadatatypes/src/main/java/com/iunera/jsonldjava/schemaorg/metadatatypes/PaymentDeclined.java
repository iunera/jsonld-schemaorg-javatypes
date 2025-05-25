package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The payee received the payment, but it was declined for some reason. */
@Vertex
@JsonldType("http://schema.org/PaymentDeclined")
public class PaymentDeclined extends PaymentStatusType {
}
