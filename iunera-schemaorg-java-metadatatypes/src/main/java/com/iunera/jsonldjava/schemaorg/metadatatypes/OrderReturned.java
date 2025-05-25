package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * OrderStatus representing that an order has been returned. */
@Vertex
@JsonldType("http://schema.org/OrderReturned")
public class OrderReturned extends OrderStatus {
}
