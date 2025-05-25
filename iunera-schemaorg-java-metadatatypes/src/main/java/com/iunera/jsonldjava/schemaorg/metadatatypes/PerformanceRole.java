package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A PerformanceRole is a Role that some entity places with regard to a theatrical performance, e.g. in a Movie, TVSeries etc. */
@Vertex
@JsonldType("http://schema.org/PerformanceRole")
public class PerformanceRole extends Role {
  /**
   * The name of a character played in some acting or performing role, i.e. in a PerformanceRole. */
  @JsonldProperty("http://schema.org/characterName")
  public String characterName;
}
