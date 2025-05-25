package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of notifying someone of information pertinent to them, with no expectation of a response. */
@Vertex
@JsonldType("http://schema.org/InformAction")
public class InformAction extends CommunicateAction {
  /**
   * Upcoming or past event associated with this place, organization, or action. */
  @JsonldProperty("http://schema.org/event")
  public Event event;
}
