package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * An image file. */
@Vertex
@JsonldType("http://schema.org/ImageObject")
public class ImageObject extends MediaObject {
  /**
   * Thumbnail image for an image or video. */
  @JsonldProperty("http://schema.org/thumbnail")
  public ImageObject thumbnail;

  /**
   * The caption for this object. */
  @JsonldProperty("http://schema.org/caption")
  public String caption;

  /**
   * exif data for this object. */
  @JsonldProperty("http://schema.org/exifData")
  public List<String> exifDataText;

  /**
   * Indicates whether this image is representative of the content of the page. */
  @JsonldProperty("http://schema.org/representativeOfPage")
  public Boolean representativeOfPage;

  /**
   * exif data for this object. */
  @JsonldProperty("http://schema.org/exifData")
  public List<PropertyValue> exifDataPropertyValue;
}
