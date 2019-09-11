package lenart.jan.menugenerator.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@Entity
@AllArgsConstructor
@Data
public class Recipe {
    @Id
    Long id;
    String name;
    Integer prepareTime;
    String description;
    @OneToMany
    List<IngredientAmount> ingredientList;
    @OneToMany
    Set<RecipeType> types;

    public Recipe() {
        ingredientList = new LinkedList<>();
        types = new HashSet<>();
    }

    public void addIngredientAmount(IngredientAmount ingredientAmount) {
        if (ingredientList == null) {
            ingredientList = new LinkedList<>();
        }
        ingredientList.add(ingredientAmount);
    }

    public void addRecipeType(RecipeType type) {
        if (types == null) {
            types = new HashSet<>();
        }
        types.add(type);
    }
}
