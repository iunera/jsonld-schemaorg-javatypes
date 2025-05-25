package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A mountain, like Mount Whitney or Mount Everest. */
@Vertex
@JsonldType("http://schema.org/Mountain")
public class Mountain extends Landform {
}
