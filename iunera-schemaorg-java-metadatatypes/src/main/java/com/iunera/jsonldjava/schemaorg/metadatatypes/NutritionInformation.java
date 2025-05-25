package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;

/**
 * Nutritional information about the recipe. */
@Vertex
@JsonldType("http://schema.org/NutritionInformation")
public class NutritionInformation extends StructuredValue {
  /**
   * The number of grams of saturated fat. */
  @JsonldProperty("http://schema.org/saturatedFatContent")
  public Mass saturatedFatContent;

  /**
   * The number of milligrams of sodium. */
  @JsonldProperty("http://schema.org/sodiumContent")
  public Mass sodiumContent;

  /**
   * The number of grams of protein. */
  @JsonldProperty("http://schema.org/proteinContent")
  public Mass proteinContent;

  /**
   * The serving size, in terms of the number of volume or mass. */
  @JsonldProperty("http://schema.org/servingSize")
  public String servingSize;

  /**
   * The number of grams of fiber. */
  @JsonldProperty("http://schema.org/fiberContent")
  public Mass fiberContent;

  /**
   * The number of grams of carbohydrates. */
  @JsonldProperty("http://schema.org/carbohydrateContent")
  public Mass carbohydrateContent;

  /**
   * The number of grams of unsaturated fat. */
  @JsonldProperty("http://schema.org/unsaturatedFatContent")
  public Mass unsaturatedFatContent;

  /**
   * The number of calories. */
  @JsonldProperty("http://schema.org/calories")
  public Energy calories;

  /**
   * The number of grams of fat. */
  @JsonldProperty("http://schema.org/fatContent")
  public Mass fatContent;

  /**
   * The number of milligrams of cholesterol. */
  @JsonldProperty("http://schema.org/cholesterolContent")
  public Mass cholesterolContent;

  /**
   * The number of grams of sugar. */
  @JsonldProperty("http://schema.org/sugarContent")
  public Mass sugarContent;

  /**
   * The number of grams of trans fat. */
  @JsonldProperty("http://schema.org/transFatContent")
  public Mass transFatContent;
}
