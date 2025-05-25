package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * The price asked for a given offer by the respective organization or person. */
@Vertex
@JsonldType("http://schema.org/UnitPriceSpecification")
public class UnitPriceSpecification extends PriceSpecification {
  /**
   * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon. */
  @JsonldProperty("http://schema.org/unitCode")
  public List<java.net.URL> unitCodeURL;

  /**
   * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon. */
  @JsonldProperty("http://schema.org/unitCode")
  public List<String> unitCodeText;

  /**
   * The reference quantity for which a certain price applies, e.g. 1 EUR per 4 kWh of electricity. This property is a replacement for unitOfMeasurement for the advanced cases where the price does not relate to a standard unit. */
  @JsonldProperty("http://schema.org/referenceQuantity")
  public QuantitativeValue referenceQuantity;

  /**
   * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
   * <a href='unitCode'>unitCode</a>. */
  @JsonldProperty("http://schema.org/unitText")
  public String unitText;

  /**
   * A short text or acronym indicating multiple price specifications for the same offer, e.g. SRP for the suggested retail price or INVOICE for the invoice price, mostly used in the car industry. */
  @JsonldProperty("http://schema.org/priceType")
  public String priceType;

  /**
   * This property specifies the minimal quantity and rounding increment that will be the basis for the billing. The unit of measurement is specified by the unitCode property. */
  @JsonldProperty("http://schema.org/billingIncrement")
  public java.math.BigDecimal billingIncrement;
}
