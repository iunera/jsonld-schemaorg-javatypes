package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A product or service offered by a bank whereby one may deposit, withdraw or transfer money and in some cases be paid interest. */
@Vertex
@JsonldType("http://schema.org/BankAccount")
public class BankAccount extends FinancialProduct {
}
