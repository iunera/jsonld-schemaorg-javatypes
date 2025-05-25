package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A recipe. For dietary restrictions covered by the recipe, a few common restrictions are enumerated via <a class="localLink" href="/suitableForDiet">suitableForDiet</a>. The <a class="localLink" href="/keywords">keywords</a> property can also be used to add more detail. */
@Vertex
@JsonldType("http://schema.org/Recipe")
public class Recipe extends CreativeWork {
  /**
   * The category of the recipe—for example, appetizer, entree, etc. */
  @JsonldProperty("http://schema.org/recipeCategory")
  public String recipeCategory;

  /**
   * The quantity produced by the recipe (for example, number of people served, number of servings, etc). */
  @JsonldProperty("http://schema.org/recipeYield")
  public String recipeYield;

  /**
   * The time it takes to actually cook the dish, in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>. */
  @JsonldProperty("http://schema.org/cookTime")
  public Duration cookTime;

  /**
   * The cuisine of the recipe (for example, French or Ethiopian). */
  @JsonldProperty("http://schema.org/recipeCuisine")
  public String recipeCuisine;

  /**
   * A step or instruction involved in making the recipe. */
  @JsonldProperty("http://schema.org/recipeInstructions")
  public List<ItemList> recipeInstructionsItemList;

  /**
   * The total time it takes to prepare and cook the recipe, in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>. */
  @JsonldProperty("http://schema.org/totalTime")
  public Duration totalTime;

  /**
   * Nutrition information about the recipe. */
  @JsonldProperty("http://schema.org/nutrition")
  public NutritionInformation nutrition;

  /**
   * Indicates a dietary restriction or guideline for which this recipe is suitable, e.g. diabetic, halal etc. */
  @JsonldProperty("http://schema.org/suitableForDiet")
  public RestrictedDiet suitableForDiet;

  /**
   * The length of time it takes to prepare the recipe, in <a href="http://en.wikipedia.org/wiki/ISO_8601">ISO 8601 duration format</a>. */
  @JsonldProperty("http://schema.org/prepTime")
  public Duration prepTime;

  /**
   * The method of cooking, such as Frying, Steaming, ... */
  @JsonldProperty("http://schema.org/cookingMethod")
  public String cookingMethod;

  /**
   * A single ingredient used in the recipe, e.g. sugar, flour or garlic. */
  @JsonldProperty("http://schema.org/recipeIngredient")
  public String recipeIngredient;

  /**
   * A step or instruction involved in making the recipe. */
  @JsonldProperty("http://schema.org/recipeInstructions")
  public List<String> recipeInstructionsText;
}
