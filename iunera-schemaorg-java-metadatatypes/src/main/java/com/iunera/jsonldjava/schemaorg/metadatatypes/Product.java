package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * Any offered product or service. For example: a pair of shoes; a concert ticket; the rental of a car; a haircut; or an episode of a TV show streamed online. */
@Vertex
@JsonldType("http://schema.org/Product")
public class Product extends Thing {
  /**
   * A pointer to another, somehow related product (or multiple products). */
  @JsonldProperty("http://schema.org/isRelatedTo")
  public List<Product> isRelatedToProduct;

  /**
   * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties. */
  @JsonldProperty("http://schema.org/model")
  public List<ProductModel> modelProductModel;

  /**
   * The depth of the item. */
  @JsonldProperty("http://schema.org/depth")
  public List<Distance> depthDistance;

  /**
   * The release date of a product or product model. This can be used to distinguish the exact variant of a product. */
  @JsonldProperty("http://schema.org/releaseDate")
  public java.util.Date releaseDate;

  /**
   * The date of production of the item, e.g. vehicle. */
  @JsonldProperty("http://schema.org/productionDate")
  public java.util.Date productionDate;

  /**
   * An award won by or for this item. */
  @JsonldProperty("http://schema.org/award")
  public String award;

  /**
   * The depth of the item. */
  @JsonldProperty("http://schema.org/depth")
  public List<QuantitativeValue> depthQuantitativeValue;

  /**
   * The overall rating, based on a collection of reviews or ratings, of the item. */
  @JsonldProperty("http://schema.org/aggregateRating")
  public AggregateRating aggregateRating;

  /**
   * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. */
  @JsonldProperty("http://schema.org/offers")
  public Offer offers;

  /**
   * The manufacturer of the product. */
  @JsonldProperty("http://schema.org/manufacturer")
  public Organization manufacturer;

  /**
   * The model of the product. Use with the URL of a ProductModel or a textual representation of the model identifier. The URL of the ProductModel can be from an external source. It is recommended to additionally provide strong product identifiers via the gtin8/gtin13/gtin14 and mpn properties. */
  @JsonldProperty("http://schema.org/model")
  public List<String> modelText;

  /**
   * The height of the item. */
  @JsonldProperty("http://schema.org/height")
  public List<QuantitativeValue> heightQuantitativeValue;

  /**
   * An associated logo. */
  @JsonldProperty("http://schema.org/logo")
  public List<java.net.URL> logoURL;

  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy. */
  @JsonldProperty("http://schema.org/category")
  public List<String> categoryText;

  /**
   * A review of the item. */
  @JsonldProperty("http://schema.org/review")
  public Review review;

  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-13.aspx">GTIN-13</a> code of the product, or the product to which the offer refers. This is equivalent to 13-digit ISBN codes and EAN UCC-13. Former 12-digit UPC codes can be converted into a GTIN-13 code by simply adding a preceeding zero. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details. */
  @JsonldProperty("http://schema.org/gtin13")
  public String gtin13;

  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-12.aspx">GTIN-12</a> code of the product, or the product to which the offer refers. The GTIN-12 is the 12-digit GS1 Identification Key composed of a U.P.C. Company Prefix, Item Reference, and Check Digit used to identify trade items. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details. */
  @JsonldProperty("http://schema.org/gtin12")
  public String gtin12;

  /**
   * The height of the item. */
  @JsonldProperty("http://schema.org/height")
  public List<Distance> heightDistance;

  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-8.aspx">GTIN-8</a> code of the product, or the product to which the offer refers. This code is also known as EAN/UCC-8 or 8-digit EAN. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details. */
  @JsonldProperty("http://schema.org/gtin8")
  public String gtin8;

  /**
   * The <a href="http://apps.gs1.org/GDD/glossary/Pages/GTIN-14.aspx">GTIN-14</a> code of the product, or the product to which the offer refers. See <a href="http://www.gs1.org/barcodes/technical/idkeys/gtin">GS1 GTIN Summary</a> for more details. */
  @JsonldProperty("http://schema.org/gtin14")
  public String gtin14;

  /**
   * The date the item e.g. vehicle was purchased by the current owner. */
  @JsonldProperty("http://schema.org/purchaseDate")
  public java.util.Date purchaseDate;

  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy. */
  @JsonldProperty("http://schema.org/category")
  public List<Thing> categoryThing;

  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person. */
  @JsonldProperty("http://schema.org/brand")
  public List<Organization> brandOrganization;

  /**
   * The width of the item. */
  @JsonldProperty("http://schema.org/width")
  public List<Distance> widthDistance;

  /**
   * The product identifier, such as ISBN. For example: <code>meta itemprop="productID" content="isbn:123-456-789"</code>. */
  @JsonldProperty("http://schema.org/productID")
  public String productID;

  /**
   * A property-value pair representing an additional characteristics of the entitity, e.g. a product feature or another characteristic for which there is no matching property in schema.org.
   * Note: Publishers should be aware that applications designed to use specific schema.org properties (e.g. http://schema.org/width, http://schema.org/color, http://schema.org/gtin13, ...) will typically expect such data to be provided using those properties, rather than using the generic property/value mechanism. */
  @JsonldProperty("http://schema.org/additionalProperty")
  public PropertyValue additionalProperty;

  /**
   * The weight of the product or person. */
  @JsonldProperty("http://schema.org/weight")
  public QuantitativeValue weight;

  /**
   * A pointer to another, functionally similar product (or multiple products). */
  @JsonldProperty("http://schema.org/isSimilarTo")
  public List<Product> isSimilarToProduct;

  /**
   * A pointer to another product (or multiple products) for which this product is an accessory or spare part. */
  @JsonldProperty("http://schema.org/isAccessoryOrSparePartFor")
  public Product isAccessoryOrSparePartFor;

  /**
   * The Stock Keeping Unit (SKU), i.e. a merchant-specific identifier for a product or service, or the product to which the offer refers. */
  @JsonldProperty("http://schema.org/sku")
  public String sku;

  /**
   * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person. */
  @JsonldProperty("http://schema.org/brand")
  public List<Brand> brandBrand;

  /**
   * A pointer to another, somehow related product (or multiple products). */
  @JsonldProperty("http://schema.org/isRelatedTo")
  public List<Service> isRelatedToService;

  /**
   * A predefined value from OfferItemCondition or a textual description of the condition of the product or service, or the products or services included in the offer. */
  @JsonldProperty("http://schema.org/itemCondition")
  public OfferItemCondition itemCondition;

  /**
   * A pointer to another product (or multiple products) for which this product is a consumable. */
  @JsonldProperty("http://schema.org/isConsumableFor")
  public Product isConsumableFor;

  /**
   * The width of the item. */
  @JsonldProperty("http://schema.org/width")
  public List<QuantitativeValue> widthQuantitativeValue;

  /**
   * A pointer to another, functionally similar product (or multiple products). */
  @JsonldProperty("http://schema.org/isSimilarTo")
  public List<Service> isSimilarToService;

  /**
   * The color of the product. */
  @JsonldProperty("http://schema.org/color")
  public String color;

  /**
   * An intended audience, i.e. a group for whom something was created. */
  @JsonldProperty("http://schema.org/audience")
  public Audience audience;

  /**
   * The Manufacturer Part Number (MPN) of the product, or the product to which the offer refers. */
  @JsonldProperty("http://schema.org/mpn")
  public String mpn;

  /**
   * An associated logo. */
  @JsonldProperty("http://schema.org/logo")
  public List<ImageObject> logoImageObject;
}
