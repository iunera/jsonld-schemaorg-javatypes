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
 * The act of forming a personal connection with someone/something (object) unidirectionally/asymmetrically to get updates pushed to.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/FollowAction">FollowAction</a>: Unlike FollowAction, SubscribeAction implies that the subscriber acts as a passive agent being constantly/actively pushed for updates.</li>
 * <li><a class="localLink" href="/RegisterAction">RegisterAction</a>: Unlike RegisterAction, SubscribeAction implies that the agent is interested in continuing receiving updates from the object.</li>
 * <li><a class="localLink" href="/JoinAction">JoinAction</a>: Unlike JoinAction, SubscribeAction implies that the agent is interested in continuing receiving updates from the object.</li>
 * </ul>
 */
@Vertex
@JsonldType("http://schema.org/SubscribeAction")
public class SubscribeAction extends InteractAction {
}
