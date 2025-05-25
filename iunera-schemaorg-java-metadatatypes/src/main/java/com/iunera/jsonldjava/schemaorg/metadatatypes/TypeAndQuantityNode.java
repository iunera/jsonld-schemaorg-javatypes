package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A structured value indicating the quantity, unit of measurement, and business function of goods included in a bundle offer. */
@Vertex
@JsonldType("http://schema.org/TypeAndQuantityNode")
public class TypeAndQuantityNode extends StructuredValue {
  /**
   * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon. */
  @JsonldProperty("http://schema.org/unitCode")
  public List<java.net.URL> unitCodeURL;

  /**
   * The product that this structured value is referring to. */
  @JsonldProperty("http://schema.org/typeOfGood")
  public List<Service> typeOfGoodService;

  /**
   * A string or text indicating the unit of measurement. Useful if you cannot provide a standard unit code for
   * <a href='unitCode'>unitCode</a>. */
  @JsonldProperty("http://schema.org/unitText")
  public String unitText;

  /**
   * The unit of measurement given using the UN/CEFACT Common Code (3 characters) or a URL. Other codes than the UN/CEFACT Common Code may be used with a prefix followed by a colon. */
  @JsonldProperty("http://schema.org/unitCode")
  public List<String> unitCodeText;

  /**
   * The quantity of the goods included in the offer. */
  @JsonldProperty("http://schema.org/amountOfThisGood")
  public java.math.BigDecimal amountOfThisGood;

  /**
   * The product that this structured value is referring to. */
  @JsonldProperty("http://schema.org/typeOfGood")
  public List<Product> typeOfGoodProduct;

  /**
   * The business function (e.g. sell, lease, repair, dispose) of the offer or component of a bundle (TypeAndQuantityNode). The default is http://purl.org/goodrelations/v1#Sell. */
  @JsonldProperty("http://schema.org/businessFunction")
  public BusinessFunction businessFunction;
}
