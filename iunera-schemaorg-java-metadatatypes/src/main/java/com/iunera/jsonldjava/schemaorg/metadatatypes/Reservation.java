package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * Describes a reservation for travel, dining or an event. Some reservations require tickets. 
 * Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, restaurant reservations, flights, or rental cars, use <a class="localLink" href="/Offer">Offer</a>. */
@Vertex
@JsonldType("http://schema.org/Reservation")
public class Reservation extends Intangible {
  /**
   * The date and time the reservation was modified. */
  @JsonldProperty("http://schema.org/modifiedTime")
  public java.util.Date modifiedTime;

  /**
   * Any membership in a frequent flyer, hotel loyalty program, etc. being applied to the reservation. */
  @JsonldProperty("http://schema.org/programMembershipUsed")
  public ProgramMembership programMembershipUsed;

  /**
   * The thing -- flight, event, restaurant,etc. being reserved. */
  @JsonldProperty("http://schema.org/reservationFor")
  public Thing reservationFor;

  /**
   * A unique identifier for the reservation. */
  @JsonldProperty("http://schema.org/reservationId")
  public String reservationId;

  /**
   * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to <a class="localLink" href="/PriceSpecification">PriceSpecification</a> and its subtypes. */
  @JsonldProperty("http://schema.org/priceCurrency")
  public String priceCurrency;

  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc. */
  @JsonldProperty("http://schema.org/totalPrice")
  public List<String> totalPriceText;

  /**
   * The current status of the reservation. */
  @JsonldProperty("http://schema.org/reservationStatus")
  public ReservationStatusType reservationStatus;

  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred. */
  @JsonldProperty("http://schema.org/broker")
  public List<Person> brokerPerson;

  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc. */
  @JsonldProperty("http://schema.org/totalPrice")
  public List<java.math.BigDecimal> totalPriceNumber;

  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller. */
  @JsonldProperty("http://schema.org/provider")
  public List<Person> providerPerson;

  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc. */
  @JsonldProperty("http://schema.org/totalPrice")
  public List<PriceSpecification> totalPricePriceSpecification;

  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred. */
  @JsonldProperty("http://schema.org/broker")
  public List<Organization> brokerOrganization;

  /**
   * A ticket associated with the reservation. */
  @JsonldProperty("http://schema.org/reservedTicket")
  public Ticket reservedTicket;

  /**
   * The person or organization the reservation or ticket is for. */
  @JsonldProperty("http://schema.org/underName")
  public List<Organization> underNameOrganization;

  /**
   * The person or organization the reservation or ticket is for. */
  @JsonldProperty("http://schema.org/underName")
  public List<Person> underNamePerson;

  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller. */
  @JsonldProperty("http://schema.org/provider")
  public List<Organization> providerOrganization;

  /**
   * The date and time the reservation was booked. */
  @JsonldProperty("http://schema.org/bookingTime")
  public java.util.Date bookingTime;
}
