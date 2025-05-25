package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A permission for a particular person or group to access a particular file. */
@Vertex
@JsonldType("http://schema.org/DigitalDocumentPermission")
public class DigitalDocumentPermission extends Intangible {
  /**
   * The person, organization, contact point, or audience that has been granted this permission. */
  @JsonldProperty("http://schema.org/grantee")
  public List<Audience> granteeAudience;

  /**
   * The person, organization, contact point, or audience that has been granted this permission. */
  @JsonldProperty("http://schema.org/grantee")
  public List<Organization> granteeOrganization;

  /**
   * The person, organization, contact point, or audience that has been granted this permission. */
  @JsonldProperty("http://schema.org/grantee")
  public List<ContactPoint> granteeContactPoint;

  /**
   * The person, organization, contact point, or audience that has been granted this permission. */
  @JsonldProperty("http://schema.org/grantee")
  public List<Person> granteePerson;

  /**
   * The type of permission granted the person, organization, or audience. */
  @JsonldProperty("http://schema.org/permissionType")
  public DigitalDocumentPermissionType permissionType;
}
