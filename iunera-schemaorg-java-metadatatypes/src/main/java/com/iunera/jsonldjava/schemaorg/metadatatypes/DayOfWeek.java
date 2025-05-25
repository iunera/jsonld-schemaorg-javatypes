package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * The day of the week, e.g. used to specify to which day the opening hours of an OpeningHoursSpecification refer.
 * Originally, URLs from <a href="http://purl.org/goodrelations/v1">GoodRelations</a> were used (for <a class="localLink" href="/Monday">Monday</a>, <a class="localLink" href="/Tuesday">Tuesday</a>, <a class="localLink" href="/Wednesday">Wednesday</a>, <a class="localLink" href="/Thursday">Thursday</a>, <a class="localLink" href="/Friday">Friday</a>, <a class="localLink" href="/Saturday">Saturday</a>, <a class="localLink" href="/Sunday">Sunday</a> plus a special entry for <a class="localLink" href="/PublicHolidays">PublicHolidays</a>); these have now been integrated directly into schema.org. */
@Vertex
@JsonldType("http://schema.org/DayOfWeek")
public class DayOfWeek extends Enumeration {
}
