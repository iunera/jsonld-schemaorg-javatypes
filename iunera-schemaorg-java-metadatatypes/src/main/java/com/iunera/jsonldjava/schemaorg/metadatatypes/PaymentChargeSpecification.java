package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The costs of settling the payment using a particular payment method. */
@Vertex
@JsonldType("http://schema.org/PaymentChargeSpecification")
public class PaymentChargeSpecification extends PriceSpecification {
  /**
   * The delivery method(s) to which the delivery charge or payment charge specification applies. */
  @JsonldProperty("http://schema.org/appliesToDeliveryMethod")
  public DeliveryMethod appliesToDeliveryMethod;

  /**
   * The payment method(s) to which the payment charge specification applies. */
  @JsonldProperty("http://schema.org/appliesToPaymentMethod")
  public PaymentMethod appliesToPaymentMethod;
}
