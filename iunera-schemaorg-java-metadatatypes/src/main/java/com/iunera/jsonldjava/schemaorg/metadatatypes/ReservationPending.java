package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The status of a reservation when a request has been sent, but not confirmed. */
@Vertex
@JsonldType("http://schema.org/ReservationPending")
public class ReservationPending extends ReservationStatusType {
}
