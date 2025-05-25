package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A video game series. */
@Vertex
@JsonldType("http://schema.org/VideoGameSeries")
public class VideoGameSeries extends CreativeWorkSeries {
  /**
   * Indicates whether this game is multi-player, co-op or single-player.  The game can be marked as multi-player, co-op and single-player at the same time. */
  @JsonldProperty("http://schema.org/playMode")
  public GamePlayMode playMode;

  /**
   * Real or fictional location of the game (or part of game). */
  @JsonldProperty("http://schema.org/gameLocation")
  public List<Place> gameLocationPlace;

  /**
   * The number of episodes in this season or series. */
  @JsonldProperty("http://schema.org/numberOfEpisodes")
  public Integer numberOfEpisodes;

  /**
   * The composer of the soundtrack. */
  @JsonldProperty("http://schema.org/musicBy")
  public List<Person> musicByPerson;

  /**
   * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip. */
  @JsonldProperty("http://schema.org/director")
  public Person director;

  /**
   * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>. */
  @JsonldProperty("http://schema.org/gamePlatform")
  public List<Thing> gamePlatformThing;

  /**
   * Cheat codes to the game. */
  @JsonldProperty("http://schema.org/cheatCode")
  public CreativeWork cheatCode;

  /**
   * An episode of a tv, radio or game media within a series or season. */
  @JsonldProperty("http://schema.org/episode")
  public Episode episode;

  /**
   * Real or fictional location of the game (or part of game). */
  @JsonldProperty("http://schema.org/gameLocation")
  public List<PostalAddress> gameLocationPostalAddress;

  /**
   * The production company or studio responsible for the item e.g. series, video game, episode etc. */
  @JsonldProperty("http://schema.org/productionCompany")
  public Organization productionCompany;

  /**
   * The composer of the soundtrack. */
  @JsonldProperty("http://schema.org/musicBy")
  public List<MusicGroup> musicByMusicGroup;

  /**
   * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>. */
  @JsonldProperty("http://schema.org/gamePlatform")
  public List<java.net.URL> gamePlatformURL;

  /**
   * Real or fictional location of the game (or part of game). */
  @JsonldProperty("http://schema.org/gameLocation")
  public List<java.net.URL> gameLocationURL;

  /**
   * The trailer of a movie or tv/radio series, season, episode, etc. */
  @JsonldProperty("http://schema.org/trailer")
  public VideoObject trailer;

  /**
   * The task that a player-controlled character, or group of characters may complete in order to gain a reward. */
  @JsonldProperty("http://schema.org/quest")
  public Thing quest;

  /**
   * A season that is part of the media series. */
  @JsonldProperty("http://schema.org/containsSeason")
  public CreativeWorkSeason containsSeason;

  /**
   * Indicate how many people can play this game (minimum, maximum, or range). */
  @JsonldProperty("http://schema.org/numberOfPlayers")
  public QuantitativeValue numberOfPlayers;

  /**
   * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>. */
  @JsonldProperty("http://schema.org/gamePlatform")
  public List<String> gamePlatformText;

  /**
   * A piece of data that represents a particular aspect of a fictional character (skill, power, character points, advantage, disadvantage). */
  @JsonldProperty("http://schema.org/characterAttribute")
  public Thing characterAttribute;

  /**
   * An item is an object within the game world that can be collected by a player or, occasionally, a non-player character. */
  @JsonldProperty("http://schema.org/gameItem")
  public Thing gameItem;

  /**
   * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip. */
  @JsonldProperty("http://schema.org/actor")
  public Person actor;

  /**
   * The number of seasons in this series. */
  @JsonldProperty("http://schema.org/numberOfSeasons")
  public Integer numberOfSeasons;
}
