package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A brand is a name used by an organization or business person for labeling a product, product group, or similar. */
@Vertex
@JsonldType("http://schema.org/Brand")
public class Brand extends Intangible {
  /**
   * A review of the item. */
  @JsonldProperty("http://schema.org/review")
  public Review review;

  /**
   * The overall rating, based on a collection of reviews or ratings, of the item. */
  @JsonldProperty("http://schema.org/aggregateRating")
  public AggregateRating aggregateRating;

  /**
   * An associated logo. */
  @JsonldProperty("http://schema.org/logo")
  public List<ImageObject> logoImageObject;

  /**
   * An associated logo. */
  @JsonldProperty("http://schema.org/logo")
  public List<java.net.URL> logoURL;
}
