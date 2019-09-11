package lenart.jan.menugenerator.repositories;

import lenart.jan.menugenerator.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
