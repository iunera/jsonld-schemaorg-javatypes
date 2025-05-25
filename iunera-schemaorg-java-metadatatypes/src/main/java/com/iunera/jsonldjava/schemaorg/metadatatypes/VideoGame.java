package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A video game is an electronic game that involves human interaction with a user interface to generate visual feedback on a video device. */
@Vertex
@JsonldType("http://schema.org/VideoGame")
public class VideoGame extends SoftwareApplication {
  /**
   * This one of additional original supertypes as defined at schema.org. However, Java does not support multi class inheritance and therefore a composition was used. */
  @JsonldProperty("http://schema.org/Game")
  public Game game;

  /**
   * The trailer of a movie or tv/radio series, season, episode, etc. */
  @JsonldProperty("http://schema.org/trailer")
  public VideoObject trailer;

  /**
   * Indicates whether this game is multi-player, co-op or single-player.  The game can be marked as multi-player, co-op and single-player at the same time. */
  @JsonldProperty("http://schema.org/playMode")
  public GamePlayMode playMode;

  /**
   * The server on which  it is possible to play the game. */
  @JsonldProperty("http://schema.org/gameServer")
  public GameServer gameServer;

  /**
   * Links to tips, tactics, etc. */
  @JsonldProperty("http://schema.org/gameTip")
  public CreativeWork gameTip;

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
  public List<String> gamePlatformText;

  /**
   * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>. */
  @JsonldProperty("http://schema.org/gamePlatform")
  public List<Thing> gamePlatformThing;

  /**
   * Cheat codes to the game. */
  @JsonldProperty("http://schema.org/cheatCode")
  public CreativeWork cheatCode;

  /**
   * The composer of the soundtrack. */
  @JsonldProperty("http://schema.org/musicBy")
  public List<MusicGroup> musicByMusicGroup;

  /**
   * The electronic systems used to play <a href="http://en.wikipedia.org/wiki/Category:Video_game_platforms">video games</a>. */
  @JsonldProperty("http://schema.org/gamePlatform")
  public List<java.net.URL> gamePlatformURL;

  /**
   * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip. */
  @JsonldProperty("http://schema.org/actor")
  public Person actor;
}
