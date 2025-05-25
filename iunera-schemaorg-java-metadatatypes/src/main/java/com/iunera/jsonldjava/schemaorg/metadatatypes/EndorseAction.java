package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * An agent approves/certifies/likes/supports/sanction an object. */
@Vertex
@JsonldType("http://schema.org/EndorseAction")
public class EndorseAction extends ReactAction {
  /**
   * A sub property of participant. The person/organization being supported. */
  @JsonldProperty("http://schema.org/endorsee")
  public List<Person> endorseePerson;

  /**
   * A sub property of participant. The person/organization being supported. */
  @JsonldProperty("http://schema.org/endorsee")
  public List<Organization> endorseeOrganization;
}
