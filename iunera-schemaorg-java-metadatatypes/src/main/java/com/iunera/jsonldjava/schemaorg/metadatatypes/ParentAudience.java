package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A set of characteristics describing parents, who can be interested in viewing some content. */
@Vertex
@JsonldType("http://schema.org/ParentAudience")
public class ParentAudience extends PeopleAudience {
  /**
   * Maximal age of the child. */
  @JsonldProperty("http://schema.org/childMaxAge")
  public java.math.BigDecimal childMaxAge;

  /**
   * Minimal age of the child. */
  @JsonldProperty("http://schema.org/childMinAge")
  public java.math.BigDecimal childMinAge;
}
