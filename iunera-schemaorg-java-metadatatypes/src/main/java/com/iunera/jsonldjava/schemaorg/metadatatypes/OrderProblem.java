package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * OrderStatus representing that there is a problem with the order. */
@Vertex
@JsonldType("http://schema.org/OrderProblem")
public class OrderProblem extends OrderStatus {
}
