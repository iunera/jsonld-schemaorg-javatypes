package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of transferring/moving (abstract or concrete) animate or inanimate objects from one place to another. */
@Vertex
@JsonldType("http://schema.org/TransferAction")
public class TransferAction extends Action {
  /**
   * A sub property of location. The final location of the object or the agent after the action. */
  @JsonldProperty("http://schema.org/toLocation")
  public Place toLocation;

  /**
   * A sub property of location. The original location of the object or the agent before the action. */
  @JsonldProperty("http://schema.org/fromLocation")
  public Place fromLocation;
}
