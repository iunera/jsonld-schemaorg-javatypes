package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A screening of a movie or other video. */
@Vertex
@JsonldType("http://schema.org/ScreeningEvent")
public class ScreeningEvent extends Event {
  /**
   * The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.). */
  @JsonldProperty("http://schema.org/videoFormat")
  public String videoFormat;

  /**
   * Languages in which subtitles/captions are available, in <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard format</a>. */
  @JsonldProperty("http://schema.org/subtitleLanguage")
  public List<String> subtitleLanguageText;

  /**
   * Languages in which subtitles/captions are available, in <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard format</a>. */
  @JsonldProperty("http://schema.org/subtitleLanguage")
  public List<Language> subtitleLanguageLanguage;

  /**
   * The movie presented during this event. */
  @JsonldProperty("http://schema.org/workPresented")
  public Movie workPresented;
}
