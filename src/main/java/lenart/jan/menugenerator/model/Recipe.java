package lenart.jan.menugenerator.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@Data
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Integer prepareTime;
    String description;
    @OneToMany(mappedBy = "recipe")
    Set<RecipeType> types;

    public Recipe() {
        types = new HashSet<>();
    }

    public Recipe(String name, Integer prepareTime, String description) {
        this.name = name;
        this.prepareTime = prepareTime;
        this.description = description;
    }

    public void addRecipeType(RecipeType type) {
        if (types == null) {
            types = new HashSet<>();
        }
        types.add(type);
    }
}
