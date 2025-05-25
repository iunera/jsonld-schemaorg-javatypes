package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A musical group, such as a band, an orchestra, or a choir. Can also be a solo musician. */
@Vertex
@JsonldType("http://schema.org/MusicGroup")
public class MusicGroup extends PerformingGroup {
  /**
   * Genre of the creative work or group. */
  @JsonldProperty("http://schema.org/genre")
  public List<String> genreText;

  /**
   * A music recording (track)&#x2014;usually a single song. If an ItemList is given, the list should contain items of type MusicRecording. */
  @JsonldProperty("http://schema.org/track")
  public List<MusicRecording> trackMusicRecording;

  /**
   * Genre of the creative work or group. */
  @JsonldProperty("http://schema.org/genre")
  public List<java.net.URL> genreURL;

  /**
   * A music album. */
  @JsonldProperty("http://schema.org/album")
  public MusicAlbum album;

  /**
   * A music recording (track)&#x2014;usually a single song. If an ItemList is given, the list should contain items of type MusicRecording. */
  @JsonldProperty("http://schema.org/track")
  public List<ItemList> trackItemList;
}
