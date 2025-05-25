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
 * Nutritional information about the recipe.
 */
@Vertex
@JsonldType("http://schema.org/NutritionInformation")
public class NutritionInformation extends StructuredValue {
    /**
     * The number of grams of saturated fat.
     */
    @JsonldProperty("http://schema.org/saturatedFatContent")
    public Mass saturatedFatContent;

    /**
     * The number of milligrams of sodium.
     */
    @JsonldProperty("http://schema.org/sodiumContent")
    public Mass sodiumContent;

    /**
     * The number of grams of protein.
     */
    @JsonldProperty("http://schema.org/proteinContent")
    public Mass proteinContent;

    /**
     * The serving size, in terms of the number of volume or mass.
     */
    @JsonldProperty("http://schema.org/servingSize")
    public String servingSize;

    /**
     * The number of grams of fiber.
     */
    @JsonldProperty("http://schema.org/fiberContent")
    public Mass fiberContent;

    /**
     * The number of grams of carbohydrates.
     */
    @JsonldProperty("http://schema.org/carbohydrateContent")
    public Mass carbohydrateContent;

    /**
     * The number of grams of unsaturated fat.
     */
    @JsonldProperty("http://schema.org/unsaturatedFatContent")
    public Mass unsaturatedFatContent;

    /**
     * The number of calories.
     */
    @JsonldProperty("http://schema.org/calories")
    public Energy calories;

    /**
     * The number of grams of fat.
     */
    @JsonldProperty("http://schema.org/fatContent")
    public Mass fatContent;

    /**
     * The number of milligrams of cholesterol.
     */
    @JsonldProperty("http://schema.org/cholesterolContent")
    public Mass cholesterolContent;

    /**
     * The number of grams of sugar.
     */
    @JsonldProperty("http://schema.org/sugarContent")
    public Mass sugarContent;

    /**
     * The number of grams of trans fat.
     */
    @JsonldProperty("http://schema.org/transFatContent")
    public Mass transFatContent;
}
