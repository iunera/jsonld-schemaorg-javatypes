package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Season dedicated to TV broadcast and associated online delivery. */
@Vertex
@JsonldType("http://schema.org/TVSeason")
public class TVSeason extends CreativeWork {
  /**
   * This one of additional original supertypes as defined at schema.org. However, Java does not support multi class inheritance and therefore a composition was used. */
  @JsonldProperty("http://schema.org/CreativeWorkSeason")
  public CreativeWorkSeason creativeWorkSeason;

  /**
   * The country of the principal offices of the production company or individual responsible for the movie or program. */
  @JsonldProperty("http://schema.org/countryOfOrigin")
  public Country countryOfOrigin;
}
