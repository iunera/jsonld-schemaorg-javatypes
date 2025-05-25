package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A TV episode which can be part of a series or season. */
@Vertex
@JsonldType("http://schema.org/TVEpisode")
public class TVEpisode extends Episode {
  /**
   * Languages in which subtitles/captions are available, in <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard format</a>. */
  @JsonldProperty("http://schema.org/subtitleLanguage")
  public List<String> subtitleLanguageText;

  /**
   * The country of the principal offices of the production company or individual responsible for the movie or program. */
  @JsonldProperty("http://schema.org/countryOfOrigin")
  public Country countryOfOrigin;

  /**
   * Languages in which subtitles/captions are available, in <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard format</a>. */
  @JsonldProperty("http://schema.org/subtitleLanguage")
  public List<Language> subtitleLanguageLanguage;
}
