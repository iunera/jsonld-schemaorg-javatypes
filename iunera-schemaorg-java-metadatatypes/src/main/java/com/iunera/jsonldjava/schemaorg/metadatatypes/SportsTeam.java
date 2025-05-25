package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Organization: Sports team. */
@Vertex
@JsonldType("http://schema.org/SportsTeam")
public class SportsTeam extends SportsOrganization {
  /**
   * A person that acts as performing member of a sports team; a player as opposed to a coach. */
  @JsonldProperty("http://schema.org/athlete")
  public Person athlete;

  /**
   * A person that acts in a coaching role for a sports team. */
  @JsonldProperty("http://schema.org/coach")
  public Person coach;
}
