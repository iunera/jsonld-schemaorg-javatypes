package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A card payment method of a particular brand or name.  Used to mark up a particular payment method and/or the financial product/service that supplies the card account.
 * Commonly used values:
 * <ul>
 * <li>http://purl.org/goodrelations/v1#AmericanExpress</li>
 * <li>http://purl.org/goodrelations/v1#DinersClub</li>
 * <li>http://purl.org/goodrelations/v1#Discover</li>
 * <li>http://purl.org/goodrelations/v1#JCB</li>
 * <li>http://purl.org/goodrelations/v1#MasterCard</li>
 * <li>http://purl.org/goodrelations/v1#VISA</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/CreditCard")
public class CreditCard extends PaymentCard {
  /**
   * This one of additional original supertypes as defined at schema.org. However, Java does not support multi class inheritance and therefore a composition was used. */
  @JsonldProperty("http://schema.org/LoanOrCredit")
  public LoanOrCredit loanOrCredit;
}
