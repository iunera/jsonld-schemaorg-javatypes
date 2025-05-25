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

/**
 * Used to describe membership in a loyalty programs (e.g. "StarAliance"), traveler clubs (e.g. "AAA"), purchase clubs ("Safeway Club"), etc.
 */
@Vertex
@JsonldType("http://schema.org/ProgramMembership")
public class ProgramMembership extends Intangible {
    /**
     * The program providing the membership.
     */
    @JsonldProperty("http://schema.org/programName")
    public String programName;

    /**
     * A unique identifier for the membership.
     */
    @JsonldProperty("http://schema.org/membershipNumber")
    public String membershipNumber;

    /**
     * The organization (airline, travelers' club, etc.) the membership is made with.
     */
    @JsonldProperty("http://schema.org/hostingOrganization")
    public Organization hostingOrganization;
}
