package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Game server status: OnlineFull. Server is online but unavailable. The maximum number of players has reached. */
@Vertex
@JsonldType("http://schema.org/OnlineFull")
public class OnlineFull extends GameServerStatus {
}
