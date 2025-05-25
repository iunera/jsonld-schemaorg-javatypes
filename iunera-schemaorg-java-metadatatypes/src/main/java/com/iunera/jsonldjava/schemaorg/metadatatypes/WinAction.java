package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of achieving victory in a competitive activity. */
@Vertex
@JsonldType("http://schema.org/WinAction")
public class WinAction extends AchieveAction {
  /**
   * A sub property of participant. The loser of the action. */
  @JsonldProperty("http://schema.org/loser")
  public Person loser;
}
