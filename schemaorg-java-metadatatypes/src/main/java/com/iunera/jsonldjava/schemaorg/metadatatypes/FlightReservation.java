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
 * A reservation for air travel.
 * Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations. For offers of tickets, use <a class="localLink" href="/Offer">Offer</a>.
 */
@Vertex
@JsonldType("http://schema.org/FlightReservation")
public class FlightReservation extends Reservation {
    /**
     * The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority).
     */
    @JsonldProperty("http://schema.org/passengerPriorityStatus")
    public List<String> passengerPriorityStatusText;

    /**
     * The passenger's sequence number as assigned by the airline.
     */
    @JsonldProperty("http://schema.org/passengerSequenceNumber")
    public String passengerSequenceNumber;

    /**
     * The priority status assigned to a passenger for security or boarding (e.g. FastTrack or Priority).
     */
    @JsonldProperty("http://schema.org/passengerPriorityStatus")
    public List<QualitativeValue> passengerPriorityStatusQualitativeValue;

    /**
     * The type of security screening the passenger is subject to.
     */
    @JsonldProperty("http://schema.org/securityScreening")
    public String securityScreening;

    /**
     * The airline-specific indicator of boarding order / preference.
     */
    @JsonldProperty("http://schema.org/boardingGroup")
    public String boardingGroup;
}
