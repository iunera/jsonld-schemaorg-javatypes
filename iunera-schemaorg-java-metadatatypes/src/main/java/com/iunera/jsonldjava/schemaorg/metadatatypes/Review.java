package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A review of an item - for example, of a restaurant, movie, or store. */
@Vertex
@JsonldType("http://schema.org/Review")
public class Review extends CreativeWork {
  /**
   * The actual body of the review. */
  @JsonldProperty("http://schema.org/reviewBody")
  public String reviewBody;

  /**
   * The rating given in this review. Note that reviews can themselves be rated. The <code>reviewRating</code> applies to rating given by the review. The <a class="localLink" href="/aggregateRating">aggregateRating</a> property applies to the review itself, as a creative work. */
  @JsonldProperty("http://schema.org/reviewRating")
  public Rating reviewRating;

  /**
   * The item that is being reviewed/rated. */
  @JsonldProperty("http://schema.org/itemReviewed")
  public Thing itemReviewed;
}
