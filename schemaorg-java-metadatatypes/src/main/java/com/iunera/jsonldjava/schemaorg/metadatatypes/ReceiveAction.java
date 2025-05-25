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
 * The act of physically/electronically taking delivery of an object thathas been transferred from an origin to a destination. Reciprocal of SendAction.
 * Related actions:
 * <ul>
 * <li><a class="localLink" href="/SendAction">SendAction</a>: The reciprocal of ReceiveAction.</li>
 * <li><a class="localLink" href="/TakeAction">TakeAction</a>: Unlike TakeAction, ReceiveAction does not imply that the ownership has been transfered (e.g. I can receive a package, but it does not mean the package is now mine).</li>
 * </ul>
 */
@Vertex
@JsonldType("http://schema.org/ReceiveAction")
public class ReceiveAction extends TransferAction {
    /**
     * A sub property of instrument. The method of delivery.
     */
    @JsonldProperty("http://schema.org/deliveryMethod")
    public DeliveryMethod deliveryMethod;

    /**
     * A sub property of participant. The participant who is at the sending end of the action.
     */
    @JsonldProperty("http://schema.org/sender")
    public List<Audience> senderAudience;

    /**
     * A sub property of participant. The participant who is at the sending end of the action.
     */
    @JsonldProperty("http://schema.org/sender")
    public List<Organization> senderOrganization;

    /**
     * A sub property of participant. The participant who is at the sending end of the action.
     */
    @JsonldProperty("http://schema.org/sender")
    public List<Person> senderPerson;
}
