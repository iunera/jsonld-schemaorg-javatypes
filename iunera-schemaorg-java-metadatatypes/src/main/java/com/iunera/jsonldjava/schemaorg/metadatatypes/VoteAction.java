package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of expressing a preference from a fixed/finite/structured set of choices/options. */
@Vertex
@JsonldType("http://schema.org/VoteAction")
public class VoteAction extends ChooseAction {
  /**
   * A sub property of object. The candidate subject of this action. */
  @JsonldProperty("http://schema.org/candidate")
  public Person candidate;
}
