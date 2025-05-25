package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * Used to describe a seat, such as a reserved seat in an event reservation. */
@Vertex
@JsonldType("http://schema.org/Seat")
public class Seat extends Intangible {
  /**
   * The type/class of the seat. */
  @JsonldProperty("http://schema.org/seatingType")
  public List<QualitativeValue> seatingTypeQualitativeValue;

  /**
   * The type/class of the seat. */
  @JsonldProperty("http://schema.org/seatingType")
  public List<String> seatingTypeText;

  /**
   * The section location of the reserved seat (e.g. Orchestra). */
  @JsonldProperty("http://schema.org/seatSection")
  public String seatSection;

  /**
   * The location of the reserved seat (e.g., 27). */
  @JsonldProperty("http://schema.org/seatNumber")
  public String seatNumber;

  /**
   * The row location of the reserved seat (e.g., B). */
  @JsonldProperty("http://schema.org/seatRow")
  public String seatRow;
}
