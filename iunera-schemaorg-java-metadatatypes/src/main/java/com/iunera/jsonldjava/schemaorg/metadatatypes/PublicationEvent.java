package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A PublicationEvent corresponds indifferently to the event of publication for a CreativeWork of any type e.g. a broadcast event, an on-demand event, a book/journal publication via a variety of delivery media. */
@Vertex
@JsonldType("http://schema.org/PublicationEvent")
public class PublicationEvent extends Event {
  /**
   * A broadcast service associated with the publication event. */
  @JsonldProperty("http://schema.org/publishedOn")
  public BroadcastService publishedOn;

  /**
   * A flag to signal that the publication is accessible for free. */
  @JsonldProperty("http://schema.org/isAccessibleForFree")
  public Boolean isAccessibleForFree;
}
