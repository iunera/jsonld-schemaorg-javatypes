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
 * A rating is an evaluation on a numeric scale, such as 1 to 5 stars.
 */
@Vertex
@JsonldType("http://schema.org/Rating")
public class Rating extends Intangible {
    /**
     * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
     */
    @JsonldProperty("http://schema.org/worstRating")
    public List<String> worstRatingText;

    /**
     * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
     */
    @JsonldProperty("http://schema.org/bestRating")
    public List<String> bestRatingText;

    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @JsonldProperty("http://schema.org/author")
    public List<Organization> authorOrganization;

    /**
     * The rating for the content.
     */
    @JsonldProperty("http://schema.org/ratingValue")
    public List<String> ratingValueText;

    /**
     * The rating for the content.
     */
    @JsonldProperty("http://schema.org/ratingValue")
    public List<java.math.BigDecimal> ratingValueNumber;

    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @JsonldProperty("http://schema.org/author")
    public List<Person> authorPerson;

    /**
     * The highest value allowed in this rating system. If bestRating is omitted, 5 is assumed.
     */
    @JsonldProperty("http://schema.org/bestRating")
    public List<java.math.BigDecimal> bestRatingNumber;

    /**
     * The lowest value allowed in this rating system. If worstRating is omitted, 1 is assumed.
     */
    @JsonldProperty("http://schema.org/worstRating")
    public List<java.math.BigDecimal> worstRatingNumber;
}
