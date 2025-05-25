package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of participating in performance arts. */
@Vertex
@JsonldType("http://schema.org/PerformAction")
public class PerformAction extends PlayAction {
  /**
   * A sub property of location. The entertainment business where the action occurred. */
  @JsonldProperty("http://schema.org/entertainmentBusiness")
  public EntertainmentBusiness entertainmentBusiness;
}
