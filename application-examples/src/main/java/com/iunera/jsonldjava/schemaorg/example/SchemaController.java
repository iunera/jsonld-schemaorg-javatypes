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

package com.iunera.jsonldjava.schemaorg.example;

import com.example.schemaapp.dto.ProductDTO;
import com.example.schemaapp.repository.NativeVertexMapper;
import com.iunera.jsonldjava.schemaorg.mapping.FieldMapper;
import com.iunera.jsonldjava.schemaorg.utils.SimpleSerializer;
import com.iunera.jsonldjava.schemaorg.metadatatypes.Offer;
import com.iunera.jsonldjava.schemaorg.metadatatypes.PostalAddress;
import com.iunera.jsonldjava.schemaorg.metadatatypes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Example REST controller for managing Schema.org objects .
 */
@RestController
public class SchemaController {
    @Autowired
    private NativeVertexMapper vertexMapper;

    /**
     * Retrieves all Product vertices. Shows how tow retrieve Schema Org objects 
     * @param mediaType The response media type (JSON or JSON-LD).
     * @return A list of Product objects.
     */
    @GetMapping(value = "/products", produces = {MediaType.APPLICATION_JSON_VALUE, "application/ld+json"})
    public String getProducts(@RequestParam(value = "mediaType", defaultValue = "application/json") String mediaType) {
        return SimpleSerializer.toJsonLd(vertexMapper.findAllVertices(Product.class));
    }

    /**
     * Creates or updates a Product vertex from a ProductDTO using the jsonld-schemaorg-javatypes FieldMapper.
     * Demonstrates how a DTO can be used for mapping.
     * Note: The same way can also be used to map a DTO from a Database to a @Vertex object.
     * @param productDTO The ProductDTO to map and save.
     * @throws RuntimeException If mapping or saving fails.
     */
    @PostMapping(value = "/products", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveProduct(@RequestBody ProductDTO productDTO) {
        try {
            // Define field mappings for Product
            Map<String, String> productFieldMappings = Map.of(
                "dtoName", "name",
                "dtoDescription", "description"
            );

            // Define field mappings for Offer
            Map<String, String> offerFieldMappings = Map.of(
                "dtoPrice", "price",
                "dtoPriceCurrency", "priceCurrency"
            );

            // Create target Product and Offer
            Product product = new Product();
            Offer offer = new Offer();
            product.setOffer(offer);

            // Map fields using FieldMapper
            FieldMapper productMapper = new FieldMapper(productFieldMappings, Set.of());
            FieldMapper offerMapper = new FieldMapper(offerFieldMappings, Set.of());
            productMapper.copyFieldsWithMapping(product, productDTO);
            offerMapper.copyFieldsWithMapping(offer, productDTO.getOffer());

            // Set ID if present
            product.setId(productDTO.getId());

            // Save or update the Product vertex
            vertexMapper.saveVertex(product);
        } catch (Exception e) {
            throw new RuntimeException("Failed to map or save Product: " + e.getMessage(), e);
        }
    }

    /**
     * Retrieves all PostalAddress vertices, optionally including related vertices.
     * @param mediaType The response media type (JSON or JSON-LD).
     * @param includeRelated If true, includes related vertices (e.g., Person).
     * @return A list of PostalAddress objects.
     */
    @GetMapping(value = "/addresses", produces = {MediaType.APPLICATION_JSON_VALUE, "application/ld+json"})
    public String getAddresses(
            @RequestParam(value = "mediaType", defaultValue = "application/json") String mediaType,
            @RequestParam(value = "includeRelated", defaultValue = "false") boolean includeRelated) {
            
        return SimpleSerializer.toJsonLd(vertexMapper.findAllVertices(PostalAddress.class, includeRelated));
    }

    /**
     * Retrieves a PostalAddress vertex by its ID.
     * @param id The vertex ID.
     * @param mediaType The response media type (JSON or JSON-LD).
     * @return The PostalAddress object.
     */
    @GetMapping(value = "/addresses/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, "application/ld+json"})
    public String getAddressById(
            @PathVariable String id,
            @RequestParam(value = "mediaType", defaultValue = "application/json") String mediaType) {
        return SimpleSerializer.toJsonLd(vertexMapper.findVertexById(PostalAddress.class, id));
    }

    /**
     * Creates or updates a Schema.org object as a vertex.
     * @param schemaOrgObject The object to create or update.
     */
    @PostMapping(value = "/vertices", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveVertex(@RequestBody Object schemaOrgObject) {
        vertexMapper.saveVertex(schemaOrgObject);
    }

    /**
     * Updates a reference (edge) for a vertex.
     * @param sourceId The source vertex ID.
     * @param propertyName The property name (edge label).
     * @param targetId The target vertex ID.
     */
    @PatchMapping(value = "/vertices/{sourceId}/references/{propertyName}")
    public void updateReference(
            @PathVariable String sourceId,
            @PathVariable String propertyName,
            @RequestParam String targetId) {
        vertexMapper.updateReference(sourceId, propertyName, targetId);
    }

    /**
     * Updates properties of a PostalAddress vertex.
     * @param id The vertex ID.
     * @param properties A map of property names to values.
     */
    @PatchMapping(value = "/addresses/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateAddressProperties(
            @PathVariable String id,
            @RequestBody Map<String, Object> properties) {
        vertexMapper.updateVertexProperties(id, properties);
    }
}
