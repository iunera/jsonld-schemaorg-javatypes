package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An airport. */
@Vertex
@JsonldType("http://schema.org/Airport")
public class Airport extends CivicStructure {
  /**
   * ICAO identifier for an airport. */
  @JsonldProperty("http://schema.org/icaoCode")
  public String icaoCode;

  /**
   * IATA identifier for an airline or airport. */
  @JsonldProperty("http://schema.org/iataCode")
  public String iataCode;
}
