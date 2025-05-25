package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * The act of giving money in return for temporary use, but not ownership, of an object such as a vehicle or property. For example, an agent rents a property from a landlord in exchange for a periodic payment. */
@Vertex
@JsonldType("http://schema.org/RentAction")
public class RentAction extends TradeAction {
  /**
   * A sub property of participant. The owner of the real estate property. */
  @JsonldProperty("http://schema.org/landlord")
  public List<Person> landlordPerson;

  /**
   * A sub property of participant. The real estate agent involved in the action. */
  @JsonldProperty("http://schema.org/realEstateAgent")
  public RealEstateAgent realEstateAgent;

  /**
   * A sub property of participant. The owner of the real estate property. */
  @JsonldProperty("http://schema.org/landlord")
  public List<Organization> landlordOrganization;
}
