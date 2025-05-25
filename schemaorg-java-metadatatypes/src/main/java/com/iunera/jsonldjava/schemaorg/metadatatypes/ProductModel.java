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
 * A datasheet or vendor specification of a product (in the sense of a prototypical description).
 */
@Vertex
@JsonldType("http://schema.org/ProductModel")
public class ProductModel extends Product {
    /**
     * A pointer from a newer variant of a product  to its previous, often discontinued predecessor.
     */
    @JsonldProperty("http://schema.org/successorOf")
    public ProductModel successorOf;

    /**
     * A pointer to a base product from which this product is a variant. It is safe to infer that the variant inherits all product features from the base model, unless defined locally. This is not transitive.
     */
    @JsonldProperty("http://schema.org/isVariantOf")
    public ProductModel isVariantOf;

    /**
     * A pointer from a previous, often discontinued variant of the product to its newer variant.
     */
    @JsonldProperty("http://schema.org/predecessorOf")
    public ProductModel predecessorOf;
}
