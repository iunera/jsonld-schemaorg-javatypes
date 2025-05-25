package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * OrderStatus representing successful delivery of an order. */
@Vertex
@JsonldType("http://schema.org/OrderDelivered")
public class OrderDelivered extends OrderStatus {
}
