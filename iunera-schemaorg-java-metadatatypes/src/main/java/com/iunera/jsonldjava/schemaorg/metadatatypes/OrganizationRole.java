package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A subclass of Role used to describe roles within organizations. */
@Vertex
@JsonldType("http://schema.org/OrganizationRole")
public class OrganizationRole extends Role {
  /**
   * A number associated with a role in an organization, for example, the number on an athlete's jersey. */
  @JsonldProperty("http://schema.org/numberedPosition")
  public java.math.BigDecimal numberedPosition;
}
