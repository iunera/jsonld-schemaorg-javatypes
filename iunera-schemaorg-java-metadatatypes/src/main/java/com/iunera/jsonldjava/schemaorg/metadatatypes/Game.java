package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * The Game type represents things which are games. These are typically rule-governed recreational activities, e.g. role-playing games in which players assume the role of characters in a fictional setting. */
@Vertex
@JsonldType("http://schema.org/Game")
public class Game extends CreativeWork {
  /**
   * The task that a player-controlled character, or group of characters may complete in order to gain a reward. */
  @JsonldProperty("http://schema.org/quest")
  public Thing quest;

  /**
   * Real or fictional location of the game (or part of game). */
  @JsonldProperty("http://schema.org/gameLocation")
  public List<Place> gameLocationPlace;

  /**
   * Indicate how many people can play this game (minimum, maximum, or range). */
  @JsonldProperty("http://schema.org/numberOfPlayers")
  public QuantitativeValue numberOfPlayers;

  /**
   * A piece of data that represents a particular aspect of a fictional character (skill, power, character points, advantage, disadvantage). */
  @JsonldProperty("http://schema.org/characterAttribute")
  public Thing characterAttribute;

  /**
   * An item is an object within the game world that can be collected by a player or, occasionally, a non-player character. */
  @JsonldProperty("http://schema.org/gameItem")
  public Thing gameItem;

  /**
   * Real or fictional location of the game (or part of game). */
  @JsonldProperty("http://schema.org/gameLocation")
  public List<PostalAddress> gameLocationPostalAddress;

  /**
   * Real or fictional location of the game (or part of game). */
  @JsonldProperty("http://schema.org/gameLocation")
  public List<java.net.URL> gameLocationURL;
}
