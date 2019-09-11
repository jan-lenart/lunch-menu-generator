package lenart.jan.menugenerator.repositories;

import lenart.jan.menugenerator.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
