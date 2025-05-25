package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Used to describe membership in a loyalty programs (e.g. "StarAliance"), traveler clubs (e.g. "AAA"), purchase clubs ("Safeway Club"), etc. */
@Vertex
@JsonldType("http://schema.org/ProgramMembership")
public class ProgramMembership extends Intangible {
  /**
   * The program providing the membership. */
  @JsonldProperty("http://schema.org/programName")
  public String programName;

  /**
   * A unique identifier for the membership. */
  @JsonldProperty("http://schema.org/membershipNumber")
  public String membershipNumber;

  /**
   * The organization (airline, travelers' club, etc.) the membership is made with. */
  @JsonldProperty("http://schema.org/hostingOrganization")
  public Organization hostingOrganization;
}
