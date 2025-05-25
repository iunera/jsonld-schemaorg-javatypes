package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of providing an object under an agreement that it will be returned at a later date. Reciprocal of BorrowAction.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/BorrowAction">BorrowAction</a>: Reciprocal of LendAction.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/LendAction")
public class LendAction extends TransferAction {
  /**
   * A sub property of participant. The person that borrows the object being lent. */
  @JsonldProperty("http://schema.org/borrower")
  public Person borrower;
}
