package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A reservation for a taxi.
 * Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use <a class="localLink" href="/Offer">Offer</a>. */
@Vertex
@JsonldType("http://schema.org/TaxiReservation")
public class TaxiReservation extends Reservation {
  /**
   * Where a taxi will pick up a passenger or a rental car can be picked up. */
  @JsonldProperty("http://schema.org/pickupLocation")
  public Place pickupLocation;

  /**
   * When a taxi will pickup a passenger or a rental car can be picked up. */
  @JsonldProperty("http://schema.org/pickupTime")
  public java.util.Date pickupTime;

  /**
   * Number of people the reservation should accommodate. */
  @JsonldProperty("http://schema.org/partySize")
  public List<Integer> partySizeInteger;

  /**
   * Number of people the reservation should accommodate. */
  @JsonldProperty("http://schema.org/partySize")
  public List<QuantitativeValue> partySizeQuantitativeValue;
}
