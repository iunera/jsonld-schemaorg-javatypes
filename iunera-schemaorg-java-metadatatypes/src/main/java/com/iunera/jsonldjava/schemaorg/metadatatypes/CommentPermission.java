package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Permission to add comments to the document. */
@Vertex
@JsonldType("http://schema.org/CommentPermission")
public class CommentPermission extends DigitalDocumentPermissionType {
}
