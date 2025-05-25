package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A state or province of a country. */
@Vertex
@JsonldType("http://schema.org/State")
public class State extends AdministrativeArea {
}
