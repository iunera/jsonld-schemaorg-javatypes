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
 * A listing that describes a job opening in a certain organization.
 */
@Vertex
@JsonldType("http://schema.org/JobPosting")
public class JobPosting extends Intangible {
    /**
     * The title of the job.
     */
    @JsonldProperty("http://schema.org/title")
    public String title;

    /**
     * Description of bonus and commission compensation aspects of the job.
     */
    @JsonldProperty("http://schema.org/incentiveCompensation")
    public String incentiveCompensation;

    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @JsonldProperty("http://schema.org/baseSalary")
    public List<MonetaryAmount> baseSalaryMonetaryAmount;

    /**
     * A (typically single) geographic location associated with the job position.
     */
    @JsonldProperty("http://schema.org/jobLocation")
    public Place jobLocation;

    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     */
    @JsonldProperty("http://schema.org/validThrough")
    public java.util.Date validThrough;

    /**
     * Skills required to fulfill this role.
     */
    @JsonldProperty("http://schema.org/skills")
    public String skills;

    /**
     * Responsibilities associated with this role.
     */
    @JsonldProperty("http://schema.org/responsibilities")
    public String responsibilities;

    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @JsonldProperty("http://schema.org/baseSalary")
    public List<PriceSpecification> baseSalaryPriceSpecification;

    /**
     * Any special commitments associated with this job posting. Valid entries include VeteranCommit, MilitarySpouseCommit, etc.
     */
    @JsonldProperty("http://schema.org/specialCommitments")
    public String specialCommitments;

    /**
     * Type of employment (e.g. full-time, part-time, contract, temporary, seasonal, internship).
     */
    @JsonldProperty("http://schema.org/employmentType")
    public String employmentType;

    /**
     * The currency (coded using <a href="http://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a> ) used for the main salary information in this job posting or for this employee.
     */
    @JsonldProperty("http://schema.org/salaryCurrency")
    public String salaryCurrency;

    /**
     * The typical working hours for this job (e.g. 1st shift, night shift, 8am-5pm).
     */
    @JsonldProperty("http://schema.org/workHours")
    public String workHours;

    /**
     * Organization offering the job position.
     */
    @JsonldProperty("http://schema.org/hiringOrganization")
    public Organization hiringOrganization;

    /**
     * Description of skills and experience needed for the position.
     */
    @JsonldProperty("http://schema.org/experienceRequirements")
    public String experienceRequirements;

    /**
     * The industry associated with the job position.
     */
    @JsonldProperty("http://schema.org/industry")
    public String industry;

    /**
     * Publication date for the job posting.
     */
    @JsonldProperty("http://schema.org/datePosted")
    public java.util.Date datePosted;

    /**
     * Educational background needed for the position.
     */
    @JsonldProperty("http://schema.org/educationRequirements")
    public String educationRequirements;

    /**
     * Category or categories describing the job. Use BLS O*NET-SOC taxonomy: http://www.onetcenter.org/taxonomy.html. Ideally includes textual label and formal code, with the property repeated for each applicable value.
     */
    @JsonldProperty("http://schema.org/occupationalCategory")
    public String occupationalCategory;

    /**
     * Description of benefits associated with the job.
     */
    @JsonldProperty("http://schema.org/jobBenefits")
    public String jobBenefits;

    /**
     * Specific qualifications required for this role.
     */
    @JsonldProperty("http://schema.org/qualifications")
    public String qualifications;

    /**
     * The base salary of the job or of an employee in an EmployeeRole.
     */
    @JsonldProperty("http://schema.org/baseSalary")
    public List<java.math.BigDecimal> baseSalaryNumber;
}
