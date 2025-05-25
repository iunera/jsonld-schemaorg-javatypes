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
 * A product provided to consumers and businesses by financial institutions such as banks, insurance companies, brokerage firms, consumer finance companies, and investment companies which comprise the financial services industry.
 */
@Vertex
@JsonldType("http://schema.org/FinancialProduct")
public class FinancialProduct extends Service {
    /**
     * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.
     */
    @JsonldProperty("http://schema.org/feesAndCommissionsSpecification")
    public List<java.net.URL> feesAndCommissionsSpecificationURL;

    /**
     * The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
     */
    @JsonldProperty("http://schema.org/annualPercentageRate")
    public List<java.math.BigDecimal> annualPercentageRateNumber;

    /**
     * The annual rate that is charged for borrowing (or made by investing), expressed as a single percentage number that represents the actual yearly cost of funds over the term of a loan. This includes any fees or additional costs associated with the transaction.
     */
    @JsonldProperty("http://schema.org/annualPercentageRate")
    public List<QuantitativeValue> annualPercentageRateQuantitativeValue;

    /**
     * The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.
     */
    @JsonldProperty("http://schema.org/interestRate")
    public List<QuantitativeValue> interestRateQuantitativeValue;

    /**
     * Description of fees, commissions, and other terms applied either to a class of financial product, or by a financial service organization.
     */
    @JsonldProperty("http://schema.org/feesAndCommissionsSpecification")
    public List<String> feesAndCommissionsSpecificationText;

    /**
     * The interest rate, charged or paid, applicable to the financial product. Note: This is different from the calculated annualPercentageRate.
     */
    @JsonldProperty("http://schema.org/interestRate")
    public List<java.math.BigDecimal> interestRateNumber;
}
