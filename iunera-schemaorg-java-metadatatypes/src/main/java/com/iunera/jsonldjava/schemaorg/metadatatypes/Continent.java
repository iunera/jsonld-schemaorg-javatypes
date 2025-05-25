package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * One of the continents (for example, Europe or Africa). */
@Vertex
@JsonldType("http://schema.org/Continent")
public class Continent extends Landform {
}
