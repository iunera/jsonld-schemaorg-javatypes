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
 * A structured value representing a price or price range. Typically, only the subclasses of this type are used for markup. It is recommended to use <a class="localLink" href="/MonetaryAmount">MonetaryAmount</a> to describe independent amounts of money such as a salary, credit card limits, etc.
 */
@Vertex
@JsonldType("http://schema.org/PriceSpecification")
public class PriceSpecification extends StructuredValue {
    /**
     * The interval and unit of measurement of ordering quantities for which the offer or price specification is valid. This allows e.g. specifying that a certain freight charge is valid only for a certain quantity.
     */
    @JsonldProperty("http://schema.org/eligibleQuantity")
    public QuantitativeValue eligibleQuantity;

    /**
     * The currency (in 3-letter ISO 4217 format) of the price or a price component, when attached to <a class="localLink" href="/PriceSpecification">PriceSpecification</a> and its subtypes.
     */
    @JsonldProperty("http://schema.org/priceCurrency")
    public String priceCurrency;

    /**
     * The lowest price if the price is a range.
     */
    @JsonldProperty("http://schema.org/minPrice")
    public java.math.BigDecimal minPrice;

    /**
     * The highest price if the price is a range.
     */
    @JsonldProperty("http://schema.org/maxPrice")
    public java.math.BigDecimal maxPrice;

    /**
     * The date after when the item is not valid. For example the end of an offer, salary period, or a period of opening hours.
     */
    @JsonldProperty("http://schema.org/validThrough")
    public java.util.Date validThrough;

    /**
     * Specifies whether the applicable value-added tax (VAT) is included in the price specification or not.
     */
    @JsonldProperty("http://schema.org/valueAddedTaxIncluded")
    public Boolean valueAddedTaxIncluded;

    /**
     * The transaction volume, in a monetary unit, for which the offer or price specification is valid, e.g. for indicating a minimal purchasing volume, to express free shipping above a certain order volume, or to limit the acceptance of credit cards to purchases to a certain minimal amount.
     */
    @JsonldProperty("http://schema.org/eligibleTransactionVolume")
    public PriceSpecification eligibleTransactionVolume;

    /**
     * The date when the item becomes valid.
     */
    @JsonldProperty("http://schema.org/validFrom")
    public java.util.Date validFrom;

    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
     * Usage guidelines:
     * <ul>
     * <li>Use the <a class="localLink" href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
     *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '' in the value.</li>
     * <li>Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.</li>
     * <li>Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values alongside more human-friendly formatting.</li>
     * <li>Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.</li>
     * </ul>
     */
    @JsonldProperty("http://schema.org/price")
    public List<java.math.BigDecimal> priceNumber;

    /**
     * The offer price of a product, or of a price component when attached to PriceSpecification and its subtypes.
     * Usage guidelines:
     * <ul>
     * <li>Use the <a class="localLink" href="/priceCurrency">priceCurrency</a> property (with <a href="http://en.wikipedia.org/wiki/ISO_4217#Active_codes">ISO 4217 codes</a> e.g. "USD") instead of
     *       including <a href="http://en.wikipedia.org/wiki/Dollar_sign#Currencies_that_use_the_dollar_or_peso_sign">ambiguous symbols</a> such as '' in the value.</li>
     * <li>Use '.' (Unicode 'FULL STOP' (U+002E)) rather than ',' to indicate a decimal point. Avoid using these symbols as a readability separator.</li>
     * <li>Note that both <a href="http://www.w3.org/TR/xhtml-rdfa-primer/#using-the-content-attribute">RDFa</a> and Microdata syntax allow the use of a "content=" attribute for publishing simple machine-readable values alongside more human-friendly formatting.</li>
     * <li>Use values from 0123456789 (Unicode 'DIGIT ZERO' (U+0030) to 'DIGIT NINE' (U+0039)) rather than superficially similiar Unicode symbols.</li>
     * </ul>
     */
    @JsonldProperty("http://schema.org/price")
    public List<String> priceText;
}
