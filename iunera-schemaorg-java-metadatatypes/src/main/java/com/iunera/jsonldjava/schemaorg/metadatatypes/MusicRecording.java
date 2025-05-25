package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A music recording (track), usually a single song. */
@Vertex
@JsonldType("http://schema.org/MusicRecording")
public class MusicRecording extends CreativeWork {
  /**
   * The composition this track is a recording of. */
  @JsonldProperty("http://schema.org/recordingOf")
  public MusicComposition recordingOf;

  /**
   * The playlist to which this recording belongs. */
  @JsonldProperty("http://schema.org/inPlaylist")
  public MusicPlaylist inPlaylist;

  /**
   * The International Standard Recording Code for the recording. */
  @JsonldProperty("http://schema.org/isrcCode")
  public String isrcCode;

  /**
   * The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>. */
  @JsonldProperty("http://schema.org/duration")
  public Duration duration;

  /**
   * The artist that performed this album or recording. */
  @JsonldProperty("http://schema.org/byArtist")
  public MusicGroup byArtist;

  /**
   * The album to which this recording belongs. */
  @JsonldProperty("http://schema.org/inAlbum")
  public MusicAlbum inAlbum;
}
