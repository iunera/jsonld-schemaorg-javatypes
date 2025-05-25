package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * An offer to transfer some rights to an item or to provide a service — for example, an offer to sell tickets to an event, to rent the DVD of a movie, to stream a TV show over the internet, to repair a motorcycle, or to loan a book.
 * For <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GTIN</a>-related fields, see <a href="http://www.gs1.org/barcodes/support/check_digit_calculator">Check Digit calculator</a> and <a href="http://www.gs1us.org/resources/standards/gtin-validation-guide">validation guide</a> from <a href="http://www.gs1.org/">GS1</a>. */
@Vertex
@JsonldType("http://schema.org/Offer")
public class Offer extends Intangible {
  /**
   * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to <a class="localLink" href="/PriceSpecification">PriceSpecification</a> and its subtypes. */
  @JsonldProperty("http://schema.org/priceCurrency")
  public String priceCurrency;

  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours. */
  @JsonldProperty("http://schema.org/validThrough")
  public java.util.Date validThrough;

  /**
   * The current approximate inventory level for the item or items. */
  @JsonldProperty("http://schema.org/inventoryLevel")
  public QuantitativeValue inventoryLevel;

  /**
   * The item being offered. */
  @JsonldProperty("http://schema.org/itemOffered")
  public List<Service> itemOfferedService;

  /**
   * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount. */
  @JsonldProperty("http://schema.org/eligibleTransactionVolume")
  public PriceSpecification eligibleTransactionVolume;

  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy. */
  @JsonldProperty("http://schema.org/category")
  public List<String> categoryText;

  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details. */
  @JsonldProperty("http://schema.org/gtin13")
  public String gtin13;

  /**
   * The typical delay between the receipt of the order and the goods either leaving the warehouse or being prepared for pickup, in case the delivery method is on site pickup. */
  @JsonldProperty("http://schema.org/deliveryLeadTime")
  public QuantitativeValue deliveryLeadTime;

  /**
   * The type(s) of customers for which the given offer is valid. */
  @JsonldProperty("http://schema.org/eligibleCustomerType")
  public BusinessEntityType eligibleCustomerType;

  /**
   * The duration for which the given offer is valid. */
  @JsonldProperty("http://schema.org/eligibleDuration")
  public QuantitativeValue eligibleDuration;

  /**
   * The item being offered. */
  @JsonldProperty("http://schema.org/itemOffered")
  public List<Product> itemOfferedProduct;

  /**
   * The date after which the price is no longer available. */
  @JsonldProperty("http://schema.org/priceValidUntil")
  public java.util.Date priceValidUntil;

  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details. */
  @JsonldProperty("http://schema.org/gtin14")
  public String gtin14;

  /**
   * The end of the availability of the product or service included in the offer. */
  @JsonldProperty("http://schema.org/availabilityEnds")
  public java.util.Date availabilityEnds;

  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy. */
  @JsonldProperty("http://schema.org/category")
  public List<Thing> categoryThing;

  /**
   * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
   * Usage guidelines:
   * <ul>
   * <li>Use the <a class="localLink" href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
   *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '' in the value.</li>
   * <li>Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.</li>
   * <li>Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values alongside more human-friendly formatting.</li>
   * <li>Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.</li>
   * </ul> */
  @JsonldProperty("http://schema.org/price")
  public List<java.math.BigDecimal> priceNumber;

  /**
   * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
   * Usage guidelines:
   * <ul>
   * <li>Use the <a class="localLink" href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
   *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '' in the value.</li>
   * <li>Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.</li>
   * <li>Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values alongside more human-friendly formatting.</li>
   * <li>Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.</li>
   * </ul> */
  @JsonldProperty("http://schema.org/price")
  public List<String> priceText;

  /**
   * The place(s) from which the offer can be obtained (e.g. store locations). */
  @JsonldProperty("http://schema.org/availableAtOrFrom")
  public Place availableAtOrFrom;

  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
   * See also <a class="localLink" href="/eligibleRegion">eligibleRegion</a>. */
  @JsonldProperty("http://schema.org/ineligibleRegion")
  public List<GeoShape> ineligibleRegionGeoShape;

  /**
   * This links to a node or nodes indicating the exact quantity of the products included in the offer. */
  @JsonldProperty("http://schema.org/includesObject")
  public TypeAndQuantityNode includesObject;

  /**
   * The payment method(s) accepted by seller for this offer. */
  @JsonldProperty("http://schema.org/acceptedPaymentMethod")
  public List<LoanOrCredit> acceptedPaymentMethodLoanOrCredit;

  /**
   * The delivery method(s) available for this offer. */
  @JsonldProperty("http://schema.org/availableDeliveryMethod")
  public DeliveryMethod availableDeliveryMethod;

  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
   * See also <a class="localLink" href="/ineligibleRegion">ineligibleRegion</a>. */
  @JsonldProperty("http://schema.org/eligibleRegion")
  public List<String> eligibleRegionText;

  /**
   * The serial number or any alphanumeric identifier of a particular product. When attached to an offer, it is a shortcut for the serial number of the product included in the offer. */
  @JsonldProperty("http://schema.org/serialNumber")
  public String serialNumber;

  /**
   * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell. */
  @JsonldProperty("http://schema.org/businessFunction")
  public BusinessFunction businessFunction;

  /**
   * The geographic area where a service or offered item is provided. */
  @JsonldProperty("http://schema.org/areaServed")
  public List<Place> areaServedPlace;

  /**
   * The geographic area where a service or offered item is provided. */
  @JsonldProperty("http://schema.org/areaServed")
  public List<GeoShape> areaServedGeoShape;

  /**
   * One or more detailed price specifications, indicating the unit price and delivery or payment charges. */
  @JsonldProperty("http://schema.org/priceSpecification")
  public PriceSpecification priceSpecification;

  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider. */
  @JsonldProperty("http://schema.org/seller")
  public List<Organization> sellerOrganization;

  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
   * See also <a class="localLink" href="/eligibleRegion">eligibleRegion</a>. */
  @JsonldProperty("http://schema.org/ineligibleRegion")
  public List<String> ineligibleRegionText;

  /**
   * The overall rating, based on a collection of reviews or ratings, of the item. */
  @JsonldProperty("http://schema.org/aggregateRating")
  public AggregateRating aggregateRating;

  /**
   * The payment method(s) accepted by seller for this offer. */
  @JsonldProperty("http://schema.org/acceptedPaymentMethod")
  public List<PaymentMethod> acceptedPaymentMethodPaymentMethod;

  /**
   * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity. */
  @JsonldProperty("http://schema.org/eligibleQuantity")
  public QuantitativeValue eligibleQuantity;

  /**
   * An additional offer that can only be obtained in combination with the first base offer (e.g. supplements and extensions that are available for a surcharge). */
  @JsonldProperty("http://schema.org/addOn")
  public Offer addOn;

  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
   * See also <a class="localLink" href="/ineligibleRegion">ineligibleRegion</a>. */
  @JsonldProperty("http://schema.org/eligibleRegion")
  public List<GeoShape> eligibleRegionGeoShape;

  /**
   * A review of the item. */
  @JsonldProperty("http://schema.org/review")
  public Review review;

  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details. */
  @JsonldProperty("http://schema.org/gtin12")
  public String gtin12;

  /**
   * The amount of time that is required between accepting the offer and the actual usage of the resource or service. */
  @JsonldProperty("http://schema.org/advanceBookingRequirement")
  public QuantitativeValue advanceBookingRequirement;

  /**
   * The geographic area where a service or offered item is provided. */
  @JsonldProperty("http://schema.org/areaServed")
  public List<String> areaServedText;

  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details. */
  @JsonldProperty("http://schema.org/gtin8")
  public String gtin8;

  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider. */
  @JsonldProperty("http://schema.org/seller")
  public List<Person> sellerPerson;

  /**
   * The date when the item becomes valid. */
  @JsonldProperty("http://schema.org/validFrom")
  public java.util.Date validFrom;

  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
   * See also <a class="localLink" href="/eligibleRegion">eligibleRegion</a>. */
  @JsonldProperty("http://schema.org/ineligibleRegion")
  public List<Place> ineligibleRegionPlace;

  /**
   * The beginning of the availability of the product or service included in the offer. */
  @JsonldProperty("http://schema.org/availabilityStarts")
  public java.util.Date availabilityStarts;

  /**
   * The geographic area where a service or offered item is provided. */
  @JsonldProperty("http://schema.org/areaServed")
  public List<AdministrativeArea> areaServedAdministrativeArea;

  /**
   * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers. */
  @JsonldProperty("http://schema.org/sku")
  public String sku;

  /**
   * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
   * See also <a class="localLink" href="/ineligibleRegion">ineligibleRegion</a>. */
  @JsonldProperty("http://schema.org/eligibleRegion")
  public List<Place> eligibleRegionPlace;

  /**
   * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer. */
  @JsonldProperty("http://schema.org/itemCondition")
  public OfferItemCondition itemCondition;

  /**
   * The availability of this item&#x2014;for example In stock, Out of stock, Pre-order, etc. */
  @JsonldProperty("http://schema.org/availability")
  public ItemAvailability availability;

  /**
   * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers. */
  @JsonldProperty("http://schema.org/mpn")
  public String mpn;

  /**
   * The warranty promise(s) included in the offer. */
  @JsonldProperty("http://schema.org/warranty")
  public WarrantyPromise warranty;
}
