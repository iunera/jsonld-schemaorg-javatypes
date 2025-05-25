package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * An electronic file or document. */
@Vertex
@JsonldType("http://schema.org/DigitalDocument")
public class DigitalDocument extends CreativeWork {
  /**
   * A permission related to the access to this document (e.g. permission to read or write an electronic document). For a public document, specify a grantee with an Audience with audienceType equal to "public". */
  @JsonldProperty("http://schema.org/hasDigitalDocumentPermission")
  public DigitalDocumentPermission hasDigitalDocumentPermission;
}
