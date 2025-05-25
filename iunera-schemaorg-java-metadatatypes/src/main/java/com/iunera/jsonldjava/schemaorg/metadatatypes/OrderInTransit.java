package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * OrderStatus representing that an order is in transit. */
@Vertex
@JsonldType("http://schema.org/OrderInTransit")
public class OrderInTransit extends OrderStatus {
}
