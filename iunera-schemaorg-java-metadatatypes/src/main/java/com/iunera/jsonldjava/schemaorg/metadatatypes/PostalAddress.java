package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * The mailing address. */
@Vertex
@JsonldType("http://schema.org/PostalAddress")
public class PostalAddress extends ContactPoint {
  /**
   * The post office box number for PO box addresses. */
  @JsonldProperty("http://schema.org/postOfficeBoxNumber")
  public String postOfficeBoxNumber;

  /**
   * The locality. For example, Mountain View. */
  @JsonldProperty("http://schema.org/addressLocality")
  public String addressLocality;

  /**
   * The country. For example, USA. You can also provide the two-letter <a href="http://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166-1 alpha-2 country code</a>. */
  @JsonldProperty("http://schema.org/addressCountry")
  public List<String> addressCountryText;

  /**
   * The street address. For example, 1600 Amphitheatre Pkwy. */
  @JsonldProperty("http://schema.org/streetAddress")
  public String streetAddress;

  /**
   * The region. For example, CA. */
  @JsonldProperty("http://schema.org/addressRegion")
  public String addressRegion;

  /**
   * The country. For example, USA. You can also provide the two-letter <a href="http://en.wikipedia.org/wiki/ISO_3166-1">ISO 3166-1 alpha-2 country code</a>. */
  @JsonldProperty("http://schema.org/addressCountry")
  public List<Country> addressCountryCountry;

  /**
   * The postal code. For example, 94043. */
  @JsonldProperty("http://schema.org/postalCode")
  public String postalCode;
}
