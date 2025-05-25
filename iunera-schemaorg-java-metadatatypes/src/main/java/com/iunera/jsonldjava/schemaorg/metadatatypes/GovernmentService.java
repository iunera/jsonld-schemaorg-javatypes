package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A service provided by a government organization, e.g. food stamps, veterans benefits, etc. */
@Vertex
@JsonldType("http://schema.org/GovernmentService")
public class GovernmentService extends Service {
  /**
   * The operating organization, if different from the provider.  This enables the representation of services that are provided by an organization, but operated by another organization like a subcontractor. */
  @JsonldProperty("http://schema.org/serviceOperator")
  public Organization serviceOperator;
}
