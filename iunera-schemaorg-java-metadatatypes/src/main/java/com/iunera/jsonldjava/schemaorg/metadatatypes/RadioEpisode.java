package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A radio episode which can be part of a series or season. */
@Vertex
@JsonldType("http://schema.org/RadioEpisode")
public class RadioEpisode extends Episode {
}
