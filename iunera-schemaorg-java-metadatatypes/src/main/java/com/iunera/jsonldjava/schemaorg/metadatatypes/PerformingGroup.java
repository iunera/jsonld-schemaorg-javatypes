package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A performance group, such as a band, an orchestra, or a circus. */
@Vertex
@JsonldType("http://schema.org/PerformingGroup")
public class PerformingGroup extends Organization {
}
