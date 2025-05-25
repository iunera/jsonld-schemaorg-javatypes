package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * An apartment (in American English) or flat (in British English) is a self-contained housing unit (a type of residential real estate) that occupies only part of a building (Source: Wikipedia, the free encyclopedia, see <a href="http://en.wikipedia.org/wiki/Apartment">http://en.wikipedia.org/wiki/Apartment</a>). */
@Vertex
@JsonldType("http://schema.org/Apartment")
public class Apartment extends Accommodation {
  /**
   * The number of rooms (excluding bathrooms and closets) of the acccommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue. */
  @JsonldProperty("http://schema.org/numberOfRooms")
  public List<QuantitativeValue> numberOfRoomsQuantitativeValue;

  /**
   * The allowed total occupancy for the accommodation in persons (including infants etc). For individual accommodations, this is not necessarily the legal maximum but defines the permitted usage as per the contractual agreement (e.g. a double room used by a single person).
   * Typical unit code(s): C62 for person */
  @JsonldProperty("http://schema.org/occupancy")
  public QuantitativeValue occupancy;

  /**
   * The number of rooms (excluding bathrooms and closets) of the acccommodation or lodging business.
   * Typical unit code(s): ROM for room or C62 for no unit. The type of room can be put in the unitText property of the QuantitativeValue. */
  @JsonldProperty("http://schema.org/numberOfRooms")
  public List<java.math.BigDecimal> numberOfRoomsNumber;
}
