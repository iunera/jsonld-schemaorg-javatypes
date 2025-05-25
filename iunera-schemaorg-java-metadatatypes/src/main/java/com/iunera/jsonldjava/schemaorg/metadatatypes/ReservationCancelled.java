package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The status for a previously confirmed reservation that is now cancelled. */
@Vertex
@JsonldType("http://schema.org/ReservationCancelled")
public class ReservationCancelled extends ReservationStatusType {
}
