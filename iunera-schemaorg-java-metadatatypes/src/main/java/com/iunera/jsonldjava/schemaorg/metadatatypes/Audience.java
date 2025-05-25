package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Intended audience for an item, i.e. the group for whom the item was created. */
@Vertex
@JsonldType("http://schema.org/Audience")
public class Audience extends Intangible {
  /**
   * The target group associated with a given audience (e.g. veterans, car owners, musicians, etc.). */
  @JsonldProperty("http://schema.org/audienceType")
  public String audienceType;

  /**
   * The geographic area associated with the audience. */
  @JsonldProperty("http://schema.org/geographicArea")
  public AdministrativeArea geographicArea;
}
