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
 * A brand is a name used by an organization or business person for labeling a product, product group, or similar.
 */
@Vertex
@JsonldType("http://schema.org/Brand")
public class Brand extends Intangible {
    /**
     * A review of the item.
     */
    @JsonldProperty("http://schema.org/review")
    public Review review;

    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @JsonldProperty("http://schema.org/aggregateRating")
    public AggregateRating aggregateRating;

    /**
     * An associated logo.
     */
    @JsonldProperty("http://schema.org/logo")
    public List<ImageObject> logoImageObject;

    /**
     * An associated logo.
     */
    @JsonldProperty("http://schema.org/logo")
    public List<java.net.URL> logoURL;
}
