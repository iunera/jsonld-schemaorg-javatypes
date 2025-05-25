package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * Represents the collection of all sports organizations, including sports teams, governing bodies, and sports associations. */
@Vertex
@JsonldType("http://schema.org/SportsOrganization")
public class SportsOrganization extends Organization {
  /**
   * A type of sport (e.g. Baseball). */
  @JsonldProperty("http://schema.org/sport")
  public List<String> sportText;

  /**
   * A type of sport (e.g. Baseball). */
  @JsonldProperty("http://schema.org/sport")
  public List<java.net.URL> sportURL;
}
