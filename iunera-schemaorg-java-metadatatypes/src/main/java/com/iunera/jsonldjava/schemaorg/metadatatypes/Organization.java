package com.iunera.jsonldjava.schemaorg.metadatatypes;


import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;
import java.util.Set;

/**
 * An organization such as a school, NGO, corporation, club, etc. */
@Vertex
@JsonldType("http://schema.org/Organization")
public abstract class Organization extends Thing {
 
	
	/**
   * Points-of-Sales operated by the organization or person. */
  @JsonldProperty("http://schema.org/hasPOS")
  public Place hasPOS;

  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution. */
  @JsonldProperty("http://schema.org/funder")
  public List<Organization> funderOrganization;

  /**
   * The date that this organization was founded. */
  @JsonldProperty("http://schema.org/foundingDate")
  public java.util.Date foundingDate;

  /**
   * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place. */
  @JsonldProperty("http://schema.org/isicV4")
  public String isicV4;

  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs. */
  @JsonldProperty("http://schema.org/memberOf")
  public List<ProgramMembership> memberOfProgramMembership;

  /**
   * The location of for example where the event is happening, an organization is located, or where an action takes place. */
  @JsonldProperty("http://schema.org/location")
  public List<String> locationText;

  /**
   * The location of for example where the event is happening, an organization is located, or where an action takes place. */
  @JsonldProperty("http://schema.org/location")
  public List<PostalAddress> locationPostalAddress;

  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event. */
  @JsonldProperty("http://schema.org/sponsor")
  public List<Organization> sponsorOrganization;

  /**
   * Someone working for this organization. */
  @JsonldProperty("http://schema.org/employee")
  public Person employee;

  /**
   * The number of employees in an organization e.g. business. */
  @JsonldProperty("http://schema.org/numberOfEmployees")
  public QuantitativeValue numberOfEmployees;

  /**
   * The North American Industry Classification System (NAICS) code for a particular organization or business person. */
  @JsonldProperty("http://schema.org/naics")
  public String naics;

  /**
   * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations. */
  @JsonldProperty("http://schema.org/globalLocationNumber")
  public String globalLocationNumber;

  /**
   * Upcoming or past event associated with this place, organization, or action. */
  @JsonldProperty("http://schema.org/event")
  public Event event;

  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person. */
  @JsonldProperty("http://schema.org/brand")
  public List<Organization> brandOrganization;

  /**
   * A pointer to products or services sought by the organization or person (demand). */
  @JsonldProperty("http://schema.org/seeks")
  public Demand seeks;

  /**
   * The date that this organization was dissolved. */
  @JsonldProperty("http://schema.org/dissolutionDate")
  public java.util.Date dissolutionDate;

  /**
   * The Dun &amp; Bradstreet DUNS number for identifying an organization or business person. */
  @JsonldProperty("http://schema.org/duns")
  public String duns;

  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event. */
  @JsonldProperty("http://schema.org/sponsor")
  public List<Person> sponsorPerson;

  /**
   * Physical address of the item. */
  @JsonldProperty("http://schema.org/address")
  public List<PostalAddress> addressPostalAddress;

  /**
   * Products owned by the organization or person. */
  @JsonldProperty("http://schema.org/owns")
  public List<OwnershipInfo> ownsOwnershipInfo;

  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person. */
  @JsonldProperty("http://schema.org/brand")
  public List<Brand> brandBrand;

  /**
   * An organization identifier that uniquely identifies a legal entity as defined in ISO 17442. */
  @JsonldProperty("http://schema.org/leiCode")
  public String leiCode;

  /**
   * An Organization (or ProgramMembership) to which this Person or Organization belongs. */
  @JsonldProperty("http://schema.org/memberOf")
  public List<Organization> memberOfOrganization;

  /**
   * The Value-added Tax ID of the organization or person. */
  @JsonldProperty("http://schema.org/vatID")
  public String vatID;

  /**
   * A relationship between an organization and a department of that organization, also described as an organization (allowing different urls, logos, opening hours). For example: a store with a pharmacy, or a bakery with a cafe. */
  @JsonldProperty("http://schema.org/department")
  public Organization department;

  /**
   * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain. */
  @JsonldProperty("http://schema.org/taxID")
  public String taxID;

  /**
   * An associated logo. */
  @JsonldProperty("http://schema.org/logo")
  public List<ImageObject> logoImageObject;

  /**
   * The geographic area where a service or offered item is provided. */
  @JsonldProperty("http://schema.org/areaServed")
  public List<Place> areaServedPlace;

  /**
   * The geographic area where a service or offered item is provided. */
  @JsonldProperty("http://schema.org/areaServed")
  public List<GeoShape> areaServedGeoShape;

  /**
   * An award won by or for this item. */
  @JsonldProperty("http://schema.org/award")
  public String award;

  /**
   * The overall rating, based on a collection of reviews or ratings, of the item. */
  @JsonldProperty("http://schema.org/aggregateRating")
  public AggregateRating aggregateRating;

  /**
   * Email address. */
  @JsonldProperty("http://schema.org/email")
  public String email;

  /**
   * The location of for example where the event is happening, an organization is located, or where an action takes place. */
  @JsonldProperty("http://schema.org/location")
  public List<Place> locationPlace;

  /**
   * Products owned by the organization or person. */
  @JsonldProperty("http://schema.org/owns")
  public List<Product> ownsProduct;

  /**
   * The telephone number. */
  @JsonldProperty("http://schema.org/telephone")
  public String telephone;

  /**
   * An associated logo. */
  @JsonldProperty("http://schema.org/logo")
  public List<java.net.URL> logoURL;

  /**
   * A contact point for a person or organization. */
  @JsonldProperty("http://schema.org/contactPoint")
  public ContactPoint contactPoint;

  /**
   * A review of the item. */
  @JsonldProperty("http://schema.org/review")
  public Review review;

  /**
   * The official name of the organization, e.g. the registered company name. */
  @JsonldProperty("http://schema.org/legalName")
  public String legalName;

  /**
   * Physical address of the item. */
  @JsonldProperty("http://schema.org/address")
  public List<String> addressText;

  /**
   * The geographic area where a service or offered item is provided. */
  @JsonldProperty("http://schema.org/areaServed")
  public List<String> areaServedText;

  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution. */
  @JsonldProperty("http://schema.org/funder")
  public List<Person> funderPerson;

  /**
   * The fax number. */
  @JsonldProperty("http://schema.org/faxNumber")
  public String faxNumber;

  /**
   * The place where the Organization was founded. */
  @JsonldProperty("http://schema.org/foundingLocation")
  public Place foundingLocation;

  /**
   * A person who founded this organization. */
  @JsonldProperty("http://schema.org/founder")
  public Person founder;

  /**
   * The geographic area where a service or offered item is provided. */
  @JsonldProperty("http://schema.org/areaServed")
  public List<AdministrativeArea> areaServedAdministrativeArea;

  /**
   * A relationship between two organizations where the first includes the second, e.g., as a subsidiary. See also: the more specific 'department' property. */
  @JsonldProperty("http://schema.org/subOrganization")
  public Organization subOrganization;

  /**
   * A pointer to products or services offered by the organization or person. */
  @JsonldProperty("http://schema.org/makesOffer")
  public Offer makesOffer;

  /**
   * Indicates an OfferCatalog listing for this Organization, Person, or Service. */
  @JsonldProperty("http://schema.org/hasOfferCatalog")
  public OfferCatalog hasOfferCatalog;
}
