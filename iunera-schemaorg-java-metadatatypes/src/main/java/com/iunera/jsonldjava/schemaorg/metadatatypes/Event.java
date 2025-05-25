package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * An event happening at a certain time and location, such as a concert, lecture, or festival. Ticketing information may be added via the <a class="localLink" href="/offers">offers</a> property. Repeated events may be structured as separate Event objects. */
@Vertex
@JsonldType("http://schema.org/Event")
public class Event extends Thing {
  /**
   * A work performed in some event, for example a play performed in a TheaterEvent. */
  @JsonldProperty("http://schema.org/workPerformed")
  public CreativeWork workPerformed;

  /**
   * A flag to signal that the publication is accessible for free. */
  @JsonldProperty("http://schema.org/isAccessibleForFree")
  public Boolean isAccessibleForFree;

  /**
   * A work featured in some event, e.g. exhibited in an ExhibitionEvent.
   *        Specific subproperties are available for workPerformed (e.g. a play), or a workPresented (a Movie at a ScreeningEvent). */
  @JsonldProperty("http://schema.org/workFeatured")
  public CreativeWork workFeatured;

  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution. */
  @JsonldProperty("http://schema.org/funder")
  public List<Organization> funderOrganization;

  /**
   * A secondary contributor to the CreativeWork or Event. */
  @JsonldProperty("http://schema.org/contributor")
  public List<Organization> contributorOrganization;

  /**
   * The person or organization who wrote a composition, or who is the composer of a work performed at some event. */
  @JsonldProperty("http://schema.org/composer")
  public List<Organization> composerOrganization;

  /**
   * A person or organization attending the event. */
  @JsonldProperty("http://schema.org/attendee")
  public List<Organization> attendeeOrganization;

  /**
   * The start date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>). */
  @JsonldProperty("http://schema.org/startDate")
  public List<java.util.Date> startDateDate;

  /**
   * The end date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>). */
  @JsonldProperty("http://schema.org/endDate")
  public List<java.util.Date> endDateDate;

  /**
   * The start date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>). */
  @JsonldProperty("http://schema.org/startDate")
  public List<java.util.Date> startDateDateTime;

  /**
   * The end date and time of the item (in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>). */
  @JsonldProperty("http://schema.org/endDate")
  public List<java.util.Date> endDateDateTime;

  /**
   * The overall rating, based on a collection of reviews or ratings, of the item. */
  @JsonldProperty("http://schema.org/aggregateRating")
  public AggregateRating aggregateRating;

  /**
   * An offer to provide this item&#x2014;for example, an offer to sell a product, rent the DVD of a movie, perform a service, or give away tickets to an event. */
  @JsonldProperty("http://schema.org/offers")
  public Offer offers;

  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="/availableLanguage">availableLanguage</a>. */
  @JsonldProperty("http://schema.org/inLanguage")
  public List<String> inLanguageText;

  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event. */
  @JsonldProperty("http://schema.org/translator")
  public List<Person> translatorPerson;

  /**
   * An Event that is part of this event. For example, a conference event includes many presentations, each of which is a subEvent of the conference. */
  @JsonldProperty("http://schema.org/subEvent")
  public Event subEvent;

  /**
   * The duration of the item (movie, audio recording, event, etc.) in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 date format</a>. */
  @JsonldProperty("http://schema.org/duration")
  public Duration duration;

  /**
   * The location of for example where the event is happening, an organization is located, or where an action takes place. */
  @JsonldProperty("http://schema.org/location")
  public List<Place> locationPlace;

  /**
   * A secondary contributor to the CreativeWork or Event. */
  @JsonldProperty("http://schema.org/contributor")
  public List<Person> contributorPerson;

  /**
   * The location of for example where the event is happening, an organization is located, or where an action takes place. */
  @JsonldProperty("http://schema.org/location")
  public List<String> locationText;

  /**
   * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor. */
  @JsonldProperty("http://schema.org/performer")
  public List<Organization> performerOrganization;

  /**
   * An organizer of an Event. */
  @JsonldProperty("http://schema.org/organizer")
  public List<Organization> organizerOrganization;

  /**
   * The location of for example where the event is happening, an organization is located, or where an action takes place. */
  @JsonldProperty("http://schema.org/location")
  public List<PostalAddress> locationPostalAddress;

  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event. */
  @JsonldProperty("http://schema.org/sponsor")
  public List<Organization> sponsorOrganization;

  /**
   * A review of the item. */
  @JsonldProperty("http://schema.org/review")
  public Review review;

  /**
   * An eventStatus of an event represents its status; particularly useful when an event is cancelled or rescheduled. */
  @JsonldProperty("http://schema.org/eventStatus")
  public EventStatusType eventStatus;

  /**
   * A person or organization that supports (sponsors) something through some kind of financial contribution. */
  @JsonldProperty("http://schema.org/funder")
  public List<Person> funderPerson;

  /**
   * A director of e.g. tv, radio, movie, video gaming etc. content, or of an event. Directors can be associated with individual items or with a series, episode, clip. */
  @JsonldProperty("http://schema.org/director")
  public Person director;

  /**
   * An organizer of an Event. */
  @JsonldProperty("http://schema.org/organizer")
  public List<Person> organizerPerson;

  /**
   * A performer at the event&#x2014;for example, a presenter, musician, musical group or actor. */
  @JsonldProperty("http://schema.org/performer")
  public List<Person> performerPerson;

  /**
   * The time admission will commence. */
  @JsonldProperty("http://schema.org/doorTime")
  public java.util.Date doorTime;

  /**
   * The language of the content or performance or used in an action. Please use one of the language codes from the <a href="http://tools.ietf.org/html/bcp47">IETF BCP 47 standard</a>. See also <a class="localLink" href="/availableLanguage">availableLanguage</a>. */
  @JsonldProperty("http://schema.org/inLanguage")
  public List<Language> inLanguageLanguage;

  /**
   * A person or organization attending the event. */
  @JsonldProperty("http://schema.org/attendee")
  public List<Person> attendeePerson;

  /**
   * Used in conjunction with eventStatus for rescheduled or cancelled events. This property contains the previously scheduled start date. For rescheduled events, the startDate property should be used for the newly scheduled start date. In the (rare) case of an event that has been postponed and rescheduled multiple times, this field may be repeated. */
  @JsonldProperty("http://schema.org/previousStartDate")
  public java.util.Date previousStartDate;

  /**
   * A person or organization that supports a thing through a pledge, promise, or financial contribution. e.g. a sponsor of a Medical Study or a corporate sponsor of an event. */
  @JsonldProperty("http://schema.org/sponsor")
  public List<Person> sponsorPerson;

  /**
   * Organization or person who adapts a creative work to different languages, regional differences and technical requirements of a target market, or that translates during some event. */
  @JsonldProperty("http://schema.org/translator")
  public List<Organization> translatorOrganization;

  /**
   * The typical expected age range, e.g. '7-9', '11-'. */
  @JsonldProperty("http://schema.org/typicalAgeRange")
  public String typicalAgeRange;

  /**
   * An actor, e.g. in tv, radio, movie, video games etc., or in an event. Actors can be associated with individual items or with a series, episode, clip. */
  @JsonldProperty("http://schema.org/actor")
  public Person actor;

  /**
   * The person or organization who wrote a composition, or who is the composer of a work performed at some event. */
  @JsonldProperty("http://schema.org/composer")
  public List<Person> composerPerson;
}
