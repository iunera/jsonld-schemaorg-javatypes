package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A video file. */
@Vertex
@JsonldType("http://schema.org/VideoObject")
public class VideoObject extends MediaObject {
  /**
   * The composer of the soundtrack. */
  @JsonldProperty("http://schema.org/musicBy")
  public List<Person> musicByPerson;

  /**
   * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip. */
  @JsonldProperty("http://schema.org/director")
  public Person director;

  /**
   * Thumbnail image for an image or video. */
  @JsonldProperty("http://schema.org/thumbnail")
  public ImageObject thumbnail;

  /**
   * The caption for this object. */
  @JsonldProperty("http://schema.org/caption")
  public String caption;

  /**
   * The frame size of the video. */
  @JsonldProperty("http://schema.org/videoFrameSize")
  public String videoFrameSize;

  /**
   * The composer of the soundtrack. */
  @JsonldProperty("http://schema.org/musicBy")
  public List<MusicGroup> musicByMusicGroup;

  /**
   * The quality of the video. */
  @JsonldProperty("http://schema.org/videoQuality")
  public String videoQuality;

  /**
   * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip. */
  @JsonldProperty("http://schema.org/actor")
  public Person actor;

  /**
   * If this MediaObject is an AudioObject or VideoObject, the transcript of that object. */
  @JsonldProperty("http://schema.org/transcript")
  public String transcript;
}
