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
 * A lodging business, such as a motel, hotel, or inn.
 */
@Vertex
@JsonldType("http://schema.org/LodgingBusiness")
public class LodgingBusiness extends LocalBusiness {
    /**
     * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
     */
    @JsonldProperty("http://schema.org/petsAllowed")
    public List<Boolean> petsAllowedBoolean;

    /**
     * The earliest someone may check into a lodging establishment.
     */
    @JsonldProperty("http://schema.org/checkinTime")
    public java.util.Date checkinTime;

    /**
     * Indicates whether pets are allowed to enter the accommodation or lodging business. More detailed information can be put in a text value.
     */
    @JsonldProperty("http://schema.org/petsAllowed")
    public List<String> petsAllowedText;

    /**
     * An amenity feature (e.g. a characteristic or service) of the Accommodation. This generic property does not make a statement about whether the feature is included in an offer for the main accommodation or available at extra costs.
     */
    @JsonldProperty("http://schema.org/amenityFeature")
    public LocationFeatureSpecification amenityFeature;

    /**
     * An official rating for a lodging business or food establishment, e.g. from national associations or standards bodies. Use the author property to indicate the rating organization, e.g. as an Organization with name such as (e.g. HOTREC, DEHOGA, WHR, or Hotelstars).
     */
    @JsonldProperty("http://schema.org/starRating")
    public Rating starRating;

    /**
     * The latest someone may check out of a lodging establishment.
     */
    @JsonldProperty("http://schema.org/checkoutTime")
    public java.util.Date checkoutTime;

    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @JsonldProperty("http://schema.org/audience")
    public Audience audience;

    /**
     * A language someone may use with the item. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="/inLanguage">inLanguage</a>
     */
    @JsonldProperty("http://schema.org/availableLanguage")
    public List<String> availableLanguageText;

    /**
     * A language someone may use with the item. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="/inLanguage">inLanguage</a>
     */
    @JsonldProperty("http://schema.org/availableLanguage")
    public List<Language> availableLanguageLanguage;
}
