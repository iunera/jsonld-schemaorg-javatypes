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
 * A trip on a commercial bus line.
 */
@Vertex
@JsonldType("http://schema.org/BusTrip")
public class BusTrip extends Intangible {
    /**
     * The stop or station from which the bus departs.
     */
    @JsonldProperty("http://schema.org/departureBusStop")
    public List<BusStation> departureBusStopBusStation;

    /**
     * The stop or station from which the bus departs.
     */
    @JsonldProperty("http://schema.org/departureBusStop")
    public List<BusStop> departureBusStopBusStop;

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @JsonldProperty("http://schema.org/provider")
    public List<Person> providerPerson;

    /**
     * The expected arrival time.
     */
    @JsonldProperty("http://schema.org/arrivalTime")
    public java.util.Date arrivalTime;

    /**
     * The name of the bus (e.g. Bolt Express).
     */
    @JsonldProperty("http://schema.org/busName")
    public String busName;

    /**
     * The stop or station from which the bus arrives.
     */
    @JsonldProperty("http://schema.org/arrivalBusStop")
    public List<BusStation> arrivalBusStopBusStation;

    /**
     * The unique identifier for the bus.
     */
    @JsonldProperty("http://schema.org/busNumber")
    public String busNumber;

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @JsonldProperty("http://schema.org/provider")
    public List<Organization> providerOrganization;

    /**
     * The expected departure time.
     */
    @JsonldProperty("http://schema.org/departureTime")
    public java.util.Date departureTime;

    /**
     * The stop or station from which the bus arrives.
     */
    @JsonldProperty("http://schema.org/arrivalBusStop")
    public List<BusStop> arrivalBusStopBusStop;
}
