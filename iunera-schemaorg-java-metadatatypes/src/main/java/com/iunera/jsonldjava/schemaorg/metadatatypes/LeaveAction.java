package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An agent leaves an event / group with participants/friends at a location.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/JoinAction">JoinAction</a>: The antonym of LeaveAction.</li>
 * <li><a class="localLink" href="/UnRegisterAction">UnRegisterAction</a>: Unlike UnRegisterAction, LeaveAction implies leaving a group/team of people rather than a service.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/LeaveAction")
public class LeaveAction extends InteractAction {
  /**
   * Upcoming or past event associated with this place, organization, or action. */
  @JsonldProperty("http://schema.org/event")
  public Event event;
}
