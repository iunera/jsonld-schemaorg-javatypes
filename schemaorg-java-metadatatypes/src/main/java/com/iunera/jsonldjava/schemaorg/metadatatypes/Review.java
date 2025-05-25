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
 * A review of an item - for example, of a restaurant, movie, or store.
 */
@Vertex
@JsonldType("http://schema.org/Review")
public class Review extends CreativeWork {
    /**
     * The actual body of the review.
     */
    @JsonldProperty("http://schema.org/reviewBody")
    public String reviewBody;

    /**
     * The rating given in this review. Note that reviews can themselves be rated. The <code>reviewRating</code> applies to rating given by the review. The <a class="localLink" href="/aggregateRating">aggregateRating</a> property applies to the review itself, as a creative work.
     */
    @JsonldProperty("http://schema.org/reviewRating")
    public Rating reviewRating;

    /**
     * The item that is being reviewed/rated.
     */
    @JsonldProperty("http://schema.org/itemReviewed")
    public Thing itemReviewed;
}
