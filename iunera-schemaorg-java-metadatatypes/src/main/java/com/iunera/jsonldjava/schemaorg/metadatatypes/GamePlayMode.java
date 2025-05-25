package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Indicates whether this game is multi-player, co-op or single-player. */
@Vertex
@JsonldType("http://schema.org/GamePlayMode")
public class GamePlayMode extends Enumeration {
}
