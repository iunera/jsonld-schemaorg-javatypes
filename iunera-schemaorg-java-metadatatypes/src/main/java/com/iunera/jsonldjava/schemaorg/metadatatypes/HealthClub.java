package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A health club. */
@Vertex
@JsonldType("http://schema.org/HealthClub")
public class HealthClub extends SportsActivityLocation {
  /**
   * This one of additional original supertypes as defined at schema.org. However, Java does not support multi class inheritance and therefore a composition was used. */
  @JsonldProperty("http://schema.org/HealthAndBeautyBusiness")
  public HealthAndBeautyBusiness healthAndBeautyBusiness;
}
