/*
 * Copyright (C) 2025.  Tim Frey, Christian Schmitt
 *
 * Licensed under the OPEN COMPENSATION TOKEN LICENSE (the "License").
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at <a href="https://www.license-token.com/license/text">https://www.license-token.com/license/text</a>
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either expressed or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @octl.sid: 4efebf98-4efe-ff98-bf98-00004eb04127
 *
 */

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
 * </ul>
 */
@Vertex
@JsonldType("http://schema.org/RegisterAction")
public class RegisterAction extends InteractAction {
}
