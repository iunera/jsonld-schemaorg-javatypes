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
 * Specifies a location feature by providing a structured value representing a feature of an accommodation as a property-value pair of varying degrees of formality.
 */
@Vertex
@JsonldType("http://schema.org/LocationFeatureSpecification")
public class LocationFeatureSpecification extends PropertyValue {
    /**
     * The date when the item becomes valid.
     */
    @JsonldProperty("http://schema.org/validFrom")
    public java.util.Date validFrom;

    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     */
    @JsonldProperty("http://schema.org/validThrough")
    public java.util.Date validThrough;

    /**
     * The hours during which this service or contact is available.
     */
    @JsonldProperty("http://schema.org/hoursAvailable")
    public OpeningHoursSpecification hoursAvailable;
}
