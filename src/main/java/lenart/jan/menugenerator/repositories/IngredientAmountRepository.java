package lenart.jan.menugenerator.repositories;

import lenart.jan.menugenerator.model.IngredientAmount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientAmountRepository extends JpaRepository<IngredientAmount, Long> {
}
