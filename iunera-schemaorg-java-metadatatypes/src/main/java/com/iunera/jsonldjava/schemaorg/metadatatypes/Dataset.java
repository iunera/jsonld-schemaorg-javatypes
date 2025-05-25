package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * A body of structured information describing some topic(s) of interest. */
@Vertex
@JsonldType("http://schema.org/Dataset")
public class Dataset extends CreativeWork {
  /**
   * A data catalog which contains this dataset. */
  @JsonldProperty("http://schema.org/includedInDataCatalog")
  public DataCatalog includedInDataCatalog;

  /**
   * A downloadable form of this dataset, at a specific location, in a specific format. */
  @JsonldProperty("http://schema.org/distribution")
  public DataDownload distribution;
}
