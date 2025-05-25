package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A reservation for air travel.
 * Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use <a class="localLink" href="/Offer">Offer</a>. */
@Vertex
@JsonldType("http://schema.org/FlightReservation")
public class FlightReservation extends Reservation {
  /**
   * The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority). */
  @JsonldProperty("http://schema.org/passengerPriorityStatus")
  public List<String> passengerPriorityStatusText;

  /**
   * The passenger's sequence number as assigned by the airline. */
  @JsonldProperty("http://schema.org/passengerSequenceNumber")
  public String passengerSequenceNumber;

  /**
   * The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority). */
  @JsonldProperty("http://schema.org/passengerPriorityStatus")
  public List<QualitativeValue> passengerPriorityStatusQualitativeValue;

  /**
   * The type of security screening the passenger is subject to. */
  @JsonldProperty("http://schema.org/securityScreening")
  public String securityScreening;

  /**
   * The airline-specific indicator of boarding order / preference. */
  @JsonldProperty("http://schema.org/boardingGroup")
  public String boardingGroup;
}
