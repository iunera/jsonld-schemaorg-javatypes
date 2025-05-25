package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * Used to describe a ticket to an event, a flight, a bus ride, etc. */
@Vertex
@JsonldType("http://schema.org/Ticket")
public class Ticket extends Intangible {
  /**
   * The unique identifier for the ticket. */
  @JsonldProperty("http://schema.org/ticketNumber")
  public String ticketNumber;

  /**
   * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance. */
  @JsonldProperty("http://schema.org/ticketToken")
  public List<String> ticketTokenText;

  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc. */
  @JsonldProperty("http://schema.org/totalPrice")
  public List<java.math.BigDecimal> totalPriceNumber;

  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc. */
  @JsonldProperty("http://schema.org/totalPrice")
  public List<PriceSpecification> totalPricePriceSpecification;

  /**
   * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to <a class="localLink" href="/PriceSpecification">PriceSpecification</a> and its subtypes. */
  @JsonldProperty("http://schema.org/priceCurrency")
  public String priceCurrency;

  /**
   * The organization issuing the ticket or permit. */
  @JsonldProperty("http://schema.org/issuedBy")
  public Organization issuedBy;

  /**
   * The seat associated with the ticket. */
  @JsonldProperty("http://schema.org/ticketedSeat")
  public Seat ticketedSeat;

  /**
   * The total price for the reservation or ticket, including applicable taxes, shipping, etc. */
  @JsonldProperty("http://schema.org/totalPrice")
  public List<String> totalPriceText;

  /**
   * The person or organization the reservation or ticket is for. */
  @JsonldProperty("http://schema.org/underName")
  public List<Organization> underNameOrganization;

  /**
   * The person or organization the reservation or ticket is for. */
  @JsonldProperty("http://schema.org/underName")
  public List<Person> underNamePerson;

  /**
   * The date the ticket was issued. */
  @JsonldProperty("http://schema.org/dateIssued")
  public java.util.Date dateIssued;

  /**
   * Reference to an asset (e.g., Barcode, QR code image or PDF) usable for entrance. */
  @JsonldProperty("http://schema.org/ticketToken")
  public List<java.net.URL> ticketTokenURL;
}
