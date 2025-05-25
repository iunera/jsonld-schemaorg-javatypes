package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A movie. */
@Vertex
@JsonldType("http://schema.org/Movie")
public class Movie extends CreativeWork {
  /**
   * The trailer of a movie or tv/radio series, season, episode, etc. */
  @JsonldProperty("http://schema.org/trailer")
  public VideoObject trailer;

  /**
   * The country of the principal offices of the production company or individual responsible for the movie or program. */
  @JsonldProperty("http://schema.org/countryOfOrigin")
  public Country countryOfOrigin;

  /**
   * The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>. */
  @JsonldProperty("http://schema.org/duration")
  public Duration duration;

  /**
   * The composer of the soundtrack. */
  @JsonldProperty("http://schema.org/musicBy")
  public List<Person> musicByPerson;

  /**
   * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip. */
  @JsonldProperty("http://schema.org/director")
  public Person director;

  /**
   * Languages in which subtitles/captions are available, in <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard format</a>. */
  @JsonldProperty("http://schema.org/subtitleLanguage")
  public List<String> subtitleLanguageText;

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
   * Languages in which subtitles/captions are available, in <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard format</a>. */
  @JsonldProperty("http://schema.org/subtitleLanguage")
  public List<Language> subtitleLanguageLanguage;
}
