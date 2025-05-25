package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * Information about the engine of the vehicle. A vehicle can have multiple engines represented by multiple engine specification entities. */
@Vertex
@JsonldType("http://schema.org/EngineSpecification")
public class EngineSpecification extends StructuredValue {
  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle. */
  @JsonldProperty("http://schema.org/fuelType")
  public List<QualitativeValue> fuelTypeQualitativeValue;

  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle. */
  @JsonldProperty("http://schema.org/fuelType")
  public List<java.net.URL> fuelTypeURL;

  /**
   * The type of fuel suitable for the engine or engines of the vehicle. If the vehicle has only one engine, this property can be attached directly to the vehicle. */
  @JsonldProperty("http://schema.org/fuelType")
  public List<String> fuelTypeText;
}
