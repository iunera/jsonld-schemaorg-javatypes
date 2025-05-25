package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of an agent communicating (service provider, social media, etc) their departure of a previously reserved service (e.g. flight check in) or place (e.g. hotel).
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/CheckInAction">CheckInAction</a>: The antonym of CheckOutAction.</li>
 * <li><a class="localLink" href="/DepartAction">DepartAction</a>: Unlike DepartAction, CheckOutAction implies that the agent is informing/confirming the end of a previously reserved service.</li>
 * <li><a class="localLink" href="/CancelAction">CancelAction</a>: Unlike CancelAction, CheckOutAction implies that the agent is informing/confirming the end of a previously reserved service.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/CheckOutAction")
public class CheckOutAction extends CommunicateAction {
}
