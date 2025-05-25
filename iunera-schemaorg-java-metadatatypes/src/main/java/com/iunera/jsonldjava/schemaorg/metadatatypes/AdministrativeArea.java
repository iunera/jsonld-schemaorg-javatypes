package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A geographical region, typically under the jurisdiction of a particular government. */
@Vertex
@JsonldType("http://schema.org/AdministrativeArea")
public class AdministrativeArea extends Place {
}
