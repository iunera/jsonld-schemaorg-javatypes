package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A single feed providing structured information about one or more entities or topics. */
@Vertex
@JsonldType("http://schema.org/DataFeed")
public class DataFeed extends Dataset {
  /**
   * An item within in a data feed. Data feeds may have many elements. */
  @JsonldProperty("http://schema.org/dataFeedElement")
  public List<DataFeedItem> dataFeedElementDataFeedItem;

  /**
   * An item within in a data feed. Data feeds may have many elements. */
  @JsonldProperty("http://schema.org/dataFeedElement")
  public List<String> dataFeedElementText;

  /**
   * An item within in a data feed. Data feeds may have many elements. */
  @JsonldProperty("http://schema.org/dataFeedElement")
  public List<Thing> dataFeedElementThing;
}
