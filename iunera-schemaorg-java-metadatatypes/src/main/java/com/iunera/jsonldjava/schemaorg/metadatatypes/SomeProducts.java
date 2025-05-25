package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A placeholder for multiple similar products of the same kind. */
@Vertex
@JsonldType("http://schema.org/SomeProducts")
public class SomeProducts extends Product {
  /**
   * The current approximate inventory level for the item or items. */
  @JsonldProperty("http://schema.org/inventoryLevel")
  public QuantitativeValue inventoryLevel;
}
