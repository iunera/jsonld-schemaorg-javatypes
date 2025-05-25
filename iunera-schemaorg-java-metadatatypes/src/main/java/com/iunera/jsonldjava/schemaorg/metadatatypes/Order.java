package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * An order is a confirmation of a transaction (a receipt), which can contain multiple line items, each represented by an Offer that has been accepted by the customer. */
@Vertex
@JsonldType("http://schema.org/Order")
public class Order extends Intangible {
  /**
   * The item ordered. */
  @JsonldProperty("http://schema.org/orderedItem")
  public List<OrderItem> orderedItemOrderItem;

  /**
   * The identifier of the transaction. */
  @JsonldProperty("http://schema.org/orderNumber")
  public String orderNumber;

  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider. */
  @JsonldProperty("http://schema.org/seller")
  public List<Organization> sellerOrganization;

  /**
   * The date that payment is due. */
  @JsonldProperty("http://schema.org/paymentDueDate")
  public java.util.Date paymentDueDate;

  /**
   * A number that confirms the given order or payment has been received. */
  @JsonldProperty("http://schema.org/confirmationNumber")
  public String confirmationNumber;

  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred. */
  @JsonldProperty("http://schema.org/broker")
  public List<Person> brokerPerson;

  /**
   * The item ordered. */
  @JsonldProperty("http://schema.org/orderedItem")
  public List<Product> orderedItemProduct;

  /**
   * An entity that arranges for an exchange between a buyer and a seller.  In most cases a broker never acquires or releases ownership of a product or service involved in an exchange.  If it is not clear whether an entity is a broker, seller, or buyer, the latter two terms are preferred. */
  @JsonldProperty("http://schema.org/broker")
  public List<Organization> brokerOrganization;

  /**
   * Was the offer accepted as a gift for someone other than the buyer. */
  @JsonldProperty("http://schema.org/isGift")
  public Boolean isGift;

  /**
   * The current status of the order. */
  @JsonldProperty("http://schema.org/orderStatus")
  public OrderStatus orderStatus;

  /**
   * Any discount applied (to an Order). */
  @JsonldProperty("http://schema.org/discount")
  public List<String> discountText;

  /**
   * Code used to redeem a discount. */
  @JsonldProperty("http://schema.org/discountCode")
  public String discountCode;

  /**
   * The offer(s) -- e.g., product, quantity and price combinations -- included in the order. */
  @JsonldProperty("http://schema.org/acceptedOffer")
  public Offer acceptedOffer;

  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider. */
  @JsonldProperty("http://schema.org/seller")
  public List<Person> sellerPerson;

  /**
   * The delivery of the parcel related to this order or order item. */
  @JsonldProperty("http://schema.org/orderDelivery")
  public ParcelDelivery orderDelivery;

  /**
   * An identifier for the method of payment used (e.g. the last 4 digits of the credit card). */
  @JsonldProperty("http://schema.org/paymentMethodId")
  public String paymentMethodId;

  /**
   * Any discount applied (to an Order). */
  @JsonldProperty("http://schema.org/discount")
  public List<java.math.BigDecimal> discountNumber;

  /**
   * The URL for sending a payment. */
  @JsonldProperty("http://schema.org/paymentUrl")
  public java.net.URL paymentUrl;

  /**
   * Party placing the order or paying the invoice. */
  @JsonldProperty("http://schema.org/customer")
  public List<Person> customerPerson;

  /**
   * The currency (in 3-letter ISO 4217 format) of the discount. */
  @JsonldProperty("http://schema.org/discountCurrency")
  public String discountCurrency;

  /**
   * The name of the credit card or other method of payment for the order. */
  @JsonldProperty("http://schema.org/paymentMethod")
  public PaymentMethod paymentMethod;

  /**
   * Party placing the order or paying the invoice. */
  @JsonldProperty("http://schema.org/customer")
  public List<Organization> customerOrganization;

  /**
   * The order is being paid as part of the referenced Invoice. */
  @JsonldProperty("http://schema.org/partOfInvoice")
  public Invoice partOfInvoice;

  /**
   * Date order was placed. */
  @JsonldProperty("http://schema.org/orderDate")
  public java.util.Date orderDate;

  /**
   * The billing address for the order. */
  @JsonldProperty("http://schema.org/billingAddress")
  public PostalAddress billingAddress;
}
