package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A permit issued by an organization, e.g. a parking pass. */
@Vertex
@JsonldType("http://schema.org/Permit")
public class Permit extends Intangible {
  /**
   * The date when the item is no longer valid. */
  @JsonldProperty("http://schema.org/validUntil")
  public java.util.Date validUntil;

  /**
   * The organization issuing the ticket or permit. */
  @JsonldProperty("http://schema.org/issuedBy")
  public Organization issuedBy;

  /**
   * The time validity of the permit. */
  @JsonldProperty("http://schema.org/validFor")
  public Duration validFor;

  /**
   * The service through with the permit was granted. */
  @JsonldProperty("http://schema.org/issuedThrough")
  public Service issuedThrough;

  /**
   * The date when the item becomes valid. */
  @JsonldProperty("http://schema.org/validFrom")
  public java.util.Date validFrom;

  /**
   * The geographic area where the permit is valid. */
  @JsonldProperty("http://schema.org/validIn")
  public AdministrativeArea validIn;

  /**
   * The target audience for this permit. */
  @JsonldProperty("http://schema.org/permitAudience")
  public Audience permitAudience;
}
