package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A single item within a larger data feed. */
@Vertex
@JsonldType("http://schema.org/DataFeedItem")
public class DataFeedItem extends Intangible {
  /**
   * The datetime the item was removed from the DataFeed. */
  @JsonldProperty("http://schema.org/dateDeleted")
  public java.util.Date dateDeleted;

  /**
   * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed. */
  @JsonldProperty("http://schema.org/dateModified")
  public List<java.util.Date> dateModifiedDateTime;

  /**
   * The date on which the CreativeWork was created or the item was added to a DataFeed. */
  @JsonldProperty("http://schema.org/dateCreated")
  public List<java.util.Date> dateCreatedDate;

  /**
   * The date on which the CreativeWork was most recently modified or when the item's entry was modified within a DataFeed. */
  @JsonldProperty("http://schema.org/dateModified")
  public List<java.util.Date> dateModifiedDate;

  /**
   * The date on which the CreativeWork was created or the item was added to a DataFeed. */
  @JsonldProperty("http://schema.org/dateCreated")
  public List<java.util.Date> dateCreatedDateTime;

  /**
   * An entity represented by an entry in a list or data feed (e.g. an 'artist' in a list of 'artists')’. */
  @JsonldProperty("http://schema.org/item")
  public Thing item;
}
