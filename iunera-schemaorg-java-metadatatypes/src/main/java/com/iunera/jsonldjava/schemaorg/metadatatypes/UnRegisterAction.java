package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of un-registering from a service.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/RegisterAction">RegisterAction</a>: antonym of UnRegisterAction.</li>
 * <li><a class="localLink" href="/Leave">Leave</a>: Unlike LeaveAction, UnRegisterAction implies that you are unregistering from a service you werer previously registered, rather than leaving a team/group of people.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/UnRegisterAction")
public class UnRegisterAction extends InteractAction {
}
