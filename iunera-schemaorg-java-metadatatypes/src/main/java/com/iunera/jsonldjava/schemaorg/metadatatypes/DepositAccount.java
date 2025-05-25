package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A type of Bank Account with a main purpose of depositing funds to gain interest or other benefits. */
@Vertex
@JsonldType("http://schema.org/DepositAccount")
public class DepositAccount extends BankAccount {
  /**
   * This one of additional original supertypes as defined at schema.org. However, Java does not support multi class inheritance and therefore a composition was used. */
  @JsonldProperty("http://schema.org/InvestmentOrDeposit")
  public InvestmentOrDeposit investmentOrDeposit;
}
