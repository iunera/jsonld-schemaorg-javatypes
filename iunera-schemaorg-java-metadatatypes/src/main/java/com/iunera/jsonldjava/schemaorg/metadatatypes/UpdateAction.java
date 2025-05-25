package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of managing by changing/editing the state of the object. */
@Vertex
@JsonldType("http://schema.org/UpdateAction")
public class UpdateAction extends Action {
  /**
   * A sub property of object. The collection target of the action. */
  @JsonldProperty("http://schema.org/targetCollection")
  public Thing targetCollection;
}
