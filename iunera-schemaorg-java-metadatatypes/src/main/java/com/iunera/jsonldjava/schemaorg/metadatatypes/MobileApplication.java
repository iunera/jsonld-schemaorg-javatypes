package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A software application designed specifically to work well on a mobile device such as a telephone. */
@Vertex
@JsonldType("http://schema.org/MobileApplication")
public class MobileApplication extends SoftwareApplication {
  /**
   * Specifies specific carrier(s) requirements for the application (e.g. an application may only work on a specific carrier network). */
  @JsonldProperty("http://schema.org/carrierRequirements")
  public String carrierRequirements;
}
