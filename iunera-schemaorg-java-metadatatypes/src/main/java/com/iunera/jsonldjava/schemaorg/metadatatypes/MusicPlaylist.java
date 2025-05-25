package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A collection of music tracks in playlist form. */
@Vertex
@JsonldType("http://schema.org/MusicPlaylist")
public class MusicPlaylist extends CreativeWork {
  /**
   * The number of tracks in this album or playlist. */
  @JsonldProperty("http://schema.org/numTracks")
  public Integer numTracks;

  /**
   * A music recording (track)&#x2014;usually a single song. If an ItemList is given, the list should contain items of type MusicRecording. */
  @JsonldProperty("http://schema.org/track")
  public List<MusicRecording> trackMusicRecording;

  /**
   * A music recording (track)&#x2014;usually a single song. If an ItemList is given, the list should contain items of type MusicRecording. */
  @JsonldProperty("http://schema.org/track")
  public List<ItemList> trackItemList;
}
