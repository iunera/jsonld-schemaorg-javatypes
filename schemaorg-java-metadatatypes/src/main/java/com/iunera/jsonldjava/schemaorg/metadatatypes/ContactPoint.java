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
 * A contact point&#x2014;for example, a Customer Complaints department.
 */
@Vertex
@JsonldType("http://schema.org/ContactPoint")
public class ContactPoint extends StructuredValue {
    /**
     * The geographic area where a service or offered item is provided.
     */
    @JsonldProperty("http://schema.org/areaServed")
    public List<Place> areaServedPlace;

    /**
     * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. "iPhone") or a general category of products or services (e.g. "smartphones").
     */
    @JsonldProperty("http://schema.org/productSupported")
    public List<String> productSupportedText;

    /**
     * The geographic area where a service or offered item is provided.
     */
    @JsonldProperty("http://schema.org/areaServed")
    public List<String> areaServedText;

    /**
     * The product or service this support contact point is related to (such as product support for a particular product line). This can be a specific product or product line (e.g. "iPhone") or a general category of products or services (e.g. "smartphones").
     */
    @JsonldProperty("http://schema.org/productSupported")
    public List<Product> productSupportedProduct;

    /**
     * The geographic area where a service or offered item is provided.
     */
    @JsonldProperty("http://schema.org/areaServed")
    public List<GeoShape> areaServedGeoShape;

    /**
     * A person or organization can have different contact points, for different purposes. For example, a sales contact point, a PR contact point and so on. This property is used to specify the kind of contact point.
     */
    @JsonldProperty("http://schema.org/contactType")
    public String contactType;

    /**
     * The fax number.
     */
    @JsonldProperty("http://schema.org/faxNumber")
    public String faxNumber;

    /**
     * The geographic area where a service or offered item is provided.
     */
    @JsonldProperty("http://schema.org/areaServed")
    public List<AdministrativeArea> areaServedAdministrativeArea;

    /**
     * A language someone may use with the item. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="/inLanguage">inLanguage</a>
     */
    @JsonldProperty("http://schema.org/availableLanguage")
    public List<String> availableLanguageText;

    /**
     * Email address.
     */
    @JsonldProperty("http://schema.org/email")
    public String email;

    /**
     * An option available on this contact point (e.g. a toll-free number or support for hearing-impaired callers).
     */
    @JsonldProperty("http://schema.org/contactOption")
    public ContactPointOption contactOption;

    /**
     * The telephone number.
     */
    @JsonldProperty("http://schema.org/telephone")
    public String telephone;

    /**
     * The hours during which this service or contact is available.
     */
    @JsonldProperty("http://schema.org/hoursAvailable")
    public OpeningHoursSpecification hoursAvailable;

    /**
     * A language someone may use with the item. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="/inLanguage">inLanguage</a>
     */
    @JsonldProperty("http://schema.org/availableLanguage")
    public List<Language> availableLanguageLanguage;
}
