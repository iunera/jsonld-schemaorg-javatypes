package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The event has been postponed and no new date has been set. The event's previousStartDate should be set. */
@Vertex
@JsonldType("http://schema.org/EventPostponed")
public class EventPostponed extends EventStatusType {
}
