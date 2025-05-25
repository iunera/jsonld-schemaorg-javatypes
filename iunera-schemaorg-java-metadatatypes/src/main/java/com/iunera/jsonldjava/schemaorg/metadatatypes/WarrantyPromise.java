package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A structured value representing the duration and scope of services that will be provided to a customer free of charge in case of a defect or malfunction of a product. */
@Vertex
@JsonldType("http://schema.org/WarrantyPromise")
public class WarrantyPromise extends StructuredValue {
  /**
   * The duration of the warranty promise. Common unitCode values are ANN for year, MON for months, or DAY for days. */
  @JsonldProperty("http://schema.org/durationOfWarranty")
  public QuantitativeValue durationOfWarranty;

  /**
   * The scope of the warranty promise. */
  @JsonldProperty("http://schema.org/warrantyScope")
  public WarrantyScope warrantyScope;
}
