package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * The geographic coordinates of a place or event. */
@Vertex
@JsonldType("http://schema.org/GeoCoordinates")
public class GeoCoordinates extends StructuredValue {
  /**
   * The longitude of a location. For example <code>-122.08585</code> (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>). */
  @JsonldProperty("http://schema.org/longitude")
  public List<String> longitudeText;

  /**
   * The longitude of a location. For example <code>-122.08585</code> (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>). */
  @JsonldProperty("http://schema.org/longitude")
  public List<java.math.BigDecimal> longitudeNumber;

  /**
   * The elevation of a location (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>). */
  @JsonldProperty("http://schema.org/elevation")
  public List<java.math.BigDecimal> elevationNumber;

  /**
   * Physical address of the item. */
  @JsonldProperty("http://schema.org/address")
  public List<PostalAddress> addressPostalAddress;

  /**
   * The country. For example, USA. You can also provide the two-letter <a href="http://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166-1 alpha-2 country code</a>. */
  @JsonldProperty("http://schema.org/addressCountry")
  public List<String> addressCountryText;

  /**
   * The country. For example, USA. You can also provide the two-letter <a href="http://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166-1 alpha-2 country code</a>. */
  @JsonldProperty("http://schema.org/addressCountry")
  public List<Country> addressCountryCountry;

  /**
   * The elevation of a location (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>). */
  @JsonldProperty("http://schema.org/elevation")
  public List<String> elevationText;

  /**
   * Physical address of the item. */
  @JsonldProperty("http://schema.org/address")
  public List<String> addressText;

  /**
   * The latitude of a location. For example <code>37.42242</code> (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>). */
  @JsonldProperty("http://schema.org/latitude")
  public List<java.math.BigDecimal> latitudeNumber;

  /**
   * The latitude of a location. For example <code>37.42242</code> (<a href="https://en.wikipedia.org/wiki/World_Geodetic_System">WGS 84</a>). */
  @JsonldProperty("http://schema.org/latitude")
  public List<String> latitudeText;

  /**
   * The postal code. For example, 94043. */
  @JsonldProperty("http://schema.org/postalCode")
  public String postalCode;
}
