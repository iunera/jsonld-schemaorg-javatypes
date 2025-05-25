package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A group of multiple reservations with common values for all sub-reservations. */
@Vertex
@JsonldType("http://schema.org/ReservationPackage")
public class ReservationPackage extends Reservation {
  /**
   * The individual reservations included in the package. Typically a repeated property. */
  @JsonldProperty("http://schema.org/subReservation")
  public Reservation subReservation;
}
