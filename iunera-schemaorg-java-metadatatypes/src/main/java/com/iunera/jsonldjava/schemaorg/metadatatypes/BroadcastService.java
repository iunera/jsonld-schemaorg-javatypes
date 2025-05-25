package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A delivery service through which content is provided via broadcast over the air or online. */
@Vertex
@JsonldType("http://schema.org/BroadcastService")
public class BroadcastService extends Service {
  /**
   * The type of screening or video broadcast used (e.g. IMAX, 3D, SD, HD, etc.). */
  @JsonldProperty("http://schema.org/videoFormat")
  public String videoFormat;

  /**
   * A broadcast service to which the broadcast service may belong to such as regional variations of a national channel. */
  @JsonldProperty("http://schema.org/parentService")
  public BroadcastService parentService;

  /**
   * The timezone in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a> for which the service bases its broadcasts */
  @JsonldProperty("http://schema.org/broadcastTimezone")
  public String broadcastTimezone;

  /**
   * The name displayed in the channel guide. For many US affiliates, it is the network name. */
  @JsonldProperty("http://schema.org/broadcastDisplayName")
  public String broadcastDisplayName;

  /**
   * The organization owning or operating the broadcast service. */
  @JsonldProperty("http://schema.org/broadcaster")
  public Organization broadcaster;

  /**
   * The media network(s) whose content is broadcast on this station. */
  @JsonldProperty("http://schema.org/broadcastAffiliateOf")
  public Organization broadcastAffiliateOf;
}
