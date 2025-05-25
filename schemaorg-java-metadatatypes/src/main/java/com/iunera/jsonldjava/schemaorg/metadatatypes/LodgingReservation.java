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
 * A reservation for lodging at a hotel, motel, inn, etc.
 * Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
 */
@Vertex
@JsonldType("http://schema.org/LodgingReservation")
public class LodgingReservation extends Reservation {
    /**
     * The number of children staying in the unit.
     */
    @JsonldProperty("http://schema.org/numChildren")
    public List<QuantitativeValue> numChildrenQuantitativeValue;

    /**
     * The number of adults staying in the unit.
     */
    @JsonldProperty("http://schema.org/numAdults")
    public List<QuantitativeValue> numAdultsQuantitativeValue;

    /**
     * A full description of the lodging unit.
     */
    @JsonldProperty("http://schema.org/lodgingUnitDescription")
    public String lodgingUnitDescription;

    /**
     * The earliest someone may check into a lodging establishment.
     */
    @JsonldProperty("http://schema.org/checkinTime")
    public java.util.Date checkinTime;

    /**
     * The number of adults staying in the unit.
     */
    @JsonldProperty("http://schema.org/numAdults")
    public List<Integer> numAdultsInteger;

    /**
     * The latest someone may check out of a lodging establishment.
     */
    @JsonldProperty("http://schema.org/checkoutTime")
    public java.util.Date checkoutTime;

    /**
     * The number of children staying in the unit.
     */
    @JsonldProperty("http://schema.org/numChildren")
    public List<Integer> numChildrenInteger;

    /**
     * Textual description of the unit type (including suite vs. room, size of bed, etc.).
     */
    @JsonldProperty("http://schema.org/lodgingUnitType")
    public List<String> lodgingUnitTypeText;

    /**
     * Textual description of the unit type (including suite vs. room, size of bed, etc.).
     */
    @JsonldProperty("http://schema.org/lodgingUnitType")
    public List<QualitativeValue> lodgingUnitTypeQualitativeValue;
}
