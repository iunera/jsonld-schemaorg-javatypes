package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A collection of music tracks. */
@Vertex
@JsonldType("http://schema.org/MusicAlbum")
public class MusicAlbum extends MusicPlaylist {
  /**
   * Classification of the album by it's type of content: soundtrack, live album, studio album, etc. */
  @JsonldProperty("http://schema.org/albumProductionType")
  public MusicAlbumProductionType albumProductionType;

  /**
   * The kind of release which this album is: single, EP or album. */
  @JsonldProperty("http://schema.org/albumReleaseType")
  public MusicAlbumReleaseType albumReleaseType;

  /**
   * The artist that performed this album or recording. */
  @JsonldProperty("http://schema.org/byArtist")
  public MusicGroup byArtist;
}
