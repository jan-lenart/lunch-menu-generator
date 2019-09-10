package lenart.jan.menugenerator.model;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Recipe {
    String name;
    Duration prepareTime;
    String description;
    List<IngredientAmount> ingredientList;
    Set<RecipeType> types;
}
