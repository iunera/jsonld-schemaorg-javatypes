package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * The act of giving money voluntarily to a beneficiary in recognition of services rendered. */
@Vertex
@JsonldType("http://schema.org/TipAction")
public class TipAction extends TradeAction {
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
