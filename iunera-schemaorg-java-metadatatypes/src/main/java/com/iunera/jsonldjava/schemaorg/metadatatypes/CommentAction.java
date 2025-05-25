package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of generating a comment about a subject. */
@Vertex
@JsonldType("http://schema.org/CommentAction")
public class CommentAction extends CommunicateAction {
  /**
   * A sub property of result. The Comment created or sent as a result of this action. */
  @JsonldProperty("http://schema.org/resultComment")
  public Comment resultComment;
}
