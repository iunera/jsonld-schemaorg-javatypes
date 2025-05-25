package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A set of characteristics belonging to businesses, e.g. who compose an item's target audience. */
@Vertex
@JsonldType("http://schema.org/BusinessAudience")
public class BusinessAudience extends Audience {
  /**
   * The number of employees in an organization e.g. business. */
  @JsonldProperty("http://schema.org/numberOfEmployees")
  public QuantitativeValue numberOfEmployees;

  /**
   * The age of the business. */
  @JsonldProperty("http://schema.org/yearsInOperation")
  public QuantitativeValue yearsInOperation;

  /**
   * The size of the business in annual revenue. */
  @JsonldProperty("http://schema.org/yearlyRevenue")
  public QuantitativeValue yearlyRevenue;
}
