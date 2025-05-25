package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A datasheet or vendor specification of a product (in the sense of a prototypical description). */
@Vertex
@JsonldType("http://schema.org/ProductModel")
public class ProductModel extends Product {
  /**
   * A pointer from a newer variant of a product  to its previous, often discontinued predecessor. */
  @JsonldProperty("http://schema.org/successorOf")
  public ProductModel successorOf;

  /**
   * A pointer to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive. */
  @JsonldProperty("http://schema.org/isVariantOf")
  public ProductModel isVariantOf;

  /**
   * A pointer from a previous, often discontinued variant of the product to its newer variant. */
  @JsonldProperty("http://schema.org/predecessorOf")
  public ProductModel predecessorOf;
}
