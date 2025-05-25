package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A type of financial product that typically requires the client to transfer funds to a financial service in return for potential beneficial financial return. */
@Vertex
@JsonldType("http://schema.org/InvestmentOrDeposit")
public class InvestmentOrDeposit extends FinancialProduct {
  /**
   * The amount of money. */
  @JsonldProperty("http://schema.org/amount")
  public List<MonetaryAmount> amountMonetaryAmount;

  /**
   * The amount of money. */
  @JsonldProperty("http://schema.org/amount")
  public List<java.math.BigDecimal> amountNumber;
}
