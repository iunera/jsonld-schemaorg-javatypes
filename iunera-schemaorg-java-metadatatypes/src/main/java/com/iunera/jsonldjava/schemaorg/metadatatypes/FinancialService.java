package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * Financial services business. */
@Vertex
@JsonldType("http://schema.org/FinancialService")
public class FinancialService extends LocalBusiness {
  /**
   * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization. */
  @JsonldProperty("http://schema.org/feesAndCommissionsSpecification")
  public List<java.net.URL> feesAndCommissionsSpecificationURL;

  /**
   * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization. */
  @JsonldProperty("http://schema.org/feesAndCommissionsSpecification")
  public List<String> feesAndCommissionsSpecificationText;
}
