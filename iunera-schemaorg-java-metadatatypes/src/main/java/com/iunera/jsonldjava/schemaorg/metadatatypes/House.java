package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A house is a building or structure that has the ability to be occupied for habitation by humans or other creatures (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/House">http://en.wikipedia.org/wiki/House</a>). */
@Vertex
@JsonldType("http://schema.org/House")
public class House extends Accommodation {
  /**
   * The number of rooms (excluding bathrooms and closets) of the acccommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue. */
  @JsonldProperty("http://schema.org/numberOfRooms")
  public List<QuantitativeValue> numberOfRoomsQuantitativeValue;

  /**
   * The number of rooms (excluding bathrooms and closets) of the acccommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue. */
  @JsonldProperty("http://schema.org/numberOfRooms")
  public List<java.math.BigDecimal> numberOfRoomsNumber;
}
