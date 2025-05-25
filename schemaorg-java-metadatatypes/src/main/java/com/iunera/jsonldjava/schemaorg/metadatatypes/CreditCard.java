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

/**
 * A card payment method of a particular brand or name.  Used to mark up a particular payment method and/or the financial product/service that supplies the card account.
 * Commonly used values:
 * <ul>
 * <li>http://purl.org/goodrelations/v1#AmericanExpress</li>
 * <li>http://purl.org/goodrelations/v1#DinersClub</li>
 * <li>http://purl.org/goodrelations/v1#Discover</li>
 * <li>http://purl.org/goodrelations/v1#JCB</li>
 * <li>http://purl.org/goodrelations/v1#MasterCard</li>
 * <li>http://purl.org/goodrelations/v1#VISA</li>
 * </ul>
 */
@Vertex
@JsonldType("http://schema.org/CreditCard")
public class CreditCard extends PaymentCard {
    /**
     * This one of additional original supertypes as defined at schema.org. However, Java does not support multi class inheritance and therefore a composition was used.
     */
    @JsonldProperty("http://schema.org/LoanOrCredit")
    public LoanOrCredit loanOrCredit;
}
