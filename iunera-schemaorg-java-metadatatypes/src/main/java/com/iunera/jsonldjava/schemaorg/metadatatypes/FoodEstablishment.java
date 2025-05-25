package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A food-related business. */
@Vertex
@JsonldType("http://schema.org/FoodEstablishment")
public class FoodEstablishment extends LocalBusiness {
  /**
   * Indicates whether a FoodEstablishment accepts reservations. Values can be Boolean, an URL at which reservations can be made or (for backwards compatibility) the strings <code>Yes</code> or <code>No</code>. */
  @JsonldProperty("http://schema.org/acceptsReservations")
  public List<java.net.URL> acceptsReservationsURL;

  /**
   * Either the actual menu or a URL of the menu. */
  @JsonldProperty("http://schema.org/menu")
  public List<String> menuText;

  /**
   * Indicates whether a FoodEstablishment accepts reservations. Values can be Boolean, an URL at which reservations can be made or (for backwards compatibility) the strings <code>Yes</code> or <code>No</code>. */
  @JsonldProperty("http://schema.org/acceptsReservations")
  public List<String> acceptsReservationsText;

  /**
   * Either the actual menu or a URL of the menu. */
  @JsonldProperty("http://schema.org/menu")
  public List<java.net.URL> menuURL;

  /**
   * Indicates whether a FoodEstablishment accepts reservations. Values can be Boolean, an URL at which reservations can be made or (for backwards compatibility) the strings <code>Yes</code> or <code>No</code>. */
  @JsonldProperty("http://schema.org/acceptsReservations")
  public List<Boolean> acceptsReservationsBoolean;

  /**
   * An official rating for a lodging business or food establishment, e.g. from national associations or standards bodies. Use the author property to indicate the rating organization, e.g. as an Organization with name such as (e.g. HOTREC, DEHOGA, WHR, or Hotelstars). */
  @JsonldProperty("http://schema.org/starRating")
  public Rating starRating;

  /**
   * The cuisine of the restaurant. */
  @JsonldProperty("http://schema.org/servesCuisine")
  public String servesCuisine;
}
