package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A series of movies. Included movies can be indicated with the hasPart property. */
@Vertex
@JsonldType("http://schema.org/MovieSeries")
public class MovieSeries extends CreativeWorkSeries {
  /**
   * The trailer of a movie or tv/radio series, season, episode, etc. */
  @JsonldProperty("http://schema.org/trailer")
  public VideoObject trailer;

  /**
   * The production company or studio responsible for the item e.g. series, video game, episode etc. */
  @JsonldProperty("http://schema.org/productionCompany")
  public Organization productionCompany;

  /**
   * The composer of the soundtrack. */
  @JsonldProperty("http://schema.org/musicBy")
  public List<MusicGroup> musicByMusicGroup;

  /**
   * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip. */
  @JsonldProperty("http://schema.org/actor")
  public Person actor;

  /**
   * The composer of the soundtrack. */
  @JsonldProperty("http://schema.org/musicBy")
  public List<Person> musicByPerson;

  /**
   * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip. */
  @JsonldProperty("http://schema.org/director")
  public Person director;
}
