package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A reservation for an event like a concert, sporting event, or lecture.
 * Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use <a class="localLink" href="/Offer">Offer</a>. */
@Vertex
@JsonldType("http://schema.org/EventReservation")
public class EventReservation extends Reservation {
}
