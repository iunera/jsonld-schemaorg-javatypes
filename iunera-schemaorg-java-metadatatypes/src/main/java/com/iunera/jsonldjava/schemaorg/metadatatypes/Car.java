package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A car is a wheeled, self-powered motor vehicle used for transportation. */
@Vertex
@JsonldType("http://schema.org/Car")
public class Car extends Vehicle {
}
