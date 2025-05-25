package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The steering position is on the left side of the vehicle (viewed from the main direction of driving). */
@Vertex
@JsonldType("http://schema.org/LeftHandDriving")
public class LeftHandDriving extends SteeringPositionValue {
}
