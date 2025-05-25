package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of forming a personal connection with someone/something (object) unidirectionally/asymmetrically to get updates pushed to.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/FollowAction">FollowAction</a>: Unlike FollowAction, SubscribeAction implies that the subscriber acts as a passive agent being constantly/actively pushed for updates.</li>
 * <li><a class="localLink" href="/RegisterAction">RegisterAction</a>: Unlike RegisterAction, SubscribeAction implies that the agent is interested in continuing receiving updates from the object.</li>
 * <li><a class="localLink" href="/JoinAction">JoinAction</a>: Unlike JoinAction, SubscribeAction implies that the agent is interested in continuing receiving updates from the object.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/SubscribeAction")
public class SubscribeAction extends InteractAction {
}
