package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Lists or enumerations—for example, a list of cuisines or music genres, etc. */
@Vertex
@JsonldType("http://schema.org/Enumeration")
public class Enumeration extends Intangible {
}
