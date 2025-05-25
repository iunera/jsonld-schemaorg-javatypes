package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A structured value providing information about the opening hours of a place or a certain service inside a place.
 * The place is <strong>open</strong> if the <a class="localLink" href="/opens">opens</a> property is specified, and <strong>closed</strong> otherwise.
 * If the value for the <a class="localLink" href="/closes">closes</a> property is less than the value for the <a class="localLink" href="/opens">opens</a> property then the hour range is assumed to span over the next day. */
@Vertex
@JsonldType("http://schema.org/OpeningHoursSpecification")
public class OpeningHoursSpecification extends StructuredValue {
  /**
   * The date when the item becomes valid. */
  @JsonldProperty("http://schema.org/validFrom")
  public java.util.Date validFrom;

  /**
   * The closing hour of the place or service on the given day(s) of the week. */
  @JsonldProperty("http://schema.org/closes")
  public String closes;

  /**
   * The opening hour of the place or service on the given day(s) of the week. */
  @JsonldProperty("http://schema.org/opens")
  public String opens;

  /**
   * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours. */
  @JsonldProperty("http://schema.org/validThrough")
  public java.util.Date validThrough;

  /**
   * The day of the week for which these opening hours are valid. */
  @JsonldProperty("http://schema.org/dayOfWeek")
  public DayOfWeek dayOfWeek;
}
