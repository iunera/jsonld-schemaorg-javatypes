package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of an agent communicating (service provider, social media, etc) their arrival by registering/confirming for a previously reserved service (e.g. flight check in) or at a place (e.g. hotel), possibly resulting in a result (boarding pass, etc).
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/CheckOutAction">CheckOutAction</a>: The antonym of CheckInAction.</li>
 * <li><a class="localLink" href="/ArriveAction">ArriveAction</a>: Unlike ArriveAction, CheckInAction implies that the agent is informing/confirming the start of a previously reserved service.</li>
 * <li><a class="localLink" href="/ConfirmAction">ConfirmAction</a>: Unlike ConfirmAction, CheckInAction implies that the agent is informing/confirming the <em>start</em> of a previously reserved service rather than its validity/existence.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/CheckInAction")
public class CheckInAction extends CommunicateAction {
}
