package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A legislative building&#x2014;for example, the state capitol. */
@Vertex
@JsonldType("http://schema.org/LegislativeBuilding")
public class LegislativeBuilding extends GovernmentBuilding {
}
