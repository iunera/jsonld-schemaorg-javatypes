package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A set of characteristics belonging to people, e.g. who compose an item's target audience. */
@Vertex
@JsonldType("http://schema.org/PeopleAudience")
public class PeopleAudience extends Audience {
  /**
   * Maximal age recommended for viewing content. */
  @JsonldProperty("http://schema.org/suggestedMaxAge")
  public java.math.BigDecimal suggestedMaxAge;

  /**
   * Audiences defined by a person's minimum age. */
  @JsonldProperty("http://schema.org/requiredMinAge")
  public Integer requiredMinAge;

  /**
   * Audiences defined by a person's gender. */
  @JsonldProperty("http://schema.org/requiredGender")
  public String requiredGender;

  /**
   * The gender of the person or audience. */
  @JsonldProperty("http://schema.org/suggestedGender")
  public String suggestedGender;

  /**
   * Audiences defined by a person's maximum age. */
  @JsonldProperty("http://schema.org/requiredMaxAge")
  public Integer requiredMaxAge;

  /**
   * Minimal age recommended for viewing content. */
  @JsonldProperty("http://schema.org/suggestedMinAge")
  public java.math.BigDecimal suggestedMinAge;
}
