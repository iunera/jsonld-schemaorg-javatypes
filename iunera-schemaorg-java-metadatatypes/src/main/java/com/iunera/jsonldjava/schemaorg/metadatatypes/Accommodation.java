package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * An accommodation is a place that can accommodate human beings, e.g. a hotel room, a camping pitch, or a meeting room. Many accommodations are for overnight stays, but this is not a mandatory requirement.
 * For more specific types of accommodations not defined in schema.org, one can use additionalType with external vocabularies.
 * <br /><br />
 * See also the <a href="/docs/hotels.html">dedicated document on the use of schema.org for marking up hotels and other forms of accommodations</a>. */
@Vertex
@JsonldType("http://schema.org/Accommodation")
public class Accommodation extends Place {
  /**
   * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value. */
  @JsonldProperty("http://schema.org/petsAllowed")
  public List<Boolean> petsAllowedBoolean;

  /**
   * Indications regarding the permitted usage of the accommodation. */
  @JsonldProperty("http://schema.org/permittedUsage")
  public String permittedUsage;

  /**
   * The size of the accommodation, e.g. in square meter or squarefoot.
   * Typical unit code(s): MTK for square meter, FTK for square foot, or YDK for square yard */
  @JsonldProperty("http://schema.org/floorSize")
  public QuantitativeValue floorSize;

  /**
   * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value. */
  @JsonldProperty("http://schema.org/petsAllowed")
  public List<String> petsAllowedText;

  /**
   * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs. */
  @JsonldProperty("http://schema.org/amenityFeature")
  public LocationFeatureSpecification amenityFeature;
}
