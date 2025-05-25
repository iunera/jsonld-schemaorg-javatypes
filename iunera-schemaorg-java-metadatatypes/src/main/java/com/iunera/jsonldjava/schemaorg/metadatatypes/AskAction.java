package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of posing a question / favor to someone.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/ReplyAction">ReplyAction</a>: Appears generally as a response to AskAction.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/AskAction")
public class AskAction extends CommunicateAction {
  /**
   * A sub property of object. A question. */
  @JsonldProperty("http://schema.org/question")
  public Question question;
}
