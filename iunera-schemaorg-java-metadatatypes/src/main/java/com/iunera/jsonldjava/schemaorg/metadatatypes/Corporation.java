package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Organization: A business corporation. */
@Vertex
@JsonldType("http://schema.org/Corporation")
public abstract class Corporation extends Organization {
  /**
   * The exchange traded instrument associated with a Corporation object. The tickerSymbol is expressed as an exchange and an instrument name separated by a space character. For the exchange component of the tickerSymbol attribute, we reccommend using the controlled vocaulary of Market Identifier Codes (MIC) specified in ISO15022. */
  @JsonldProperty("http://schema.org/tickerSymbol")
  public String tickerSymbol;
}
