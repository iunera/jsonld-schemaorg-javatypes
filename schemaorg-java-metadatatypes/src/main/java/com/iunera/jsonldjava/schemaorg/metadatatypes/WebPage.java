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
 * A web page. Every web page is implicitly assumed to be declared to be of type WebPage, so the various properties about that webpage, such as <code>breadcrumb</code> may be used. We recommend explicit declaration if these properties are specified, but if they are found outside of an itemscope, they will be assumed to be about the page.
 */
@Vertex
@JsonldType("http://schema.org/WebPage")
public class WebPage extends CreativeWork {
    /**
     * A set of links that can help a user understand and navigate a website hierarchy.
     */
    @JsonldProperty("http://schema.org/breadcrumb")
    public List<BreadcrumbList> breadcrumbBreadcrumbList;

    /**
     * One of the domain specialities to which this web page's content applies.
     */
    @JsonldProperty("http://schema.org/specialty")
    public Specialty specialty;

    /**
     * One of the more significant URLs on the page. Typically, these are the non-navigation links that are clicked on the most.
     */
    @JsonldProperty("http://schema.org/significantLink")
    public java.net.URL significantLink;

    /**
     * Date on which the content on this web page was last reviewed for accuracy and/or completeness.
     */
    @JsonldProperty("http://schema.org/lastReviewed")
    public java.util.Date lastReviewed;

    /**
     * Indicates the main image on the page.
     */
    @JsonldProperty("http://schema.org/primaryImageOfPage")
    public ImageObject primaryImageOfPage;

    /**
     * People or organizations that have reviewed the content on this web page for accuracy and/or completeness.
     */
    @JsonldProperty("http://schema.org/reviewedBy")
    public List<Person> reviewedByPerson;

    /**
     * Indicates if this web page element is the main subject of the page.
     */
    @JsonldProperty("http://schema.org/mainContentOfPage")
    public WebPageElement mainContentOfPage;

    /**
     * A link related to this web page, for example to other related web pages.
     */
    @JsonldProperty("http://schema.org/relatedLink")
    public java.net.URL relatedLink;

    /**
     * People or organizations that have reviewed the content on this web page for accuracy and/or completeness.
     */
    @JsonldProperty("http://schema.org/reviewedBy")
    public List<Organization> reviewedByOrganization;

    /**
     * A set of links that can help a user understand and navigate a website hierarchy.
     */
    @JsonldProperty("http://schema.org/breadcrumb")
    public List<String> breadcrumbText;
}
