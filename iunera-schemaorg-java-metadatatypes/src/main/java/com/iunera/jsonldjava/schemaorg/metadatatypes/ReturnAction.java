package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * The act of returning to the origin that which was previously received (concrete objects) or taken (ownership). */
@Vertex
@JsonldType("http://schema.org/ReturnAction")
public class ReturnAction extends TransferAction {
  /**
   * A sub property of participant. The participant who is at the receiving end of the action. */
  @JsonldProperty("http://schema.org/recipient")
  public List<Organization> recipientOrganization;

  /**
   * A sub property of participant. The participant who is at the receiving end of the action. */
  @JsonldProperty("http://schema.org/recipient")
  public List<Audience> recipientAudience;

  /**
   * A sub property of participant. The participant who is at the receiving end of the action. */
  @JsonldProperty("http://schema.org/recipient")
  public List<Person> recipientPerson;
}
