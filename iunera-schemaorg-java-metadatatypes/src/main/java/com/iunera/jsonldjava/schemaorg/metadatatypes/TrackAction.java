package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An agent tracks an object for updates.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/FollowAction">FollowAction</a>: Unlike FollowAction, TrackAction refers to the interest on the location of innanimates objects.</li>
 * <li><a class="localLink" href="/SubscribeAction">SubscribeAction</a>: Unlike SubscribeAction, TrackAction refers to  the interest on the location of innanimate objects.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/TrackAction")
public class TrackAction extends FindAction {
  /**
   * A sub property of instrument. The method of delivery. */
  @JsonldProperty("http://schema.org/deliveryMethod")
  public DeliveryMethod deliveryMethod;
}
