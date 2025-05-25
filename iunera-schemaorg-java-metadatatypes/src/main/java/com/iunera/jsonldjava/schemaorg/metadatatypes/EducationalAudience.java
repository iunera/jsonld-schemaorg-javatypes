package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An EducationalAudience. */
@Vertex
@JsonldType("http://schema.org/EducationalAudience")
public class EducationalAudience extends Audience {
  /**
   * An educationalRole of an EducationalAudience. */
  @JsonldProperty("http://schema.org/educationalRole")
  public String educationalRole;
}
