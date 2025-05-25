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
 * The act of giving money in return for temporary use, but not ownership, of an object such as a vehicle or property. For example, an agent rents a property from a landlord in exchange for a periodic payment.
 */
@Vertex
@JsonldType("http://schema.org/RentAction")
public class RentAction extends TradeAction {
    /**
     * A sub property of participant. The owner of the real estate property.
     */
    @JsonldProperty("http://schema.org/landlord")
    public List<Person> landlordPerson;

    /**
     * A sub property of participant. The real estate agent involved in the action.
     */
    @JsonldProperty("http://schema.org/realEstateAgent")
    public RealEstateAgent realEstateAgent;

    /**
     * A sub property of participant. The owner of the real estate property.
     */
    @JsonldProperty("http://schema.org/landlord")
    public List<Organization> landlordOrganization;
}
