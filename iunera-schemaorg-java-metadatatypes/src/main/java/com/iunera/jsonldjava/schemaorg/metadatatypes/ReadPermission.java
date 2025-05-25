package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Permission to read or view the document. */
@Vertex
@JsonldType("http://schema.org/ReadPermission")
public class ReadPermission extends DigitalDocumentPermissionType {
}
