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

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

import java.util.List;

/**
 * The act of physically/electronically dispatching an object for transfer from an origin to a destination.Related actions:
 * <ul>
 * <li><a class="localLink" href="/ReceiveAction">ReceiveAction</a>: The reciprocal of SendAction.</li>
 * <li><a class="localLink" href="/GiveAction">GiveAction</a>: Unlike GiveAction, SendAction does not imply the transfer of ownership (e.g. I can send you my laptop, but I'm not necessarily giving it to you).</li>
 * </ul>
 */
@Vertex
@JsonldType("http://schema.org/SendAction")
public class SendAction extends TransferAction {
    /**
     * A sub property of instrument. The method of delivery.
     */
    @JsonldProperty("http://schema.org/deliveryMethod")
    public DeliveryMethod deliveryMethod;

    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @JsonldProperty("http://schema.org/recipient")
    public List<Audience> recipientAudience;

    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @JsonldProperty("http://schema.org/recipient")
    public List<Person> recipientPerson;

    /**
     * A sub property of participant. The participant who is at the receiving end of the action.
     */
    @JsonldProperty("http://schema.org/recipient")
    public List<Organization> recipientOrganization;
}
