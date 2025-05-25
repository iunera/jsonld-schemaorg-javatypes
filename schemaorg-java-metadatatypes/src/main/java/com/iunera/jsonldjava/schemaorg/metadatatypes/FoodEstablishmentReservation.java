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
 * A reservation to dine at a food-related business.Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
 */
@Vertex
@JsonldType("http://schema.org/FoodEstablishmentReservation")
public class FoodEstablishmentReservation extends Reservation {
    /**
     * The startTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to start. For actions that span a period of time, when the action was performed. e.g. John wrote a book from <em>January</em> to December.
     * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @JsonldProperty("http://schema.org/startTime")
    public java.util.Date startTime;

    /**
     * Number of people the reservation should accommodate.
     */
    @JsonldProperty("http://schema.org/partySize")
    public List<Integer> partySizeInteger;

    /**
     * The endTime of something. For a reserved event or service (e.g. FoodEstablishmentReservation), the time that it is expected to end. For actions that span a period of time, when the action was performed. e.g. John wrote a book from January to <em>December</em>.
     * Note that Event uses startDate/endDate instead of startTime/endTime, even when describing dates with times. This situation may be clarified in future revisions.
     */
    @JsonldProperty("http://schema.org/endTime")
    public java.util.Date endTime;

    /**
     * Number of people the reservation should accommodate.
     */
    @JsonldProperty("http://schema.org/partySize")
    public List<QuantitativeValue> partySizeQuantitativeValue;
}
