package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * Entities that have a somewhat fixed, physical extension. */
@Vertex
@JsonldType("http://schema.org/Place")
public class Place extends Thing {
  /**
   * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations. */
  @JsonldProperty("http://schema.org/globalLocationNumber")
  public String globalLocationNumber;

  /**
   * The basic containment relation between a place and one that contains it. */
  @JsonldProperty("http://schema.org/containedInPlace")
  public Place containedInPlace;

  /**
   * Upcoming or past event associated with this place, organization, or action. */
  @JsonldProperty("http://schema.org/event")
  public Event event;

  /**
   * A URL to a map of the place. */
  @JsonldProperty("http://schema.org/hasMap")
  public List<java.net.URL> hasMapURL;

  /**
   * The fax number. */
  @JsonldProperty("http://schema.org/faxNumber")
  public String faxNumber;

  /**
   * The geo coordinates of the place. */
  @JsonldProperty("http://schema.org/geo")
  public List<GeoCoordinates> geoGeoCoordinates;

  /**
   * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs. */
  @JsonldProperty("http://schema.org/amenityFeature")
  public LocationFeatureSpecification amenityFeature;

  /**
   * A photograph of this place. */
  @JsonldProperty("http://schema.org/photo")
  public List<Photograph> photoPhotograph;

  /**
   * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place. */
  @JsonldProperty("http://schema.org/isicV4")
  public String isicV4;

  /**
   * The overall rating, based on a collection of reviews or ratings, of the item. */
  @JsonldProperty("http://schema.org/aggregateRating")
  public AggregateRating aggregateRating;

  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.
   * Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism. */
  @JsonldProperty("http://schema.org/additionalProperty")
  public PropertyValue additionalProperty;

  /**
   * Physical address of the item. */
  @JsonldProperty("http://schema.org/address")
  public List<PostalAddress> addressPostalAddress;

  /**
   * A short textual code (also called "store code") that uniquely identifies a place of business. The code is typically assigned by the parentOrganization and used in structured URLs.
   * For example, in the URL http://www.starbucks.co.uk/store-locator/etc/detail/3047 the code "3047" is a branchCode for a particular branch. */
  @JsonldProperty("http://schema.org/branchCode")
  public String branchCode;

  /**
   * The geo coordinates of the place. */
  @JsonldProperty("http://schema.org/geo")
  public List<GeoShape> geoGeoShape;

  /**
   * The telephone number. */
  @JsonldProperty("http://schema.org/telephone")
  public String telephone;

  /**
   * The opening hours of a certain place. */
  @JsonldProperty("http://schema.org/openingHoursSpecification")
  public OpeningHoursSpecification openingHoursSpecification;

  /**
   * An associated logo. */
  @JsonldProperty("http://schema.org/logo")
  public List<java.net.URL> logoURL;

  /**
   * A URL to a map of the place. */
  @JsonldProperty("http://schema.org/hasMap")
  public List<Map> hasMapMap;

  /**
   * A review of the item. */
  @JsonldProperty("http://schema.org/review")
  public Review review;

  /**
   * A photograph of this place. */
  @JsonldProperty("http://schema.org/photo")
  public List<ImageObject> photoImageObject;

  /**
   * Indicates whether it is allowed to smoke in the place, e.g. in the restaurant, hotel or hotel room. */
  @JsonldProperty("http://schema.org/smokingAllowed")
  public Boolean smokingAllowed;

  /**
   * The special opening hours of a certain place.
   * Use this to explicitly override general opening hours brought in scope by <a class="localLink" href="/openingHoursSpecification">openingHoursSpecification</a> or <a class="localLink" href="/openingHours">openingHours</a>. */
  @JsonldProperty("http://schema.org/specialOpeningHoursSpecification")
  public OpeningHoursSpecification specialOpeningHoursSpecification;

  /**
   * An associated logo. */
  @JsonldProperty("http://schema.org/logo")
  public List<ImageObject> logoImageObject;

  /**
   * Physical address of the item. */
  @JsonldProperty("http://schema.org/address")
  public List<String> addressText;
}
