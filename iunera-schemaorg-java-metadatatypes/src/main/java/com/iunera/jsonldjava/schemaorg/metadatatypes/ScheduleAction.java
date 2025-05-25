package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Scheduling future actions, events, or tasks.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/ReserveAction">ReserveAction</a>: Unlike ReserveAction, ScheduleAction allocates future actions (e.g. an event, a task, etc) towards a time slot / spatial allocation.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/ScheduleAction")
public class ScheduleAction extends PlanAction {
}
