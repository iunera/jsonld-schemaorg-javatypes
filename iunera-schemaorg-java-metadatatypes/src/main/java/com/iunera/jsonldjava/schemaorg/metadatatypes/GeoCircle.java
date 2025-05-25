package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A GeoCircle is a GeoShape representing a circular geographic area. As it is a GeoShape
 *           it provides the simple textual property 'circle', but also allows the combination of postalCode alongside geoRadius.
 *           The center of the circle can be indicated via the 'geoMidpoint' property, or more approximately using 'address', 'postalCode'. */
@Vertex
@JsonldType("http://schema.org/GeoCircle")
public class GeoCircle extends GeoShape {
  /**
   * Indicates the GeoCoordinates at the centre of a GeoShape e.g. GeoCircle. */
  @JsonldProperty("http://schema.org/geoMidpoint")
  public GeoCoordinates geoMidpoint;

  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation). */
  @JsonldProperty("http://schema.org/geoRadius")
  public List<String> geoRadiusText;

  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation). */
  @JsonldProperty("http://schema.org/geoRadius")
  public List<Distance> geoRadiusDistance;

  /**
   * Indicates the approximate radius of a GeoCircle (metres unless indicated otherwise via Distance notation). */
  @JsonldProperty("http://schema.org/geoRadius")
  public List<java.math.BigDecimal> geoRadiusNumber;
}
