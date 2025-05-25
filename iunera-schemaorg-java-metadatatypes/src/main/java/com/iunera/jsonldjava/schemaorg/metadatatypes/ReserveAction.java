package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Reserving a concrete object.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/ScheduleAction">ScheduleAction</a>: Unlike ScheduleAction, ReserveAction reserves concrete objects (e.g. a table, a hotel) towards a time slot / spatial allocation.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/ReserveAction")
public class ReserveAction extends PlanAction {
}
