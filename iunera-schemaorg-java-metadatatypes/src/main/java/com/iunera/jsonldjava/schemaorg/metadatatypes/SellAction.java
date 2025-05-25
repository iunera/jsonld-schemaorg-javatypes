package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of taking money from a buyer in exchange for goods or services rendered. An agent sells an object, product, or service to a buyer for a price. Reciprocal of BuyAction. */
@Vertex
@JsonldType("http://schema.org/SellAction")
public class SellAction extends TradeAction {
  /**
   * A sub property of participant. The participant/person/organization that bought the object. */
  @JsonldProperty("http://schema.org/buyer")
  public Person buyer;
}
