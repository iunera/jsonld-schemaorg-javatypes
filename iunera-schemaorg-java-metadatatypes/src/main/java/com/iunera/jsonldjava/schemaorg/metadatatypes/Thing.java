package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * The most generic type of item. */
@Vertex
@JsonldType("http://schema.org/Thing")
public class Thing {
  /**
   * An alias for the item. */
  @JsonldProperty("http://schema.org/alternateName")
  public String alternateName;

  /**
   * An image of the item. This can be a <a class="localLink" href="/URL">URL</a> or a fully described <a class="localLink" href="/ImageObject">ImageObject</a>. */
  @JsonldProperty("http://schema.org/image")
  public List<ImageObject> imageImageObject;

  /**
   * Indicates a potential Action, which describes an idealized action in which this thing would play an 'object' role. */
  @JsonldProperty("http://schema.org/potentialAction")
  public Action potentialAction;

  /**
   * URL of the item. */
  @JsonldProperty("http://schema.org/url")
  public java.net.URL url;

  /**
   * The name of the item. */
  @JsonldProperty("http://schema.org/name")
  public String name;

  /**
   * A description of the item. */
  @JsonldProperty("http://schema.org/description")
  public String description;

  /**
   * An additional type for the item, typically used for adding more specific types from external vocabularies in microdata syntax. This is a relationship between something and a class that the thing is in. In RDFa syntax, it is better to use the native RDFa syntax - the 'typeof' attribute - for multiple types. Schema.org tools may have only weaker understanding of extra types, in particular those defined externally. */
  @JsonldProperty("http://schema.org/additionalType")
  public java.net.URL additionalType;

  /**
   * URL of a reference Web page that unambiguously indicates the item's identity. E.g. the URL of the item's Wikipedia page, Freebase page, or official website. */
  @JsonldProperty("http://schema.org/sameAs")
  public java.net.URL sameAs;

  /**
   * An image of the item. This can be a <a class="localLink" href="/URL">URL</a> or a fully described <a class="localLink" href="/ImageObject">ImageObject</a>. */
  @JsonldProperty("http://schema.org/image")
  public List<java.net.URL> imageURL;

  /**
   * A sub property of description. A short description of the item used to disambiguate from other, similar items. Information from other properties (in particular, name) may be necessary for the description to be useful for disambiguation. */
  @JsonldProperty("http://schema.org/disambiguatingDescription")
  public String disambiguatingDescription;
}
