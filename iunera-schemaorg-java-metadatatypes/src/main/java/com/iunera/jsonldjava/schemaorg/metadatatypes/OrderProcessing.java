package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * OrderStatus representing that an order is being processed. */
@Vertex
@JsonldType("http://schema.org/OrderProcessing")
public class OrderProcessing extends OrderStatus {
}
