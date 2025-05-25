package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of being defeated in a competitive activity. */
@Vertex
@JsonldType("http://schema.org/LoseAction")
public class LoseAction extends AchieveAction {
  /**
   * A sub property of participant. The winner of the action. */
  @JsonldProperty("http://schema.org/winner")
  public Person winner;
}
