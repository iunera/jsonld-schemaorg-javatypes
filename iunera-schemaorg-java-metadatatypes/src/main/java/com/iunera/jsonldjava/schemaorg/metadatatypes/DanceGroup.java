package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A dance group&#x2014;for example, the Alvin Ailey Dance Theater or Riverdance. */
@Vertex
@JsonldType("http://schema.org/DanceGroup")
public class DanceGroup extends PerformingGroup {
}
