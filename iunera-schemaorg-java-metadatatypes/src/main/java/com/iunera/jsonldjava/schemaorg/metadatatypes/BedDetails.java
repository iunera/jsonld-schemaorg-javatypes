package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An entity holding detailed information about the available bed types, e.g. the quantity of twin beds for a hotel room. For the single case of just one bed of a certain type, you can use bed directly with a text. See also <a class="localLink" href="/BedType">BedType</a> (under development). */
@Vertex
@JsonldType("http://schema.org/BedDetails")
public class BedDetails extends Intangible {
  /**
   * The quantity of the given bed type available in the HotelRoom, Suite, House, or Apartment. */
  @JsonldProperty("http://schema.org/numberOfBeds")
  public java.math.BigDecimal numberOfBeds;

  /**
   * The type of bed to which the BedDetail refers, i.e. the type of bed available in the quantity indicated by quantity. */
  @JsonldProperty("http://schema.org/typeOfBed")
  public String typeOfBed;
}
