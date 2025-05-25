package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * OrderStatus representing that payment is due on an order. */
@Vertex
@JsonldType("http://schema.org/OrderPaymentDue")
public class OrderPaymentDue extends OrderStatus {
}
