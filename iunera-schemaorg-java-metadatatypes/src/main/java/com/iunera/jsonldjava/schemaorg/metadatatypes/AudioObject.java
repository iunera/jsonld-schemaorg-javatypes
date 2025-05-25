package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An audio file. */
@Vertex
@JsonldType("http://schema.org/AudioObject")
public class AudioObject extends MediaObject {
  /**
   * If this MediaObject is an AudioObject or VideoObject, the transcript of that object. */
  @JsonldProperty("http://schema.org/transcript")
  public String transcript;
}
