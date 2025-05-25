package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An over the air or online broadcast event. */
@Vertex
@JsonldType("http://schema.org/BroadcastEvent")
public class BroadcastEvent extends PublicationEvent {
  /**
   * The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.). */
  @JsonldProperty("http://schema.org/videoFormat")
  public String videoFormat;

  /**
   * True is the broadcast is of a live event. */
  @JsonldProperty("http://schema.org/isLiveBroadcast")
  public Boolean isLiveBroadcast;

  /**
   * The event being broadcast such as a sporting event or awards ceremony. */
  @JsonldProperty("http://schema.org/broadcastOfEvent")
  public Event broadcastOfEvent;
}
