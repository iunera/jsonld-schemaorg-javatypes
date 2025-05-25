package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A theater group or company, for example, the Royal Shakespeare Company or Druid Theatre. */
@Vertex
@JsonldType("http://schema.org/TheaterGroup")
public class TheaterGroup extends PerformingGroup {
}
