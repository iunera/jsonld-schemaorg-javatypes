package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A single, identifiable product instance (e.g. a laptop with a particular serial number). */
@Vertex
@JsonldType("http://schema.org/IndividualProduct")
public class IndividualProduct extends Product {
  /**
   * The serial number or any alphanumeric identifier of a particular product. When attached to an offer, it is a shortcut for the serial number of the product included in the offer. */
  @JsonldProperty("http://schema.org/serialNumber")
  public String serialNumber;
}
