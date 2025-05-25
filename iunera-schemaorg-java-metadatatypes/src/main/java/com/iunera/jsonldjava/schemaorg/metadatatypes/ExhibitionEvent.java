package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Event type: Exhibition event, e.g. at a museum, library, archive, tradeshow, ... */
@Vertex
@JsonldType("http://schema.org/ExhibitionEvent")
public class ExhibitionEvent extends Event {
}
