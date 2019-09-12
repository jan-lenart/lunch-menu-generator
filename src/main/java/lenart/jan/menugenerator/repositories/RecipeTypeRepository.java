package lenart.jan.menugenerator.repositories;

import lenart.jan.menugenerator.model.RecipeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeTypeRepository extends JpaRepository<RecipeType, Long> {
}
