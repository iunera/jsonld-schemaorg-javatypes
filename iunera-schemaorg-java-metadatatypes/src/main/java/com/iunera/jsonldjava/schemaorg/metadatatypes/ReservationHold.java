package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The status of a reservation on hold pending an update like credit card number or flight changes. */
@Vertex
@JsonldType("http://schema.org/ReservationHold")
public class ReservationHold extends ReservationStatusType {
}
