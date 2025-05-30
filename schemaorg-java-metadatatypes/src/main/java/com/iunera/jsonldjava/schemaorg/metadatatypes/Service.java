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
 * A service provided by an organization, e.g. delivery service, print services, etc.
 */
@Vertex
@JsonldType("http://schema.org/Service")
public class Service extends Intangible {
    /**
     * The geographic area where a service or offered item is provided.
     */
    @JsonldProperty("http://schema.org/areaServed")
    public List<Place> areaServedPlace;

    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @JsonldProperty("http://schema.org/isRelatedTo")
    public List<Product> isRelatedToProduct;

    /**
     * The tangible thing generated by the service, e.g. a passport, permit, etc.
     */
    @JsonldProperty("http://schema.org/serviceOutput")
    public Thing serviceOutput;

    /**
     * The geographic area where a service or offered item is provided.
     */
    @JsonldProperty("http://schema.org/areaServed")
    public List<GeoShape> areaServedGeoShape;

    /**
     * An award won by or for this item.
     */
    @JsonldProperty("http://schema.org/award")
    public String award;

    /**
     * The overall rating, based on a collection of reviews or ratings, of the item.
     */
    @JsonldProperty("http://schema.org/aggregateRating")
    public AggregateRating aggregateRating;

    /**
     * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event.
     */
    @JsonldProperty("http://schema.org/offers")
    public Offer offers;

    /**
     * The type of service being offered, e.g. veterans' benefits, emergency relief, etc.
     */
    @JsonldProperty("http://schema.org/serviceType")
    public String serviceType;

    /**
     * A means of accessing the service (e.g. a phone bank, a web site, a location, etc.).
     */
    @JsonldProperty("http://schema.org/availableChannel")
    public ServiceChannel availableChannel;

    /**
     * The hours during which this service or contact is available.
     */
    @JsonldProperty("http://schema.org/hoursAvailable")
    public OpeningHoursSpecification hoursAvailable;

    /**
     * An associated logo.
     */
    @JsonldProperty("http://schema.org/logo")
    public List<java.net.URL> logoURL;

    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @JsonldProperty("http://schema.org/category")
    public List<String> categoryText;

    /**
     * A review of the item.
     */
    @JsonldProperty("http://schema.org/review")
    public Review review;

    /**
     * The geographic area where a service or offered item is provided.
     */
    @JsonldProperty("http://schema.org/areaServed")
    public List<String> areaServedText;

    /**
     * A category for the item. Greater signs or slashes can be used to informally indicate a category hierarchy.
     */
    @JsonldProperty("http://schema.org/category")
    public List<Thing> categoryThing;

    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @JsonldProperty("http://schema.org/brand")
    public List<Organization> brandOrganization;

    /**
     * The geographic area where a service or offered item is provided.
     */
    @JsonldProperty("http://schema.org/areaServed")
    public List<AdministrativeArea> areaServedAdministrativeArea;

    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @JsonldProperty("http://schema.org/isSimilarTo")
    public List<Product> isSimilarToProduct;

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @JsonldProperty("http://schema.org/provider")
    public List<Person> providerPerson;

    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @JsonldProperty("http://schema.org/brand")
    public List<Brand> brandBrand;

    /**
     * A pointer to another, somehow related product (or multiple products).
     */
    @JsonldProperty("http://schema.org/isRelatedTo")
    public List<Service> isRelatedToService;

    /**
     * Indicates the mobility of a provided service (e.g. 'static', 'dynamic').
     */
    @JsonldProperty("http://schema.org/providerMobility")
    public String providerMobility;

    /**
     * A pointer to another, functionally similar product (or multiple products).
     */
    @JsonldProperty("http://schema.org/isSimilarTo")
    public List<Service> isSimilarToService;

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @JsonldProperty("http://schema.org/provider")
    public List<Organization> providerOrganization;

    /**
     * An intended audience, i.e. a group for whom something was created.
     */
    @JsonldProperty("http://schema.org/audience")
    public Audience audience;

    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     */
    @JsonldProperty("http://schema.org/hasOfferCatalog")
    public OfferCatalog hasOfferCatalog;

    /**
     * An associated logo.
     */
    @JsonldProperty("http://schema.org/logo")
    public List<ImageObject> logoImageObject;
}
