package lenart.jan.menugenerator.boot;

import lenart.jan.menugenerator.model.Recipe;
import lenart.jan.menugenerator.model.RecipeType;
import lenart.jan.menugenerator.repositories.RecipeRepository;
import lenart.jan.menugenerator.repositories.RecipeTypeRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class DataLoader implements ApplicationRunner {
    private final RecipeRepository recipeRepository;
    private final RecipeTypeRepository recipeTypeRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        addRecipeTypes();
        addRecipes();
    }

    private void addRecipes() {
        RecipeType type1 = new RecipeType("podstawowy");
        recipeTypeRepository.save(type1);
        RecipeType type2 = new RecipeType("wykwintny");
        recipeTypeRepository.save(type2);
        RecipeType type3 = new RecipeType("mięsny");
        recipeTypeRepository.save(type3);
        RecipeType type4 = new RecipeType("bezmięsny");
        recipeTypeRepository.save(type4);
        RecipeType type5 = new RecipeType("surówka");
        recipeTypeRepository.save(type5);
        RecipeType type6 = new RecipeType("makaron");
        recipeTypeRepository.save(type6);
        RecipeType type7 = new RecipeType("gulasz");
        recipeTypeRepository.save(type7);
        RecipeType type8 = new RecipeType("pierogi");
        recipeTypeRepository.save(type8);
        RecipeType type9 = new RecipeType("kotlet");
        recipeTypeRepository.save(type9);
        RecipeType type10 = new RecipeType("szybkie");
        recipeTypeRepository.save(type10);
        RecipeType type11 = new RecipeType("zupa");
        recipeTypeRepository.save(type11);
        RecipeType type12 = new RecipeType("puszki");
        recipeTypeRepository.save(type12);
        RecipeType type13 = new RecipeType("słodki");
        recipeTypeRepository.save(type13);
        RecipeType type14 = new RecipeType("sezonowe");
        recipeTypeRepository.save(type14);

        Recipe recipe1 = new Recipe();
        recipe1.setName("Schabowy");
        recipe1.setDescription("Usmazyc i zjeść");
        recipe1.setPrepareTime(60);
        recipe1.addRecipeType(type9);
        recipe1.addRecipeType(type3);
        recipeRepository.save(recipe1);

        Recipe recipe2 = new Recipe();
        recipe2.setName("Kurczak pieczony");
        recipe2.setDescription("Upiec i zjeść");
        recipe2.setPrepareTime(120);
        recipe2.addRecipeType(type4);
        recipeRepository.save(recipe2);
    }

    private void addRecipeTypes() {
    }
}
