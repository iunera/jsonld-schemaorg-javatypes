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
 * A reservation for a rental car.
 * Note: This type is for information about actual reservations, e.g. in confirmation emails or HTML pages with individual confirmations of reservations.
 */
@Vertex
@JsonldType("http://schema.org/RentalCarReservation")
public class RentalCarReservation extends Reservation {
    /**
     * Where a rental car can be dropped off.
     */
    @JsonldProperty("http://schema.org/dropoffLocation")
    public Place dropoffLocation;

    /**
     * Where a taxi will pick up a passenger or a rental car can be picked up.
     */
    @JsonldProperty("http://schema.org/pickupLocation")
    public Place pickupLocation;

    /**
     * When a taxi will pickup a passenger or a rental car can be picked up.
     */
    @JsonldProperty("http://schema.org/pickupTime")
    public java.util.Date pickupTime;

    /**
     * When a rental car can be dropped off.
     */
    @JsonldProperty("http://schema.org/dropoffTime")
    public java.util.Date dropoffTime;
}
