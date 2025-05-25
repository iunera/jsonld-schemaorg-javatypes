package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A book. */
@Vertex
@JsonldType("http://schema.org/Book")
public class Book extends CreativeWork {
  /**
   * The format of the book. */
  @JsonldProperty("http://schema.org/bookFormat")
  public BookFormatType bookFormat;

  /**
   * The number of pages in the book. */
  @JsonldProperty("http://schema.org/numberOfPages")
  public Integer numberOfPages;

  /**
   * The ISBN of the book. */
  @JsonldProperty("http://schema.org/isbn")
  public String isbn;

  /**
   * The edition of the book. */
  @JsonldProperty("http://schema.org/bookEdition")
  public String bookEdition;

  /**
   * The illustrator of the book. */
  @JsonldProperty("http://schema.org/illustrator")
  public Person illustrator;
}
