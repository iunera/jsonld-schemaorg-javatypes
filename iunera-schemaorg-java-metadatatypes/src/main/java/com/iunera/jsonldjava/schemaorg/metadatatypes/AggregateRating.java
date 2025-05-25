package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The average rating based on multiple ratings or reviews. */
@Vertex
@JsonldType("http://schema.org/AggregateRating")
public class AggregateRating extends Rating {
  /**
   * The item that is being reviewed/rated. */
  @JsonldProperty("http://schema.org/itemReviewed")
  public Thing itemReviewed;

  /**
   * The count of total number of reviews. */
  @JsonldProperty("http://schema.org/reviewCount")
  public Integer reviewCount;

  /**
   * The count of total number of ratings. */
  @JsonldProperty("http://schema.org/ratingCount")
  public Integer ratingCount;
}
