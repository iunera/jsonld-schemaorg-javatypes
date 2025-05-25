package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A structured value providing information about when a certain organization or person owned a certain product. */
@Vertex
@JsonldType("http://schema.org/OwnershipInfo")
public class OwnershipInfo extends StructuredValue {
  /**
   * The product that this structured value is referring to. */
  @JsonldProperty("http://schema.org/typeOfGood")
  public List<Service> typeOfGoodService;

  /**
   * The date and time of obtaining the product. */
  @JsonldProperty("http://schema.org/ownedFrom")
  public java.util.Date ownedFrom;

  /**
   * The date and time of giving up ownership on the product. */
  @JsonldProperty("http://schema.org/ownedThrough")
  public java.util.Date ownedThrough;

  /**
   * The organization or person from which the product was acquired. */
  @JsonldProperty("http://schema.org/acquiredFrom")
  public List<Person> acquiredFromPerson;

  /**
   * The product that this structured value is referring to. */
  @JsonldProperty("http://schema.org/typeOfGood")
  public List<Product> typeOfGoodProduct;

  /**
   * The organization or person from which the product was acquired. */
  @JsonldProperty("http://schema.org/acquiredFrom")
  public List<Organization> acquiredFromOrganization;
}
