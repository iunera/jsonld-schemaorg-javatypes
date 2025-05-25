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
 * A structured value providing information about when a certain organization or person owned a certain product.
 */
@Vertex
@JsonldType("http://schema.org/OwnershipInfo")
public class OwnershipInfo extends StructuredValue {
    /**
     * The product that this structured value is referring to.
     */
    @JsonldProperty("http://schema.org/typeOfGood")
    public List<Service> typeOfGoodService;

    /**
     * The date and time of obtaining the product.
     */
    @JsonldProperty("http://schema.org/ownedFrom")
    public java.util.Date ownedFrom;

    /**
     * The date and time of giving up ownership on the product.
     */
    @JsonldProperty("http://schema.org/ownedThrough")
    public java.util.Date ownedThrough;

    /**
     * The organization or person from which the product was acquired.
     */
    @JsonldProperty("http://schema.org/acquiredFrom")
    public List<Person> acquiredFromPerson;

    /**
     * The product that this structured value is referring to.
     */
    @JsonldProperty("http://schema.org/typeOfGood")
    public List<Product> typeOfGoodProduct;

    /**
     * The organization or person from which the product was acquired.
     */
    @JsonldProperty("http://schema.org/acquiredFrom")
    public List<Organization> acquiredFromOrganization;
}
