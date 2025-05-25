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
 * Used to describe a seat, such as a reserved seat in an event reservation.
 */
@Vertex
@JsonldType("http://schema.org/Seat")
public class Seat extends Intangible {
    /**
     * The type/class of the seat.
     */
    @JsonldProperty("http://schema.org/seatingType")
    public List<QualitativeValue> seatingTypeQualitativeValue;

    /**
     * The type/class of the seat.
     */
    @JsonldProperty("http://schema.org/seatingType")
    public List<String> seatingTypeText;

    /**
     * The section location of the reserved seat (e.g. Orchestra).
     */
    @JsonldProperty("http://schema.org/seatSection")
    public String seatSection;

    /**
     * The location of the reserved seat (e.g., 27).
     */
    @JsonldProperty("http://schema.org/seatNumber")
    public String seatNumber;

    /**
     * The row location of the reserved seat (e.g., B).
     */
    @JsonldProperty("http://schema.org/seatRow")
    public String seatRow;
}
