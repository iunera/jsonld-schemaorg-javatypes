package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * OrderStatus representing cancellation of an order. */
@Vertex
@JsonldType("http://schema.org/OrderCancelled")
public class OrderCancelled extends OrderStatus {
}
