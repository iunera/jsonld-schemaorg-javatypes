package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A work of art that is primarily visual in character. */
@Vertex
@JsonldType("http://schema.org/VisualArtwork")
public class VisualArtwork extends CreativeWork {
  /**
   * The height of the item. */
  @JsonldProperty("http://schema.org/height")
  public List<Distance> heightDistance;

  /**
   * The depth of the item. */
  @JsonldProperty("http://schema.org/depth")
  public List<Distance> depthDistance;

  /**
   * The number of copies when multiple copies of a piece of artwork are produced - e.g. for a limited edition of 20 prints, 'artEdition' refers to the total number of copies (in this example "20"). */
  @JsonldProperty("http://schema.org/artEdition")
  public List<Integer> artEditionInteger;

  /**
   * The width of the item. */
  @JsonldProperty("http://schema.org/width")
  public List<Distance> widthDistance;

  /**
   * The number of copies when multiple copies of a piece of artwork are produced - e.g. for a limited edition of 20 prints, 'artEdition' refers to the total number of copies (in this example "20"). */
  @JsonldProperty("http://schema.org/artEdition")
  public List<String> artEditionText;

  /**
   * The depth of the item. */
  @JsonldProperty("http://schema.org/depth")
  public List<QuantitativeValue> depthQuantitativeValue;

  /**
   * e.g. Painting, Drawing, Sculpture, Print, Photograph, Assemblage, Collage, etc. */
  @JsonldProperty("http://schema.org/artform")
  public List<java.net.URL> artformURL;

  /**
   * The material used. (e.g. Oil, Watercolour, Acrylic, Linoprint, Marble, Cyanotype, Digital, Lithograph, DryPoint, Intaglio, Pastel, Woodcut, Pencil, Mixed Media, etc.) */
  @JsonldProperty("http://schema.org/artMedium")
  public List<String> artMediumText;

  /**
   * The supporting materials for the artwork, e.g. Canvas, Paper, Wood, Board, etc. */
  @JsonldProperty("http://schema.org/artworkSurface")
  public List<java.net.URL> artworkSurfaceURL;

  /**
   * The height of the item. */
  @JsonldProperty("http://schema.org/height")
  public List<QuantitativeValue> heightQuantitativeValue;

  /**
   * The material used. (e.g. Oil, Watercolour, Acrylic, Linoprint, Marble, Cyanotype, Digital, Lithograph, DryPoint, Intaglio, Pastel, Woodcut, Pencil, Mixed Media, etc.) */
  @JsonldProperty("http://schema.org/artMedium")
  public List<java.net.URL> artMediumURL;

  /**
   * e.g. Painting, Drawing, Sculpture, Print, Photograph, Assemblage, Collage, etc. */
  @JsonldProperty("http://schema.org/artform")
  public List<String> artformText;

  /**
   * The width of the item. */
  @JsonldProperty("http://schema.org/width")
  public List<QuantitativeValue> widthQuantitativeValue;

  /**
   * The supporting materials for the artwork, e.g. Canvas, Paper, Wood, Board, etc. */
  @JsonldProperty("http://schema.org/artworkSurface")
  public List<String> artworkSurfaceText;
}
