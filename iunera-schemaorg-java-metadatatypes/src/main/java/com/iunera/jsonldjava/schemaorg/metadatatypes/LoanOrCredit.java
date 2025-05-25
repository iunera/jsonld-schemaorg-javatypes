package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A financial product for the loaning of an amount of money under agreed terms and charges. */
@Vertex
@JsonldType("http://schema.org/LoanOrCredit")
public class LoanOrCredit extends FinancialProduct {
  /**
   * The duration of the loan or credit agreement. */
  @JsonldProperty("http://schema.org/loanTerm")
  public QuantitativeValue loanTerm;

  /**
   * Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.) */
  @JsonldProperty("http://schema.org/requiredCollateral")
  public List<String> requiredCollateralText;

  /**
   * The amount of money. */
  @JsonldProperty("http://schema.org/amount")
  public List<MonetaryAmount> amountMonetaryAmount;

  /**
   * The amount of money. */
  @JsonldProperty("http://schema.org/amount")
  public List<java.math.BigDecimal> amountNumber;

  /**
   * Assets required to secure loan or credit repayments. It may take form of third party pledge, goods, financial instruments (cash, securities, etc.) */
  @JsonldProperty("http://schema.org/requiredCollateral")
  public List<Thing> requiredCollateralThing;
}
