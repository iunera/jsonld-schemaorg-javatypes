package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A map. */
@Vertex
@JsonldType("http://schema.org/Map")
public class Map extends CreativeWork {
  /**
   * Indicates the kind of Map, from the MapCategoryType Enumeration. */
  @JsonldProperty("http://schema.org/mapType")
  public MapCategoryType mapType;
}
