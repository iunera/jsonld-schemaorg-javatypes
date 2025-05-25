package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The act of registering to be a user of a service, product or web page.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/JoinAction">JoinAction</a>: Unlike JoinAction, RegisterAction implies you are registering to be a user of a service, <em>not</em> a group/team of people.</li>
 * <li>[FollowAction]]: Unlike FollowAction, RegisterAction doesn't imply that the agent is expecting to poll for updates from the object.</li>
 * <li><a class="localLink" href="/SubscribeAction">SubscribeAction</a>: Unlike SubscribeAction, RegisterAction doesn't imply that the agent is expecting updates from the object.</li>
 * </ul> */
@Vertex
@JsonldType("http://schema.org/RegisterAction")
public class RegisterAction extends InteractAction {
}
