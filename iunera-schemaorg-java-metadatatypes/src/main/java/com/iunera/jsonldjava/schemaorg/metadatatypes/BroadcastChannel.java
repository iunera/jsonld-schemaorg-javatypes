package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A unique instance of a BroadcastService on a CableOrSatelliteService lineup. */
@Vertex
@JsonldType("http://schema.org/BroadcastChannel")
public class BroadcastChannel extends Intangible {
  /**
   * The type of service required to have access to the channel (e.g. Standard or Premium). */
  @JsonldProperty("http://schema.org/broadcastServiceTier")
  public String broadcastServiceTier;

  /**
   * The BroadcastService offered on this channel. */
  @JsonldProperty("http://schema.org/providesBroadcastService")
  public BroadcastService providesBroadcastService;

  /**
   * The CableOrSatelliteService offering the channel. */
  @JsonldProperty("http://schema.org/inBroadcastLineup")
  public CableOrSatelliteService inBroadcastLineup;

  /**
   * The unique address by which the BroadcastService can be identified in a provider lineup. In US, this is typically a number. */
  @JsonldProperty("http://schema.org/broadcastChannelId")
  public String broadcastChannelId;
}
