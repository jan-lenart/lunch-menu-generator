package lenart.jan.menugenerator.services;

import lenart.jan.menugenerator.repositories.RecipeRepository;
import lenart.jan.menugenerator.repositories.RecipeTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RecipeService {
    private final RecipeRepository recipeRepository;
    private final RecipeTypeRepository recipeTypeRepository;


}
