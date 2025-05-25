package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Permission to write or edit the document. */
@Vertex
@JsonldType("http://schema.org/WritePermission")
public class WritePermission extends DigitalDocumentPermissionType {
}
