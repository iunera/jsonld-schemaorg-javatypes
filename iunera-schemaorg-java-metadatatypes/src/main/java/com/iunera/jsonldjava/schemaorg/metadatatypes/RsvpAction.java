package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of notifying an event organizer as to whether you expect to attend the event. */
@Vertex
@JsonldType("http://schema.org/RsvpAction")
public class RsvpAction extends InformAction {
  /**
   * If responding yes, the number of guests who will attend in addition to the invitee. */
  @JsonldProperty("http://schema.org/additionalNumberOfGuests")
  public java.math.BigDecimal additionalNumberOfGuests;

  /**
   * The response (yes, no, maybe) to the RSVP. */
  @JsonldProperty("http://schema.org/rsvpResponse")
  public RsvpResponseType rsvpResponse;

  /**
   * Comments, typically from users. */
  @JsonldProperty("http://schema.org/comment")
  public Comment comment;
}
