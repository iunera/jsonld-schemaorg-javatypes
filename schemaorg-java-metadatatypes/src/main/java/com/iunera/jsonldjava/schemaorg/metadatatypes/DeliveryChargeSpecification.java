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
 * The price for the delivery of an offer using a particular delivery method.
 */
@Vertex
@JsonldType("http://schema.org/DeliveryChargeSpecification")
public class DeliveryChargeSpecification extends PriceSpecification {
    /**
     * The geographic area where a service or offered item is provided.
     */
    @JsonldProperty("http://schema.org/areaServed")
    public List<Place> areaServedPlace;

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     * See also <a class="localLink" href="/eligibleRegion">eligibleRegion</a>.
     */
    @JsonldProperty("http://schema.org/ineligibleRegion")
    public List<GeoShape> ineligibleRegionGeoShape;

    /**
     * The geographic area where a service or offered item is provided.
     */
    @JsonldProperty("http://schema.org/areaServed")
    public List<String> areaServedText;

    /**
     * The delivery method(s) to which the delivery charge or payment charge specification applies.
     */
    @JsonldProperty("http://schema.org/appliesToDeliveryMethod")
    public DeliveryMethod appliesToDeliveryMethod;

    /**
     * The geographic area where a service or offered item is provided.
     */
    @JsonldProperty("http://schema.org/areaServed")
    public List<GeoShape> areaServedGeoShape;

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     * See also <a class="localLink" href="/ineligibleRegion">ineligibleRegion</a>.
     */
    @JsonldProperty("http://schema.org/eligibleRegion")
    public List<Place> eligibleRegionPlace;

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     * See also <a class="localLink" href="/ineligibleRegion">ineligibleRegion</a>.
     */
    @JsonldProperty("http://schema.org/eligibleRegion")
    public List<GeoShape> eligibleRegionGeoShape;

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is valid.
     * See also <a class="localLink" href="/ineligibleRegion">ineligibleRegion</a>.
     */
    @JsonldProperty("http://schema.org/eligibleRegion")
    public List<String> eligibleRegionText;

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     * See also <a class="localLink" href="/eligibleRegion">eligibleRegion</a>.
     */
    @JsonldProperty("http://schema.org/ineligibleRegion")
    public List<String> ineligibleRegionText;

    /**
     * The ISO 3166-1 (ISO 3166-1 alpha-2) or ISO 3166-2 code, the place, or the GeoShape for the geo-political region(s) for which the offer or delivery charge specification is not valid, e.g. a region where the transaction is not allowed.
     * See also <a class="localLink" href="/eligibleRegion">eligibleRegion</a>.
     */
    @JsonldProperty("http://schema.org/ineligibleRegion")
    public List<Place> ineligibleRegionPlace;

    /**
     * The geographic area where a service or offered item is provided.
     */
    @JsonldProperty("http://schema.org/areaServed")
    public List<AdministrativeArea> areaServedAdministrativeArea;
}
