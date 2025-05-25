package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An agent orders an object/product/service to be delivered/sent. */
@Vertex
@JsonldType("http://schema.org/OrderAction")
public class OrderAction extends TradeAction {
  /**
   * A sub property of instrument. The method of delivery. */
  @JsonldProperty("http://schema.org/deliveryMethod")
  public DeliveryMethod deliveryMethod;
}
