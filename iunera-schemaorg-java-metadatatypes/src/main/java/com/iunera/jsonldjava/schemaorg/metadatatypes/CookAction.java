package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * The act of producing/preparing food. */
@Vertex
@JsonldType("http://schema.org/CookAction")
public class CookAction extends CreateAction {
  /**
   * A sub property of location. The specific food establishment where the action occurred. */
  @JsonldProperty("http://schema.org/foodEstablishment")
  public List<FoodEstablishment> foodEstablishmentFoodEstablishment;

  /**
   * A sub property of location. The specific food establishment where the action occurred. */
  @JsonldProperty("http://schema.org/foodEstablishment")
  public List<Place> foodEstablishmentPlace;

  /**
   * A sub property of location. The specific food event where the action occurred. */
  @JsonldProperty("http://schema.org/foodEvent")
  public FoodEvent foodEvent;

  /**
   * A sub property of instrument. The recipe/instructions used to perform the action. */
  @JsonldProperty("http://schema.org/recipe")
  public Recipe recipe;
}
