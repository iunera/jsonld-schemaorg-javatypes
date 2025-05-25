package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A movie theater. */
@Vertex
@JsonldType("http://schema.org/MovieTheater")
public class MovieTheater extends EntertainmentBusiness {
  /**
   * This one of additional original supertypes as defined at schema.org. However, Java does not support multi class inheritance and therefore a composition was used. */
  @JsonldProperty("http://schema.org/CivicStructure")
  public CivicStructure civicStructure;

  /**
   * The number of screens in the movie theater. */
  @JsonldProperty("http://schema.org/screenCount")
  public java.math.BigDecimal screenCount;
}
