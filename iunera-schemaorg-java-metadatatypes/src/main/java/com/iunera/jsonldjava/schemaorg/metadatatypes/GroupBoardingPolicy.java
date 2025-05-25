package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The airline boards by groups based on check-in time, priority, etc. */
@Vertex
@JsonldType("http://schema.org/GroupBoardingPolicy")
public class GroupBoardingPolicy extends BoardingPolicyType {
}
