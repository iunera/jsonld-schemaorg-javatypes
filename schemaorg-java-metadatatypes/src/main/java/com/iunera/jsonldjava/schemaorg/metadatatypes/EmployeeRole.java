/*
 * Copyright (C) 2025.  Tim Frey, Christian Schmitt
 *
 * Licensed under the OPEN COMPENSATION TOKEN LICENSE (the "License").
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at <a href="https://www.license-token.com/license/text">https://www.license-token.com/license/text</a>
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either expressed or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @octl.sid: 4efebf98-4efe-ff98-bf98-00004eb04127
 *
 */

package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

import java.util.List;

/**
 * A subclass of OrganizationRole used to describe employee relationships.
 */
@Vertex
@JsonldType("http://schema.org/EmployeeRole")
public class EmployeeRole extends OrganizationRole {
    /**
     * The currency (coded using <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a> ) used for the main salary information in this job posting or for this employee.
     */
    @JsonldProperty("http://schema.org/salaryCurrency")
    public String salaryCurrency;

    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @JsonldProperty("http://schema.org/baseSalary")
    public List<MonetaryAmount> baseSalaryMonetaryAmount;

    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @JsonldProperty("http://schema.org/baseSalary")
    public List<PriceSpecification> baseSalaryPriceSpecification;

    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @JsonldProperty("http://schema.org/baseSalary")
    public List<java.math.BigDecimal> baseSalaryNumber;
}
