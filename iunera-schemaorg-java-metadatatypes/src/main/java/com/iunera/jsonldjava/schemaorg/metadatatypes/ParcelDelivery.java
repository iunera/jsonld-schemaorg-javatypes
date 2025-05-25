package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * The delivery of a parcel either via the postal service or a commercial service. */
@Vertex
@JsonldType("http://schema.org/ParcelDelivery")
public class ParcelDelivery extends Intangible {
  /**
   * Shipper's address. */
  @JsonldProperty("http://schema.org/originAddress")
  public PostalAddress originAddress;

  /**
   * Destination address. */
  @JsonldProperty("http://schema.org/deliveryAddress")
  public PostalAddress deliveryAddress;

  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller. */
  @JsonldProperty("http://schema.org/provider")
  public List<Person> providerPerson;

  /**
   * Method used for delivery or shipping. */
  @JsonldProperty("http://schema.org/hasDeliveryMethod")
  public DeliveryMethod hasDeliveryMethod;

  /**
   * The earliest date the package may arrive. */
  @JsonldProperty("http://schema.org/expectedArrivalFrom")
  public java.util.Date expectedArrivalFrom;

  /**
   * Item(s) being shipped. */
  @JsonldProperty("http://schema.org/itemShipped")
  public Product itemShipped;

  /**
   * New entry added as the package passes through each leg of its journey (from shipment to final delivery). */
  @JsonldProperty("http://schema.org/deliveryStatus")
  public DeliveryEvent deliveryStatus;

  /**
   * Shipper tracking number. */
  @JsonldProperty("http://schema.org/trackingNumber")
  public String trackingNumber;

  /**
   * Tracking url for the parcel delivery. */
  @JsonldProperty("http://schema.org/trackingUrl")
  public java.net.URL trackingUrl;

  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller. */
  @JsonldProperty("http://schema.org/provider")
  public List<Organization> providerOrganization;

  /**
   * The overall order the items in this delivery were included in. */
  @JsonldProperty("http://schema.org/partOfOrder")
  public Order partOfOrder;

  /**
   * The latest date the package may arrive. */
  @JsonldProperty("http://schema.org/expectedArrivalUntil")
  public java.util.Date expectedArrivalUntil;
}
