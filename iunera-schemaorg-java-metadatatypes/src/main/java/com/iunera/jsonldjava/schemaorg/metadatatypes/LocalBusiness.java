package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A particular physical business or branch of an organization. Examples of LocalBusiness include a restaurant, a particular branch of a restaurant chain, a branch of a bank, a medical practice, a club, a bowling alley, etc. */
@Vertex
@JsonldType("http://schema.org/LocalBusiness")
public class LocalBusiness extends Organization {
  /**
   * This one of additional original supertypes as defined at schema.org. However, Java does not support multi class inheritance and therefore a composition was used. */
  @JsonldProperty("http://schema.org/Place")
  public Place place;

  /**
   * The currency accepted (in <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217 currency format</a>). */
  @JsonldProperty("http://schema.org/currenciesAccepted")
  public String currenciesAccepted;

  /**
   * Cash, credit card, etc. */
  @JsonldProperty("http://schema.org/paymentAccepted")
  public String paymentAccepted;

  /**
   * The general opening hours for a business. Opening hours can be specified as a weekly time range, starting with days, then times per day. Multiple days can be listed with commas ',' separating each day. Day or time ranges are specified using a hyphen '-'.
   * <ul>
   * <li>Days are specified using the following two-letter combinations: <code>Mo</code>, <code>Tu</code>, <code>We</code>, <code>Th</code>, <code>Fr</code>, <code>Sa</code>, <code>Su</code>.</li>
   * <li>Times are specified using 24:00 time. For example, 3pm is specified as <code>15:00</code>. </li>
   * <li>Here is an example: <code>&lt;time itemprop="openingHours" datetime=&quot;Tu,Th 16:00-20:00&quot;&gt;Tuesdays and Thursdays 4-8pm&lt;/time&gt;</code>.</li>
   * <li>If a business is open 7 days a week, then it can be specified as <code>&lt;time itemprop=&quot;openingHours&quot; datetime=&quot;Mo-Su&quot;&gt;Monday through Sunday, all day&lt;/time&gt;</code>.</li>
   * </ul> */
  @JsonldProperty("http://schema.org/openingHours")
  public String openingHours;

  /**
   * The price range of the business, for example <code></code>. */
  @JsonldProperty("http://schema.org/priceRange")
  public String priceRange;
}
