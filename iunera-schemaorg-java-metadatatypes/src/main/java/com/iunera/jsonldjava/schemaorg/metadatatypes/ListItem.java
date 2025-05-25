package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * An list item, e.g. a step in a checklist or how-to description. */
@Vertex
@JsonldType("http://schema.org/ListItem")
public class ListItem extends Intangible {
  /**
   * The position of an item in a series or sequence of items. */
  @JsonldProperty("http://schema.org/position")
  public List<Integer> positionInteger;

  /**
   * A link to the ListItem that follows the current one. */
  @JsonldProperty("http://schema.org/nextItem")
  public ListItem nextItem;

  /**
   * A link to the ListItem that preceeds the current one. */
  @JsonldProperty("http://schema.org/previousItem")
  public ListItem previousItem;

  /**
   * The position of an item in a series or sequence of items. */
  @JsonldProperty("http://schema.org/position")
  public List<String> positionText;

  /**
   * An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists')’. */
  @JsonldProperty("http://schema.org/item")
  public Thing item;
}
