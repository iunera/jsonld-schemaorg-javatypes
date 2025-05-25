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
 * The act of gaining ownership of an object from an origin. Reciprocal of GiveAction.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/GiveAction">GiveAction</a>: The reciprocal of TakeAction.</li>
 * <li><a class="localLink" href="/ReceiveAction">ReceiveAction</a>: Unlike ReceiveAction, TakeAction implies that ownership has been transfered.</li>
 * </ul>
 */
@Vertex
@JsonldType("http://schema.org/TakeAction")
public class TakeAction extends TransferAction {
}
