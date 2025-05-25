package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A subclass of OrganizationRole used to describe employee relationships. */
@Vertex
@JsonldType("http://schema.org/EmployeeRole")
public class EmployeeRole extends OrganizationRole {
  /**
   * The currency (coded using <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a> ) used for the main salary information in this job posting or for this employee. */
  @JsonldProperty("http://schema.org/salaryCurrency")
  public String salaryCurrency;

  /**
   * The base salary of the job or of an employee in an EmployeeRole. */
  @JsonldProperty("http://schema.org/baseSalary")
  public List<MonetaryAmount> baseSalaryMonetaryAmount;

  /**
   * The base salary of the job or of an employee in an EmployeeRole. */
  @JsonldProperty("http://schema.org/baseSalary")
  public List<PriceSpecification> baseSalaryPriceSpecification;

  /**
   * The base salary of the job or of an employee in an EmployeeRole. */
  @JsonldProperty("http://schema.org/baseSalary")
  public List<java.math.BigDecimal> baseSalaryNumber;
}
