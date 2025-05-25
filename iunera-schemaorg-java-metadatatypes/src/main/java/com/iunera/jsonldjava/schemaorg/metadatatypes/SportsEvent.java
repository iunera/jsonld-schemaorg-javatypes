package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * Event type: Sports event. */
@Vertex
@JsonldType("http://schema.org/SportsEvent")
public class SportsEvent extends Event {
  /**
   * The away team in a sports event. */
  @JsonldProperty("http://schema.org/awayTeam")
  public List<Person> awayTeamPerson;

  /**
   * The away team in a sports event. */
  @JsonldProperty("http://schema.org/awayTeam")
  public List<SportsTeam> awayTeamSportsTeam;

  /**
   * A competitor in a sports event. */
  @JsonldProperty("http://schema.org/competitor")
  public List<Person> competitorPerson;

  /**
   * The home team in a sports event. */
  @JsonldProperty("http://schema.org/homeTeam")
  public List<Person> homeTeamPerson;

  /**
   * The home team in a sports event. */
  @JsonldProperty("http://schema.org/homeTeam")
  public List<SportsTeam> homeTeamSportsTeam;

  /**
   * A competitor in a sports event. */
  @JsonldProperty("http://schema.org/competitor")
  public List<SportsTeam> competitorSportsTeam;
}
