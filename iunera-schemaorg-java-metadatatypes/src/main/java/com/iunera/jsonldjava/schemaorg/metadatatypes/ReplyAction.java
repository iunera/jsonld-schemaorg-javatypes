package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of responding to a question/message asked/sent by the object. Related to <a class="localLink" href="/AskAction">AskAction</a>
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/AskAction">AskAction</a>: Appears generally as an origin of a ReplyAction.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/ReplyAction")
public class ReplyAction extends CommunicateAction {
  /**
   * A sub property of result. The Comment created or sent as a result of this action. */
  @JsonldProperty("http://schema.org/resultComment")
  public Comment resultComment;
}
