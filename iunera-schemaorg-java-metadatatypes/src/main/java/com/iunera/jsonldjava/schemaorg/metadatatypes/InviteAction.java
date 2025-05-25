package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of asking someone to attend an event. Reciprocal of RsvpAction. */
@Vertex
@JsonldType("http://schema.org/InviteAction")
public class InviteAction extends CommunicateAction {
  /**
   * Upcoming or past event associated with this place, organization, or action. */
  @JsonldProperty("http://schema.org/event")
  public Event event;
}
