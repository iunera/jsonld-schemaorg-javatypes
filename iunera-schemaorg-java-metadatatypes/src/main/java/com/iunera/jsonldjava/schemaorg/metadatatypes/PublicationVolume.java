package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A part of a successively published publication such as a periodical or multi-volume work, often numbered. It may represent a time span, such as a year.
 * <pre><code>  &lt;br/&gt;&lt;br/&gt;See also &lt;a href="http://blog.schema.org/2014/09/schemaorg-support-for-bibliographic_2.html"&gt;blog post&lt;/a&gt;.
 * </code></pre> */
@Vertex
@JsonldType("http://schema.org/PublicationVolume")
public class PublicationVolume extends CreativeWork {
  /**
   * Identifies the volume of publication or multi-part work; for example, "iii" or "2". */
  @JsonldProperty("http://schema.org/volumeNumber")
  public List<Integer> volumeNumberInteger;

  /**
   * The page on which the work ends; for example "138" or "xvi". */
  @JsonldProperty("http://schema.org/pageEnd")
  public List<String> pageEndText;

  /**
   * The page on which the work starts; for example "135" or "xiii". */
  @JsonldProperty("http://schema.org/pageStart")
  public List<String> pageStartText;

  /**
   * Any description of pages that is not separated into pageStart and pageEnd; for example, "1-6, 9, 55" or "10-12, 46-49". */
  @JsonldProperty("http://schema.org/pagination")
  public String pagination;

  /**
   * The page on which the work starts; for example "135" or "xiii". */
  @JsonldProperty("http://schema.org/pageStart")
  public List<Integer> pageStartInteger;

  /**
   * The page on which the work ends; for example "138" or "xvi". */
  @JsonldProperty("http://schema.org/pageEnd")
  public List<Integer> pageEndInteger;

  /**
   * Identifies the volume of publication or multi-part work; for example, "iii" or "2". */
  @JsonldProperty("http://schema.org/volumeNumber")
  public List<String> volumeNumberText;
}
