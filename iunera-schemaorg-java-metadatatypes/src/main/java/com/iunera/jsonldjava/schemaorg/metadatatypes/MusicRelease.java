package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A MusicRelease is a specific release of a music album. */
@Vertex
@JsonldType("http://schema.org/MusicRelease")
public class MusicRelease extends MusicPlaylist {
  /**
   * The catalog number for the release. */
  @JsonldProperty("http://schema.org/catalogNumber")
  public String catalogNumber;

  /**
   * The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>. */
  @JsonldProperty("http://schema.org/duration")
  public Duration duration;

  /**
   * The group the release is credited to if different than the byArtist. For example, Red and Blue is credited to "Stefani Germanotta Band", but by Lady Gaga. */
  @JsonldProperty("http://schema.org/creditedTo")
  public List<Organization> creditedToOrganization;

  /**
   * The group the release is credited to if different than the byArtist. For example, Red and Blue is credited to "Stefani Germanotta Band", but by Lady Gaga. */
  @JsonldProperty("http://schema.org/creditedTo")
  public List<Person> creditedToPerson;

  /**
   * The label that issued the release. */
  @JsonldProperty("http://schema.org/recordLabel")
  public Organization recordLabel;

  /**
   * Format of this release (the type of recording media used, ie. compact disc, digital media, LP, etc.). */
  @JsonldProperty("http://schema.org/musicReleaseFormat")
  public MusicReleaseFormatType musicReleaseFormat;

  /**
   * The album this is a release of. */
  @JsonldProperty("http://schema.org/releaseOf")
  public MusicAlbum releaseOf;
}
