package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * The act of giving money to a seller in exchange for goods or services rendered. An agent buys an object, product, or service from a seller for a price. Reciprocal of SellAction. */
@Vertex
@JsonldType("http://schema.org/BuyAction")
public class BuyAction extends TradeAction {
  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider. */
  @JsonldProperty("http://schema.org/seller")
  public List<Organization> sellerOrganization;

  /**
   * An entity which offers (sells / leases / lends / loans) the services / goods.  A seller may also be a provider. */
  @JsonldProperty("http://schema.org/seller")
  public List<Person> sellerPerson;
}
