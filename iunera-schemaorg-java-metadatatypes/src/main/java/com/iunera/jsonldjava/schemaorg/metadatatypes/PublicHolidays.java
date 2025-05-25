package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * This stands for any day that is a public holiday; it is a placeholder for all official public holidays in some particular location. While not technically a "day of the week", it can be used with <a class="localLink" href="/OpeningHoursSpecification">OpeningHoursSpecification</a>. In the context of an opening hours specification it can be used to indicate opening hours on public holidays, overriding general opening hours for the day of the week on which a public holiday occurs. */
@Vertex
@JsonldType("http://schema.org/PublicHolidays")
public class PublicHolidays extends DayOfWeek {
}
