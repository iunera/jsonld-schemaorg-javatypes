package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * An order item is a line of an order. It includes the quantity and shipping details of a bought offer. */
@Vertex
@JsonldType("http://schema.org/OrderItem")
public class OrderItem extends Intangible {
  /**
   * The item ordered. */
  @JsonldProperty("http://schema.org/orderedItem")
  public List<Product> orderedItemProduct;

  /**
   * The item ordered. */
  @JsonldProperty("http://schema.org/orderedItem")
  public List<OrderItem> orderedItemOrderItem;

  /**
   * The identifier of the order item. */
  @JsonldProperty("http://schema.org/orderItemNumber")
  public String orderItemNumber;

  /**
   * The delivery of the parcel related to this order or order item. */
  @JsonldProperty("http://schema.org/orderDelivery")
  public ParcelDelivery orderDelivery;

  /**
   * The current status of the order item. */
  @JsonldProperty("http://schema.org/orderItemStatus")
  public OrderStatus orderItemStatus;

  /**
   * The number of the item ordered. If the property is not set, assume the quantity is one. */
  @JsonldProperty("http://schema.org/orderQuantity")
  public java.math.BigDecimal orderQuantity;
}
