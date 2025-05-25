package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A news article. */
@Vertex
@JsonldType("http://schema.org/NewsArticle")
public class NewsArticle extends Article {
  /**
   * If this NewsArticle appears in print, this field indicates the name of the page on which the article is found. Please note that this field is intended for the exact page name (e.g. A5, B18). */
  @JsonldProperty("http://schema.org/printPage")
  public String printPage;

  /**
   * The edition of the print product in which the NewsArticle appears. */
  @JsonldProperty("http://schema.org/printEdition")
  public String printEdition;

  /**
   * The location where the NewsArticle was produced. */
  @JsonldProperty("http://schema.org/dateline")
  public String dateline;

  /**
   * The number of the column in which the NewsArticle appears in the print edition. */
  @JsonldProperty("http://schema.org/printColumn")
  public String printColumn;

  /**
   * If this NewsArticle appears in print, this field indicates the print section in which the article appeared. */
  @JsonldProperty("http://schema.org/printSection")
  public String printSection;
}
