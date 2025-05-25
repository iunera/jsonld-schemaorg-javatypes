package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A means for accessing a service, e.g. a government office location, web site, or phone number. */
@Vertex
@JsonldType("http://schema.org/ServiceChannel")
public class ServiceChannel extends Intangible {
  /**
   * The service provided by this channel. */
  @JsonldProperty("http://schema.org/providesService")
  public Service providesService;

  /**
   * The website to access the service. */
  @JsonldProperty("http://schema.org/serviceUrl")
  public java.net.URL serviceUrl;

  /**
   * The address for accessing the service by mail. */
  @JsonldProperty("http://schema.org/servicePostalAddress")
  public PostalAddress servicePostalAddress;

  /**
   * The phone number to use to access the service. */
  @JsonldProperty("http://schema.org/servicePhone")
  public ContactPoint servicePhone;

  /**
   * The location (e.g. civic structure, local business, etc.) where a person can go to access the service. */
  @JsonldProperty("http://schema.org/serviceLocation")
  public Place serviceLocation;

  /**
   * The number to access the service by text message. */
  @JsonldProperty("http://schema.org/serviceSmsNumber")
  public ContactPoint serviceSmsNumber;

  /**
   * Estimated processing time for the service using this channel. */
  @JsonldProperty("http://schema.org/processingTime")
  public Duration processingTime;

  /**
   * A language someone may use with the item. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="/inLanguage">inLanguage</a> */
  @JsonldProperty("http://schema.org/availableLanguage")
  public List<String> availableLanguageText;

  /**
   * A language someone may use with the item. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="/inLanguage">inLanguage</a> */
  @JsonldProperty("http://schema.org/availableLanguage")
  public List<Language> availableLanguageLanguage;
}
