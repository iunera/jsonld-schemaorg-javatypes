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
 * The act of an agent communicating (service provider, social media, etc) their departure of a previously reserved service (e.g. flight check in) or place (e.g. hotel).
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/CheckInAction">CheckInAction</a>: The antonym of CheckOutAction.</li>
 * <li><a class="localLink" href="/DepartAction">DepartAction</a>: Unlike DepartAction, CheckOutAction implies that the agent is informing/confirming the end of a previously reserved service.</li>
 * <li><a class="localLink" href="/CancelAction">CancelAction</a>: Unlike CancelAction, CheckOutAction implies that the agent is informing/confirming the end of a previously reserved service.</li>
 * </ul>
 */
@Vertex
@JsonldType("http://schema.org/CheckOutAction")
public class CheckOutAction extends CommunicateAction {
}
