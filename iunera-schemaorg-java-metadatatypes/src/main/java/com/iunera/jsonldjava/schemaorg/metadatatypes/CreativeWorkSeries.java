package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A CreativeWorkSeries in schema.org is a group of related items, typically but not necessarily of the same kind. CreativeWorkSeries are usually organized into some order, often chronological. Unlike <a class="localLink" href="/ItemList">ItemList</a> which is a general purpose data structure for lists of things, the emphasis with CreativeWorkSeries is on published materials (written e.g. books and periodicals, or media such as tv, radio and games).
 * Specific subtypes are available for describing <a class="localLink" href="/TVSeries">TVSeries</a>, <a class="localLink" href="/RadioSeries">RadioSeries</a>, <a class="localLink" href="/MovieSeries">MovieSeries</a>, <a class="localLink" href="/BookSeries">BookSeries</a>, <a class="localLink" href="/Periodical">Periodical</a> and <a class="localLink" href="/VideoGameSeries">VideoGameSeries</a>. In each case, the <a class="localLink" href="/hasPart">hasPart</a> / <a class="localLink" href="/isPartOf">isPartOf</a> properties can be used to relate the CreativeWorkSeries to its parts. The general CreativeWorkSeries type serves largely just to organize these more specific and practical subtypes.
 * It is common for properties applicable to an item from the series to be usefully applied to the containing group. Schema.org attempts to anticipate some of these cases, but publishers should be free to apply properties of the series parts to the series as a whole wherever they seem appropriate. */
@Vertex
@JsonldType("http://schema.org/CreativeWorkSeries")
public class CreativeWorkSeries extends CreativeWork {
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
}
