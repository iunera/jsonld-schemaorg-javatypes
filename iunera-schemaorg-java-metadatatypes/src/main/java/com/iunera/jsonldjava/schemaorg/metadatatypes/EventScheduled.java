package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The event is taking place or has taken place on the startDate as scheduled. Use of this value is optional, as it is assumed by default. */
@Vertex
@JsonldType("http://schema.org/EventScheduled")
public class EventScheduled extends EventStatusType {
}
