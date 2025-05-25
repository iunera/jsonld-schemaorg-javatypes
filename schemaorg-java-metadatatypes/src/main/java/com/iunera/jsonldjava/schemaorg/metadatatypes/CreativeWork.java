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
 * The most generic kind of creative work, including books, movies, photographs, software programs, etc.
 */
@Vertex
@JsonldType("http://schema.org/CreativeWork")
public class CreativeWork extends Thing {
    /**
     * Indicates (by URL or string) a particular version of a schema used in some CreativeWork. For example, a document could declare a schemaVersion using an URL such as http://schema.org/version/2.0/ if precise indication of schema version was required by some application.
     */
    @JsonldProperty("http://schema.org/schemaVersion")
    public List<String> schemaVersionText;

    /**
     * The number of interactions for the CreativeWork using the WebSite or SoftwareApplication. The most specific child type of InteractionCounter should be used.
     */
    @JsonldProperty("http://schema.org/interactionStatistic")
    public InteractionCounter interactionStatistic;

    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @JsonldProperty("http://schema.org/version")
    public List<String> versionText;

    /**
     * Genre of the creative work or group.
     */
    @JsonldProperty("http://schema.org/genre")
    public List<java.net.URL> genreURL;

    /**
     * Indicates that the CreativeWork contains a reference to, but is not necessarily about a concept.
     */
    @JsonldProperty("http://schema.org/mentions")
    public Thing mentions;

    /**
     * The predominant mode of learning supported by the learning resource. Acceptable values are 'active', 'expositive', or 'mixed'.
     */
    @JsonldProperty("http://schema.org/interactivityType")
    public String interactivityType;

    /**
     * The Event where the CreativeWork was recorded. The CreativeWork may capture all or part of the event.
     */
    @JsonldProperty("http://schema.org/recordedAt")
    public Event recordedAt;

    /**
     * Fictional person connected with a creative work.
     */
    @JsonldProperty("http://schema.org/character")
    public Person character;

    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @JsonldProperty("http://schema.org/funder")
    public List<Organization> funderOrganization;

    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @JsonldProperty("http://schema.org/creator")
    public List<Organization> creatorOrganization;

    /**
     * A publication event associated with the item.
     */
    @JsonldProperty("http://schema.org/publication")
    public PublicationEvent publication;

    /**
     * Keywords or tags used to describe this content. Multiple entries in a keywords list are typically delimited by commas.
     */
    @JsonldProperty("http://schema.org/keywords")
    public String keywords;

    /**
     * The subject matter of the content.
     */
    @JsonldProperty("http://schema.org/about")
    public Thing about;

    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="/availableLanguage">availableLanguage</a>.
     */
    @JsonldProperty("http://schema.org/inLanguage")
    public List<String> inLanguageText;

    /**
     * The year during which the claimed copyright for the CreativeWork was first asserted.
     */
    @JsonldProperty("http://schema.org/copyrightYear")
    public java.math.BigDecimal copyrightYear;

    /**
     * The place and time the release was issued, expressed as a PublicationEvent.
     */
    @JsonldProperty("http://schema.org/releasedEvent")
    public PublicationEvent releasedEvent;

    /**
     * The purpose of a work in the context of education; for example, 'assignment', 'group work'.
     */
    @JsonldProperty("http://schema.org/educationalUse")
    public String educationalUse;

    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    @JsonldProperty("http://schema.org/citation")
    public List<CreativeWork> citationCreativeWork;

    /**
     * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
     */
    @JsonldProperty("http://schema.org/sponsor")
    public List<Organization> sponsorOrganization;

    /**
     * The predominant type or kind characterizing the learning resource. For example, 'presentation', 'handout'.
     */
    @JsonldProperty("http://schema.org/learningResourceType")
    public String learningResourceType;

    /**
     * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
     */
    @JsonldProperty("http://schema.org/isBasedOn")
    public List<Product> isBasedOnProduct;

    /**
     * Media type, typically MIME format (see <a href="http://www.iana.org/assignments/media-types/media-types.xhtml">IANA site</a>) of the content e.g. application/zip of a SoftwareApplication binary. In cases where a CreativeWork has several media type representations, 'encoding' can be used to indicate each MediaObject alongside particular fileFormat information. Unregistered or niche file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia entry.
     */
    @JsonldProperty("http://schema.org/fileFormat")
    public List<String> fileFormatText;

    /**
     * The date on which the CreativeWork was created or the item was added to a DataFeed.
     */
    @JsonldProperty("http://schema.org/dateCreated")
    public List<java.util.Date> dateCreatedDate;

    /**
     * Headline of the article.
     */
    @JsonldProperty("http://schema.org/headline")
    public String headline;

    /**
     * The textual content of this CreativeWork.
     */
    @JsonldProperty("http://schema.org/text")
    public String text;

    /**
     * The creator/author of this CreativeWork. This is the same as the Author property for CreativeWork.
     */
    @JsonldProperty("http://schema.org/creator")
    public List<Person> creatorPerson;

    /**
     * The service provider, service operator, or service performer; the goods producer. Another party (a seller) may offer those services or goods on behalf of the provider. A provider may also serve as the seller.
     */
    @JsonldProperty("http://schema.org/provider")
    public List<Person> providerPerson;

    /**
     * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event.
     */
    @JsonldProperty("http://schema.org/sponsor")
    public List<Person> sponsorPerson;

    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @JsonldProperty("http://schema.org/producer")
    public List<Organization> producerOrganization;

    /**
     * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
     */
    @JsonldProperty("http://schema.org/dateModified")
    public List<java.util.Date> dateModifiedDate;

    /**
     * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in <a href="https://en.wikipedia.org/wiki/ISO_8601#Time_intervals">ISO 8601 time interval format</a>. In
     * the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written "2011/2012"). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
     * Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via "1939/1945".
     */
    @JsonldProperty("http://schema.org/temporalCoverage")
    public List<java.util.Date> temporalCoverageDateTime;

    /**
     * The publisher of the creative work.
     */
    @JsonldProperty("http://schema.org/publisher")
    public List<Organization> publisherOrganization;

    /**
     * The position of an item in a series or sequence of items.
     */
    @JsonldProperty("http://schema.org/position")
    public List<Integer> positionInteger;

    /**
     * Content features of the resource, such as accessible media, alternatives and supported enhancements for accessibility (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    @JsonldProperty("http://schema.org/accessibilityFeature")
    public String accessibilityFeature;

    /**
     * A link to the page containing the comments of the CreativeWork.
     */
    @JsonldProperty("http://schema.org/discussionUrl")
    public java.net.URL discussionUrl;

    /**
     * The number of comments this CreativeWork (e.g. Article, Question or Answer) has received. This is most applicable to works published in Web sites with commenting system; additional comments may exist elsewhere.
     */
    @JsonldProperty("http://schema.org/commentCount")
    public Integer commentCount;

    /**
     * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed.
     */
    @JsonldProperty("http://schema.org/dateModified")
    public List<java.util.Date> dateModifiedDateTime;

    /**
     * The typical expected age range, e.g. '7-9', '11-'.
     */
    @JsonldProperty("http://schema.org/typicalAgeRange")
    public String typicalAgeRange;

    /**
     * A thumbnail image relevant to the Thing.
     */
    @JsonldProperty("http://schema.org/thumbnailUrl")
    public java.net.URL thumbnailUrl;

    /**
     * Date of first broadcast/publication.
     */
    @JsonldProperty("http://schema.org/datePublished")
    public java.util.Date datePublished;

    /**
     * An embedded audio object.
     */
    @JsonldProperty("http://schema.org/audio")
    public AudioObject audio;

    /**
     * Specifies the Person who edited the CreativeWork.
     */
    @JsonldProperty("http://schema.org/editor")
    public Person editor;

    /**
     * The person or organization who produced the work (e.g. music album, movie, tv/radio series etc.).
     */
    @JsonldProperty("http://schema.org/producer")
    public List<Person> producerPerson;

    /**
     * A flag to signal that the publication is accessible for free.
     */
    @JsonldProperty("http://schema.org/isAccessibleForFree")
    public Boolean isAccessibleForFree;

    /**
     * The position of an item in a series or sequence of items.
     */
    @JsonldProperty("http://schema.org/position")
    public List<String> positionText;

    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @JsonldProperty("http://schema.org/copyrightHolder")
    public List<Person> copyrightHolderPerson;

    /**
     * A media object that encodes this CreativeWork. This property is a synonym for associatedMedia.
     */
    @JsonldProperty("http://schema.org/encoding")
    public MediaObject encoding;

    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @JsonldProperty("http://schema.org/author")
    public List<Person> authorPerson;

    /**
     * Indicates a CreativeWork that this CreativeWork is (in some sense) part of.
     */
    @JsonldProperty("http://schema.org/isPartOf")
    public CreativeWork isPartOf;

    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @JsonldProperty("http://schema.org/contributor")
    public List<Organization> contributorOrganization;

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
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @JsonldProperty("http://schema.org/translator")
    public List<Person> translatorPerson;

    /**
     * A secondary contributor to the CreativeWork or Event.
     */
    @JsonldProperty("http://schema.org/contributor")
    public List<Person> contributorPerson;

    /**
     * Specifies the Person that is legally accountable for the CreativeWork.
     */
    @JsonldProperty("http://schema.org/accountablePerson")
    public Person accountablePerson;

    /**
     * A characteristic of the described resource that is physiologically dangerous to some users. Related to WCAG 2.0 guideline 2.3 (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    @JsonldProperty("http://schema.org/accessibilityHazard")
    public String accessibilityHazard;

    /**
     * Media type, typically MIME format (see <a href="http://www.iana.org/assignments/media-types/media-types.xhtml">IANA site</a>) of the content e.g. application/zip of a SoftwareApplication binary. In cases where a CreativeWork has several media type representations, 'encoding' can be used to indicate each MediaObject alongside particular fileFormat information. Unregistered or niche file formats can be indicated instead via the most appropriate URL, e.g. defining Web page or a Wikipedia entry.
     */
    @JsonldProperty("http://schema.org/fileFormat")
    public List<java.net.URL> fileFormatURL;

    /**
     * Indicates that the resource is compatible with the referenced accessibility API (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    @JsonldProperty("http://schema.org/accessibilityAPI")
    public String accessibilityAPI;

    /**
     * The version of the CreativeWork embodied by a specified resource.
     */
    @JsonldProperty("http://schema.org/version")
    public List<java.math.BigDecimal> versionNumber;

    /**
     * A review of the item.
     */
    @JsonldProperty("http://schema.org/review")
    public Review review;

    /**
     * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
     */
    @JsonldProperty("http://schema.org/isBasedOn")
    public List<CreativeWork> isBasedOnCreativeWork;

    /**
     * Official rating of a piece of content&#x2014;for example,'MPAA PG-13'.
     */
    @JsonldProperty("http://schema.org/contentRating")
    public String contentRating;

    /**
     * The Organization on whose behalf the creator was working.
     */
    @JsonldProperty("http://schema.org/sourceOrganization")
    public Organization sourceOrganization;

    /**
     * Indicates (by URL or string) a particular version of a schema used in some CreativeWork. For example, a document could declare a schemaVersion using an URL such as http://schema.org/version/2.0/ if precise indication of schema version was required by some application.
     */
    @JsonldProperty("http://schema.org/schemaVersion")
    public List<java.net.URL> schemaVersionURL;

    /**
     * Identifies input methods that are sufficient to fully control the described resource (<a href="http://www.w3.org/wiki/WebSchemas/Accessibility">WebSchemas wiki lists possible values</a>).
     */
    @JsonldProperty("http://schema.org/accessibilityControl")
    public String accessibilityControl;

    /**
     * A person or organization that supports (sponsors) something through some kind of financial contribution.
     */
    @JsonldProperty("http://schema.org/funder")
    public List<Person> funderPerson;

    /**
     * The location where the CreativeWork was created, which may not be the same as the location depicted in the CreativeWork.
     */
    @JsonldProperty("http://schema.org/locationCreated")
    public Place locationCreated;

    /**
     * A secondary title of the CreativeWork.
     */
    @JsonldProperty("http://schema.org/alternativeHeadline")
    public String alternativeHeadline;

    /**
     * The publisher of the creative work.
     */
    @JsonldProperty("http://schema.org/publisher")
    public List<Person> publisherPerson;

    /**
     * The party holding the legal copyright to the CreativeWork.
     */
    @JsonldProperty("http://schema.org/copyrightHolder")
    public List<Organization> copyrightHolderOrganization;

    /**
     * Indicates whether this content is family friendly.
     */
    @JsonldProperty("http://schema.org/isFamilyFriendly")
    public Boolean isFamilyFriendly;

    /**
     * Approximate or typical time it takes to work with or through this learning resource for the typical intended target audience, e.g. 'P30M', 'P1H25M'.
     */
    @JsonldProperty("http://schema.org/timeRequired")
    public Duration timeRequired;

    /**
     * A resource that was used in the creation of this resource. This term can be repeated for multiple sources. For example, http://example.com/great-multiplication-intro.html.
     */
    @JsonldProperty("http://schema.org/isBasedOn")
    public List<java.net.URL> isBasedOnURL;

    /**
     * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in <a href="https://en.wikipedia.org/wiki/ISO_8601#Time_intervals">ISO 8601 time interval format</a>. In
     * the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written "2011/2012"). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
     * Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via "1939/1945".
     */
    @JsonldProperty("http://schema.org/temporalCoverage")
    public List<String> temporalCoverageText;

    /**
     * A citation or reference to another creative work, such as another publication, web page, scholarly article, etc.
     */
    @JsonldProperty("http://schema.org/citation")
    public List<String> citationText;

    /**
     * The language of the content or performance or used in an action. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="/availableLanguage">availableLanguage</a>.
     */
    @JsonldProperty("http://schema.org/inLanguage")
    public List<Language> inLanguageLanguage;

    /**
     * The temporalCoverage of a CreativeWork indicates the period that the content applies to, i.e. that it describes, either as a DateTime or as a textual string indicating a time period in <a href="https://en.wikipedia.org/wiki/ISO_8601#Time_intervals">ISO 8601 time interval format</a>. In
     * the case of a Dataset it will typically indicate the relevant time period in a precise notation (e.g. for a 2011 census dataset, the year 2011 would be written "2011/2012"). Other forms of content e.g. ScholarlyArticle, Book, TVSeries or TVEpisode may indicate their temporalCoverage in broader terms - textually or via well-known URL.
     * Written works such as books may sometimes have precise temporal coverage too, e.g. a work set in 1939 - 1945 can be indicated in ISO 8601 interval format format via "1939/1945".
     */
    @JsonldProperty("http://schema.org/temporalCoverage")
    public List<java.net.URL> temporalCoverageURL;

    /**
     * The spatialCoverage of a CreativeWork indicates the place(s) which are the focus of the content. It is a subproperty of
     * contentLocation intended primarily for more technical and detailed materials. For example with a Dataset, it indicates
     * areas that the dataset describes: a dataset of New York weather would have spatialCoverage which was the place: the state of New York.
     */
    @JsonldProperty("http://schema.org/spatialCoverage")
    public Place spatialCoverage;

    /**
     * Link to page describing the editorial principles of the organization primarily responsible for the creation of the CreativeWork.
     */
    @JsonldProperty("http://schema.org/publishingPrinciples")
    public java.net.URL publishingPrinciples;

    /**
     * The author of this content or rating. Please note that author is special in that HTML 5 provides a special mechanism for indicating authorship via the rel tag. That is equivalent to this and may be used interchangeably.
     */
    @JsonldProperty("http://schema.org/author")
    public List<Organization> authorOrganization;

    /**
     * An embedded video object.
     */
    @JsonldProperty("http://schema.org/video")
    public VideoObject video;

    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    @JsonldProperty("http://schema.org/license")
    public List<CreativeWork> licenseCreativeWork;

    /**
     * The location depicted or described in the content. For example, the location in a photograph or painting.
     */
    @JsonldProperty("http://schema.org/contentLocation")
    public Place contentLocation;

    /**
     * Genre of the creative work or group.
     */
    @JsonldProperty("http://schema.org/genre")
    public List<String> genreText;

    /**
     * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event.
     */
    @JsonldProperty("http://schema.org/translator")
    public List<Organization> translatorOrganization;

    /**
     * A creative work that this work is an example/instance/realization/derivation of.
     */
    @JsonldProperty("http://schema.org/exampleOfWork")
    public CreativeWork exampleOfWork;

    /**
     * Indicates the primary entity described in some page or other CreativeWork.
     */
    @JsonldProperty("http://schema.org/mainEntity")
    public Thing mainEntity;

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
     * The date on which the CreativeWork was created or the item was added to a DataFeed.
     */
    @JsonldProperty("http://schema.org/dateCreated")
    public List<java.util.Date> dateCreatedDateTime;

    /**
     * Comments, typically from users.
     */
    @JsonldProperty("http://schema.org/comment")
    public Comment comment;

    /**
     * A license document that applies to this content, typically indicated by URL.
     */
    @JsonldProperty("http://schema.org/license")
    public List<java.net.URL> licenseURL;

    /**
     * A media object that encodes this CreativeWork. This property is a synonym for encoding.
     */
    @JsonldProperty("http://schema.org/associatedMedia")
    public MediaObject associatedMedia;

    /**
     * An alignment to an established educational framework.
     */
    @JsonldProperty("http://schema.org/educationalAlignment")
    public AlignmentObject educationalAlignment;
}
