package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * When a single product is associated with multiple offers (for example, the same pair of shoes is offered by different merchants), then AggregateOffer can be used. */
@Vertex
@JsonldType("http://schema.org/AggregateOffer")
public class AggregateOffer extends Offer {
  /**
   * The lowest price of all offers available. */
  @JsonldProperty("http://schema.org/lowPrice")
  public List<String> lowPriceText;

  /**
   * The highest price of all offers available. */
  @JsonldProperty("http://schema.org/highPrice")
  public List<String> highPriceText;

  /**
   * The lowest price of all offers available. */
  @JsonldProperty("http://schema.org/lowPrice")
  public List<java.math.BigDecimal> lowPriceNumber;

  /**
   * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. */
  @JsonldProperty("http://schema.org/offers")
  public Offer offers;

  /**
   * The number of offers for the product. */
  @JsonldProperty("http://schema.org/offerCount")
  public Integer offerCount;

  /**
   * The highest price of all offers available. */
  @JsonldProperty("http://schema.org/highPrice")
  public List<java.math.BigDecimal> highPriceNumber;
}
