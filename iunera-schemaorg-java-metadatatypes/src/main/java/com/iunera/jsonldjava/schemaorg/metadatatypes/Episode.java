package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A media episode (e.g. TV, radio, video game) which can be part of a series or season. */
@Vertex
@JsonldType("http://schema.org/Episode")
public class Episode extends CreativeWork {
  /**
   * The series to which this episode or season belongs. */
  @JsonldProperty("http://schema.org/partOfSeries")
  public CreativeWorkSeries partOfSeries;

  /**
   * The trailer of a movie or tv/radio series, season, episode, etc. */
  @JsonldProperty("http://schema.org/trailer")
  public VideoObject trailer;

  /**
   * The season to which this episode belongs. */
  @JsonldProperty("http://schema.org/partOfSeason")
  public CreativeWorkSeason partOfSeason;

  /**
   * Position of the episode within an ordered group of episodes. */
  @JsonldProperty("http://schema.org/episodeNumber")
  public List<Integer> episodeNumberInteger;

  /**
   * The composer of the soundtrack. */
  @JsonldProperty("http://schema.org/musicBy")
  public List<Person> musicByPerson;

  /**
   * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip. */
  @JsonldProperty("http://schema.org/director")
  public Person director;

  /**
   * The production company or studio responsible for the item e.g. series, video game, episode etc. */
  @JsonldProperty("http://schema.org/productionCompany")
  public Organization productionCompany;

  /**
   * The composer of the soundtrack. */
  @JsonldProperty("http://schema.org/musicBy")
  public List<MusicGroup> musicByMusicGroup;

  /**
   * Position of the episode within an ordered group of episodes. */
  @JsonldProperty("http://schema.org/episodeNumber")
  public List<String> episodeNumberText;

  /**
   * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip. */
  @JsonldProperty("http://schema.org/actor")
  public Person actor;
}
