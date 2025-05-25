package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of adding at a specific location in an ordered collection. */
@Vertex
@JsonldType("http://schema.org/InsertAction")
public class InsertAction extends AddAction {
  /**
   * A sub property of location. The final location of the object or the agent after the action. */
  @JsonldProperty("http://schema.org/toLocation")
  public Place toLocation;
}
