package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of obtaining an object under an agreement to return it at a later date. Reciprocal of LendAction.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/LendAction">LendAction</a>: Reciprocal of BorrowAction.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/BorrowAction")
public class BorrowAction extends TransferAction {
  /**
   * A sub property of participant. The person that lends the object being borrowed. */
  @JsonldProperty("http://schema.org/lender")
  public Person lender;
}
