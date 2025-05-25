package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of an agent relocating to a place.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/TransferAction">TransferAction</a>: Unlike TransferAction, the subject of the move is a living Person or Organization rather than an inanimate object.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/MoveAction")
public class MoveAction extends Action {
  /**
   * A sub property of location. The final location of the object or the agent after the action. */
  @JsonldProperty("http://schema.org/toLocation")
  public Place toLocation;

  /**
   * A sub property of location. The original location of the object or the agent before the action. */
  @JsonldProperty("http://schema.org/fromLocation")
  public Place fromLocation;
}
