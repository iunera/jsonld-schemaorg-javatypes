package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A reservoir of water, typically an artificially created lake, like the Lake Kariba reservoir. */
@Vertex
@JsonldType("http://schema.org/Reservoir")
public class Reservoir extends BodyOfWater {
}
