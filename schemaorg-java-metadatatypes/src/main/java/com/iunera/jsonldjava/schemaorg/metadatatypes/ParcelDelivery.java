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
 * The delivery of a parcel either via the postal service or a commercial service.
 */
@Vertex
@JsonldType("http://schema.org/ParcelDelivery")
public class ParcelDelivery extends Intangible {
    /**
     * Shipper's address.
     */
    @JsonldProperty("http://schema.org/originAddress")
    public PostalAddress originAddress;

    /**
     * Destination address.
     */
    @JsonldProperty("http://schema.org/deliveryAddress")
    public PostalAddress deliveryAddress;

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @JsonldProperty("http://schema.org/provider")
    public List<Person> providerPerson;

    /**
     * Method used for delivery or shipping.
     */
    @JsonldProperty("http://schema.org/hasDeliveryMethod")
    public DeliveryMethod hasDeliveryMethod;

    /**
     * The earliest date the package may arrive.
     */
    @JsonldProperty("http://schema.org/expectedArrivalFrom")
    public java.util.Date expectedArrivalFrom;

    /**
     * Item(s) being shipped.
     */
    @JsonldProperty("http://schema.org/itemShipped")
    public Product itemShipped;

    /**
     * New entry added as the package passes through each leg of its journey (from shipment to final delivery).
     */
    @JsonldProperty("http://schema.org/deliveryStatus")
    public DeliveryEvent deliveryStatus;

    /**
     * Shipper tracking number.
     */
    @JsonldProperty("http://schema.org/trackingNumber")
    public String trackingNumber;

    /**
     * Tracking url for the parcel delivery.
     */
    @JsonldProperty("http://schema.org/trackingUrl")
    public java.net.URL trackingUrl;

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @JsonldProperty("http://schema.org/provider")
    public List<Organization> providerOrganization;

    /**
     * The overall order the items in this delivery were included in.
     */
    @JsonldProperty("http://schema.org/partOfOrder")
    public Order partOfOrder;

    /**
     * The latest date the package may arrive.
     */
    @JsonldProperty("http://schema.org/expectedArrivalUntil")
    public java.util.Date expectedArrivalUntil;
}
