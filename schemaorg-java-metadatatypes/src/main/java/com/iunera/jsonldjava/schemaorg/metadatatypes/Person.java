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
 * A person (alive, dead, undead, or fictional).
 */
@Vertex
@JsonldType("http://schema.org/Person")
public class Person extends Thing {


    /**
     * Gender of the person. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender.
     */
    @JsonldProperty("http://schema.org/gender")
    public List<GenderType> genderGenderType;

    /**
     * An organization that the person is an alumni of.
     */
    @JsonldProperty("http://schema.org/alumniOf")
    public List<EducationalOrganization> alumniOfEducationalOrganization;

    /**
     * Nationality of the person.
     */
    @JsonldProperty("http://schema.org/nationality")
    public Country nationality;

    /**
     * Date of birth.
     */
    @JsonldProperty("http://schema.org/birthDate")
    public java.util.Date birthDate;

    /**
     * An organization that the person is an alumni of.
     */
    @JsonldProperty("http://schema.org/alumniOf")
    public List<Organization> alumniOfOrganization;

    /**
     * Points-of-Sales operated by the organization or person.
     */
    @JsonldProperty("http://schema.org/hasPOS")
    public Place hasPOS;

    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @JsonldProperty("http://schema.org/funder")
    public List<Organization> funderOrganization;

    /**
     * A child of the person.
     */
    @JsonldProperty("http://schema.org/children")
    public Person children;

    /**
     * The International Standard of Industrial Classification of All Economic Activities (ISIC), Revision 4 code for a particular organization, business person, or place.
     */
    @JsonldProperty("http://schema.org/isicV4")
    public String isicV4;

    /**
     * A contact location for a person's residence.
     */
    @JsonldProperty("http://schema.org/homeLocation")
    public List<Place> homeLocationPlace;

    /**
     * A sibling of the person.
     */
    @JsonldProperty("http://schema.org/sibling")
    public Person sibling;

    /**
     * A contact location for a person's place of work.
     */
    @JsonldProperty("http://schema.org/workLocation")
    public List<ContactPoint> workLocationContactPoint;

    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @JsonldProperty("http://schema.org/memberOf")
    public List<ProgramMembership> memberOfProgramMembership;

    /**
     * The total financial value of the person as calculated by subtracting assets from liabilities.
     */
    @JsonldProperty("http://schema.org/netWorth")
    public List<MonetaryAmount> netWorthMonetaryAmount;

    /**
     * Given name. In the U.S., the first name of a Person. This can be used along with familyName instead of the name property.
     */
    @JsonldProperty("http://schema.org/givenName")
    public String givenName;

    /**
     * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
     */
    @JsonldProperty("http://schema.org/sponsor")
    public List<Organization> sponsorOrganization;

    /**
     * The most generic familial relation.
     */
    @JsonldProperty("http://schema.org/relatedTo")
    public Person relatedTo;

    /**
     * The North American Industry Classification System (NAICS) code for a particular organization or business person.
     */
    @JsonldProperty("http://schema.org/naics")
    public String naics;

    /**
     * The <a href="http://www.gs1.org/gln">Global Location Number</a> (GLN, sometimes also referred to as International Location Number or ILN) of the respective organization, person, or place. The GLN is a 13-digit number used to identify parties and physical locations.
     */
    @JsonldProperty("http://schema.org/globalLocationNumber")
    public String globalLocationNumber;

    /**
     * The height of the item.
     */
    @JsonldProperty("http://schema.org/height")
    public List<Distance> heightDistance;

    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @JsonldProperty("http://schema.org/brand")
    public List<Organization> brandOrganization;

    /**
     * A pointer to products or services sought by the organization or person (demand).
     */
    @JsonldProperty("http://schema.org/seeks")
    public Demand seeks;

    /**
     * An additional name for a Person, can be used for a middle name.
     */
    @JsonldProperty("http://schema.org/additionalName")
    public String additionalName;

    /**
     * Organizations that the person works for.
     */
    @JsonldProperty("http://schema.org/worksFor")
    public Organization worksFor;

    /**
     * The Dun &amp; Bradstreet DUNS number for identifying an organization or business person.
     */
    @JsonldProperty("http://schema.org/duns")
    public String duns;

    /**
     * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
     */
    @JsonldProperty("http://schema.org/sponsor")
    public List<Person> sponsorPerson;

    /**
     * Physical address of the item.
     */
    @JsonldProperty("http://schema.org/address")
    public List<PostalAddress> addressPostalAddress;

    /**
     * The place where the person was born.
     */
    @JsonldProperty("http://schema.org/birthPlace")
    public Place birthPlace;

    /**
     * Products owned by the organization or person.
     */
    @JsonldProperty("http://schema.org/owns")
    public List<OwnershipInfo> ownsOwnershipInfo;

    /**
     * The brand(s) associated with a product or service, or the brand(s) maintained by an organization or business person.
     */
    @JsonldProperty("http://schema.org/brand")
    public List<Brand> brandBrand;

    /**
     * The most generic uni-directional social relation.
     */
    @JsonldProperty("http://schema.org/follows")
    public Person follows;

    /**
     * An Organization (or ProgramMembership) to which this Person or Organization belongs.
     */
    @JsonldProperty("http://schema.org/memberOf")
    public List<Organization> memberOfOrganization;

    /**
     * The Value-added Tax ID of the organization or person.
     */
    @JsonldProperty("http://schema.org/vatID")
    public String vatID;

    /**
     * An organization that this person is affiliated with. For example, a school/university, a club, or a team.
     */
    @JsonldProperty("http://schema.org/affiliation")
    public Organization affiliation;

    /**
     * A contact location for a person's residence.
     */
    @JsonldProperty("http://schema.org/homeLocation")
    public List<ContactPoint> homeLocationContactPoint;

    /**
     * The Tax / Fiscal ID of the organization or person, e.g. the TIN in the US or the CIF/NIF in Spain.
     */
    @JsonldProperty("http://schema.org/taxID")
    public String taxID;

    /**
     * The job title of the person (for example, Financial Manager).
     */
    @JsonldProperty("http://schema.org/jobTitle")
    public String jobTitle;

    /**
     * A colleague of the person.
     */
    @JsonldProperty("http://schema.org/colleague")
    public List<Person> colleaguePerson;

    /**
     * The total financial value of the person as calculated by subtracting assets from liabilities.
     */
    @JsonldProperty("http://schema.org/netWorth")
    public List<PriceSpecification> netWorthPriceSpecification;

    /**
     * An award won by or for this item.
     */
    @JsonldProperty("http://schema.org/award")
    public String award;

    /**
     * An honorific suffix preceding a Person's name such as M.D. /PhD/MSCSW.
     */
    @JsonldProperty("http://schema.org/honorificSuffix")
    public String honorificSuffix;

    /**
     * The height of the item.
     */
    @JsonldProperty("http://schema.org/height")
    public List<QuantitativeValue> heightQuantitativeValue;

    /**
     * A contact location for a person's place of work.
     */
    @JsonldProperty("http://schema.org/workLocation")
    public List<Place> workLocationPlace;

    /**
     * Email address.
     */
    @JsonldProperty("http://schema.org/email")
    public String email;

    /**
     * A parent of this person.
     */
    @JsonldProperty("http://schema.org/parent")
    public Person parent;

    /**
     * Products owned by the organization or person.
     */
    @JsonldProperty("http://schema.org/owns")
    public List<Product> ownsProduct;

    /**
     * The telephone number.
     */
    @JsonldProperty("http://schema.org/telephone")
    public String telephone;

    /**
     * A contact point for a person or organization.
     */
    @JsonldProperty("http://schema.org/contactPoint")
    public ContactPoint contactPoint;

    /**
     * Gender of the person. While http://schema.org/Male and http://schema.org/Female may be used, text strings are also acceptable for people who do not identify as a binary gender.
     */
    @JsonldProperty("http://schema.org/gender")
    public List<String> genderText;

    /**
     * Physical address of the item.
     */
    @JsonldProperty("http://schema.org/address")
    public List<String> addressText;

    /**
     * A colleague of the person.
     */
    @JsonldProperty("http://schema.org/colleague")
    public List<java.net.URL> colleagueURL;

    /**
     * The most generic bi-directional social/work relation.
     */
    @JsonldProperty("http://schema.org/knows")
    public Person knows;

    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @JsonldProperty("http://schema.org/funder")
    public List<Person> funderPerson;

    /**
     * The fax number.
     */
    @JsonldProperty("http://schema.org/faxNumber")
    public String faxNumber;

    /**
     * The place where the person died.
     */
    @JsonldProperty("http://schema.org/deathPlace")
    public Place deathPlace;

    /**
     * Date of death.
     */
    @JsonldProperty("http://schema.org/deathDate")
    public java.util.Date deathDate;

    /**
     * The weight of the product or person.
     */
    @JsonldProperty("http://schema.org/weight")
    public QuantitativeValue weight;

    /**
     * Event that this person is a performer or participant in.
     */
    @JsonldProperty("http://schema.org/performerIn")
    public Event performerIn;

    /**
     * The person's spouse.
     */
    @JsonldProperty("http://schema.org/spouse")
    public Person spouse;

    /**
     * An honorific prefix preceding a Person's name such as Dr/Mrs/Mr.
     */
    @JsonldProperty("http://schema.org/honorificPrefix")
    public String honorificPrefix;

    /**
     * Family name. In the U.S., the last name of an Person. This can be used along with givenName instead of the name property.
     */
    @JsonldProperty("http://schema.org/familyName")
    public String familyName;

    /**
     * A pointer to products or services offered by the organization or person.
     */
    @JsonldProperty("http://schema.org/makesOffer")
    public Offer makesOffer;

    /**
     * Indicates an OfferCatalog listing for this Organization, Person, or Service.
     */
    @JsonldProperty("http://schema.org/hasOfferCatalog")
    public OfferCatalog hasOfferCatalog;


}
