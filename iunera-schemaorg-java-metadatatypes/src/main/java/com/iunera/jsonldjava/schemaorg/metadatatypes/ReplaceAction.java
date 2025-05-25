package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of editing a recipient by replacing an old object with a new object. */
@Vertex
@JsonldType("http://schema.org/ReplaceAction")
public class ReplaceAction extends UpdateAction {
  /**
   * A sub property of object. The object that is being replaced. */
  @JsonldProperty("http://schema.org/replacee")
  public Thing replacee;

  /**
   * A sub property of object. The object that replaces. */
  @JsonldProperty("http://schema.org/replacer")
  public Thing replacer;
}
