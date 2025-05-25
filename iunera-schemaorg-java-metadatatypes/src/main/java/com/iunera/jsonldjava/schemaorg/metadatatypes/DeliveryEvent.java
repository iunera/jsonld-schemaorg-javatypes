package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An event involving the delivery of an item. */
@Vertex
@JsonldType("http://schema.org/DeliveryEvent")
public class DeliveryEvent extends Event {
  /**
   * Method used for delivery or shipping. */
  @JsonldProperty("http://schema.org/hasDeliveryMethod")
  public DeliveryMethod hasDeliveryMethod;

  /**
   * After this date, the item will no longer be available for pickup. */
  @JsonldProperty("http://schema.org/availableThrough")
  public java.util.Date availableThrough;

  /**
   * When the item is available for pickup from the store, locker, etc. */
  @JsonldProperty("http://schema.org/availableFrom")
  public java.util.Date availableFrom;

  /**
   * Password, PIN, or access code needed for delivery (e.g. from a locker). */
  @JsonldProperty("http://schema.org/accessCode")
  public String accessCode;
}
