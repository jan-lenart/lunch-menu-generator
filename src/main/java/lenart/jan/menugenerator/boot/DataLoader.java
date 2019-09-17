package lenart.jan.menugenerator.boot;

import lenart.jan.menugenerator.model.Recipe;
import lenart.jan.menugenerator.repositories.RecipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataLoader implements ApplicationRunner {
    private final RecipeRepository recipeRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Recipe recipe1 = new Recipe();
        recipe1.setName("Schabowy");
        recipe1.setDescription("Usmazyc i zjeść");
        recipe1.setPrepareTime(60);
//        recipe1.setId(1L);
//        recipe1.addRecipeType();
        recipeRepository.save(recipe1);
    }

    private void addRecipes() {

    }
}
