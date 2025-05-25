package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * OrderStatus representing availability of an order for pickup. */
@Vertex
@JsonldType("http://schema.org/OrderPickupAvailable")
public class OrderPickupAvailable extends OrderStatus {
}
