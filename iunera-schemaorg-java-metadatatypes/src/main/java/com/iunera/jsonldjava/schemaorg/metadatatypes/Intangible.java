package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A utility class that serves as the umbrella for a number of 'intangible' things such as quantities, structured values, etc. */
@Vertex
@JsonldType("http://schema.org/Intangible")
public class Intangible extends Thing {
}
