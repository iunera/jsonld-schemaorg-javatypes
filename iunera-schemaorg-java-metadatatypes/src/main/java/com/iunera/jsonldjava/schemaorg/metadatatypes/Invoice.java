package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A statement of the money due for goods or services; a bill. */
@Vertex
@JsonldType("http://schema.org/Invoice")
public class Invoice extends Intangible {
  /**
   * The time interval used to compute the invoice. */
  @JsonldProperty("http://schema.org/billingPeriod")
  public Duration billingPeriod;

  /**
   * The Order(s) related to this Invoice. One or more Orders may be combined into a single Invoice. */
  @JsonldProperty("http://schema.org/referencesOrder")
  public Order referencesOrder;

  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy. */
  @JsonldProperty("http://schema.org/category")
  public List<Thing> categoryThing;

  /**
   * The date that payment is due. */
  @JsonldProperty("http://schema.org/paymentDueDate")
  public java.util.Date paymentDueDate;

  /**
   * A number that confirms the given order or payment has been received. */
  @JsonldProperty("http://schema.org/confirmationNumber")
  public String confirmationNumber;

  /**
   * An identifier for the method of payment used (e.g. the last 4 digits of the credit card). */
  @JsonldProperty("http://schema.org/paymentMethodId")
  public String paymentMethodId;

  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred. */
  @JsonldProperty("http://schema.org/broker")
  public List<Person> brokerPerson;

  /**
   * The minimum payment required at this time. */
  @JsonldProperty("http://schema.org/minimumPaymentDue")
  public List<PriceSpecification> minimumPaymentDuePriceSpecification;

  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller. */
  @JsonldProperty("http://schema.org/provider")
  public List<Person> providerPerson;

  /**
   * Party placing the order or paying the invoice. */
  @JsonldProperty("http://schema.org/customer")
  public List<Person> customerPerson;

  /**
   * The total amount due. */
  @JsonldProperty("http://schema.org/totalPaymentDue")
  public List<PriceSpecification> totalPaymentDuePriceSpecification;

  /**
   * The identifier for the account the payment will be applied to. */
  @JsonldProperty("http://schema.org/accountId")
  public String accountId;

  /**
   * The status of payment; whether the invoice has been paid or not. */
  @JsonldProperty("http://schema.org/paymentStatus")
  public List<PaymentStatusType> paymentStatusPaymentStatusType;

  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred. */
  @JsonldProperty("http://schema.org/broker")
  public List<Organization> brokerOrganization;

  /**
   * The total amount due. */
  @JsonldProperty("http://schema.org/totalPaymentDue")
  public List<MonetaryAmount> totalPaymentDueMonetaryAmount;

  /**
   * The date the invoice is scheduled to be paid. */
  @JsonldProperty("http://schema.org/scheduledPaymentDate")
  public java.util.Date scheduledPaymentDate;

  /**
   * The name of the credit card or other method of payment for the order. */
  @JsonldProperty("http://schema.org/paymentMethod")
  public PaymentMethod paymentMethod;

  /**
   * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy. */
  @JsonldProperty("http://schema.org/category")
  public List<String> categoryText;

  /**
   * The status of payment; whether the invoice has been paid or not. */
  @JsonldProperty("http://schema.org/paymentStatus")
  public List<String> paymentStatusText;

  /**
   * The minimum payment required at this time. */
  @JsonldProperty("http://schema.org/minimumPaymentDue")
  public List<MonetaryAmount> minimumPaymentDueMonetaryAmount;

  /**
   * Party placing the order or paying the invoice. */
  @JsonldProperty("http://schema.org/customer")
  public List<Organization> customerOrganization;

  /**
   * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller. */
  @JsonldProperty("http://schema.org/provider")
  public List<Organization> providerOrganization;
}
