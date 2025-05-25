package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Web applications. */
@Vertex
@JsonldType("http://schema.org/WebApplication")
public class WebApplication extends SoftwareApplication {
  /**
   * Specifies browser requirements in human-readable text. For example, 'requires HTML5 support'. */
  @JsonldProperty("http://schema.org/browserRequirements")
  public String browserRequirements;
}
