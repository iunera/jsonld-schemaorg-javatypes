package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A payment method using a credit, debit, store or other card to associate the payment with an account. */
@Vertex
@JsonldType("http://schema.org/PaymentCard")
public class PaymentCard extends FinancialProduct {
  /**
   * This one of additional original supertypes as defined at schema.org. However, Java does not support multi class inheritance and therefore a composition was used. */
  @JsonldProperty("http://schema.org/PaymentMethod")
  public PaymentMethod paymentMethod;
}
