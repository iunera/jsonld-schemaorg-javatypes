package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The airline boards by zones of the plane. */
@Vertex
@JsonldType("http://schema.org/ZoneBoardingPolicy")
public class ZoneBoardingPolicy extends BoardingPolicyType {
}
