package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A unique instance of a television BroadcastService on a CableOrSatelliteService lineup. */
@Vertex
@JsonldType("http://schema.org/TelevisionChannel")
public class TelevisionChannel extends BroadcastChannel {
}
