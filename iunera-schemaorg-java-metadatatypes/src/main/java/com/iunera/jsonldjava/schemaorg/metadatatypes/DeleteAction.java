package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of editing a recipient by removing one of its objects. */
@Vertex
@JsonldType("http://schema.org/DeleteAction")
public class DeleteAction extends UpdateAction {
}
