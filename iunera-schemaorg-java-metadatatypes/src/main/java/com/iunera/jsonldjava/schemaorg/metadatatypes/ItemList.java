package com.iunera.jsonldjava.schemaorg.metadatatypes;

import com.iunera.jsonldjava.schemaorg.associations.JsonldProperty;
import com.iunera.jsonldjava.schemaorg.associations.JsonldType;
import com.iunera.jsonldjava.schemaorg.associations.Vertex;
import java.util.List;

/**
 * A list of items of any sort&#x2014;for example, Top 10 Movies About Weathermen, or Top 100 Party Songs. Not to be confused with HTML lists, which are often used only for formatting. */
@Vertex
@JsonldType("http://schema.org/ItemList")
public class ItemList extends Intangible {
  /**
   * Type of ordering (e.g. Ascending, Descending, Unordered). */
  @JsonldProperty("http://schema.org/itemListOrder")
  public List<String> itemListOrderText;

  /**
   * The number of items in an ItemList. Note that some descriptions might not fully describe all items in a list (e.g., multi-page pagination); in such cases, the numberOfItems would be for the entire list. */
  @JsonldProperty("http://schema.org/numberOfItems")
  public Integer numberOfItems;

  /**
   * For itemListElement values, you can use simple strings (e.g. "Peter", "Paul", "Mary"), existing entities, or use ListItem.
   * Text values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.
   * Note: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases. */
  @JsonldProperty("http://schema.org/itemListElement")
  public List<ListItem> itemListElementListItem;

  /**
   * Type of ordering (e.g. Ascending, Descending, Unordered). */
  @JsonldProperty("http://schema.org/itemListOrder")
  public List<ItemListOrderType> itemListOrderItemListOrderType;

  /**
   * For itemListElement values, you can use simple strings (e.g. "Peter", "Paul", "Mary"), existing entities, or use ListItem.
   * Text values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.
   * Note: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases. */
  @JsonldProperty("http://schema.org/itemListElement")
  public List<Thing> itemListElementThing;

  /**
   * For itemListElement values, you can use simple strings (e.g. "Peter", "Paul", "Mary"), existing entities, or use ListItem.
   * Text values are best if the elements in the list are plain strings. Existing entities are best for a simple, unordered list of existing things in your data. ListItem is used with ordered lists when you want to provide additional context about the element in that list or when the same item might be in different places in different lists.
   * Note: The order of elements in your mark-up is not sufficient for indicating the order or elements.  Use ListItem with a 'position' property in such cases. */
  @JsonldProperty("http://schema.org/itemListElement")
  public List<String> itemListElementText;
}
