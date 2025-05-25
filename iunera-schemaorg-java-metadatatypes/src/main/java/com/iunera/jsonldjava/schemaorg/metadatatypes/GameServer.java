package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Server that provides game interaction in a multiplayer game. */
@Vertex
@JsonldType("http://schema.org/GameServer")
public class GameServer extends Intangible {
  /**
   * Number of players on the server. */
  @JsonldProperty("http://schema.org/playersOnline")
  public Integer playersOnline;

  /**
   * Status of a game server. */
  @JsonldProperty("http://schema.org/serverStatus")
  public GameServerStatus serverStatus;
}
