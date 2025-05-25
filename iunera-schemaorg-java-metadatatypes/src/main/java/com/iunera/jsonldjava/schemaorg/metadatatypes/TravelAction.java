package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of traveling from an fromLocation to a destination by a specified mode of transport, optionally with participants. */
@Vertex
@JsonldType("http://schema.org/TravelAction")
public class TravelAction extends MoveAction {
  /**
   * The distance travelled, e.g. exercising or travelling. */
  @JsonldProperty("http://schema.org/distance")
  public Distance distance;
}
