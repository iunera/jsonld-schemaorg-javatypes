package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of participating in exertive activity for the purposes of improving health and fitness. */
@Vertex
@JsonldType("http://schema.org/ExerciseAction")
public class ExerciseAction extends PlayAction {
  /**
   * A sub property of location. The final location of the object or the agent after the action. */
  @JsonldProperty("http://schema.org/toLocation")
  public Place toLocation;

  /**
   * The distance travelled, e.g. exercising or travelling. */
  @JsonldProperty("http://schema.org/distance")
  public Distance distance;

  /**
   * A sub property of participant. The opponent on this action. */
  @JsonldProperty("http://schema.org/opponent")
  public Person opponent;

  /**
   * A sub property of location. The original location of the object or the agent before the action. */
  @JsonldProperty("http://schema.org/fromLocation")
  public Place fromLocation;

  /**
   * A sub property of participant. The sports team that participated on this action. */
  @JsonldProperty("http://schema.org/sportsTeam")
  public SportsTeam sportsTeam;

  /**
   * A sub property of location. The sports event where this action occurred. */
  @JsonldProperty("http://schema.org/sportsEvent")
  public SportsEvent sportsEvent;

  /**
   * A sub property of location. The sports activity location where this action occurred. */
  @JsonldProperty("http://schema.org/sportsActivityLocation")
  public SportsActivityLocation sportsActivityLocation;

  /**
   * A sub property of location. The course where this action was taken. */
  @JsonldProperty("http://schema.org/exerciseCourse")
  public Place exerciseCourse;
}
