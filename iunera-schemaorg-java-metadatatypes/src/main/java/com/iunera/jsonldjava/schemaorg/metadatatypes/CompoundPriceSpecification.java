package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A compound price specification is one that bundles multiple prices that all apply in combination for different dimensions of consumption. Use the name property of the attached unit price specification for indicating the dimension of a price component (e.g. "electricity" or "final cleaning"). */
@Vertex
@JsonldType("http://schema.org/CompoundPriceSpecification")
public class CompoundPriceSpecification extends PriceSpecification {
  /**
   * This property links to all <a class="localLink" href="/UnitPriceSpecification">UnitPriceSpecification</a> nodes that apply in parallel for the <a class="localLink" href="/CompoundPriceSpecification">CompoundPriceSpecification</a> node. */
  @JsonldProperty("http://schema.org/priceComponent")
  public UnitPriceSpecification priceComponent;
}
