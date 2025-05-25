package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An organization that provides flights for passengers. */
@Vertex
@JsonldType("http://schema.org/Airline")
public class Airline extends Organization {
  /**
   * The type of boarding policy used by the airline (e.g. zone-based or group-based). */
  @JsonldProperty("http://schema.org/boardingPolicy")
  public BoardingPolicyType boardingPolicy;

  /**
   * IATA identifier for an airline or airport. */
  @JsonldProperty("http://schema.org/iataCode")
  public String iataCode;
}
