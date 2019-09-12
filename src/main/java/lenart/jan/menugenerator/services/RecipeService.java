package lenart.jan.menugenerator.services;

import lenart.jan.menugenerator.assemblers.Assembler;
import lenart.jan.menugenerator.assemblers.dto.MeasureDTO;
import lenart.jan.menugenerator.exceptions.ResourceNotFoundException;
import lenart.jan.menugenerator.model.Measure;
import lenart.jan.menugenerator.repositories.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class RecipeService {
    private final IngredientAmountRepository ingredientAmountRepository;
    private final IngredientRepository ingredientRepository;
    private final IngredientTypeRepository ingredientTypeRepository;
    private final MeasureRepository measureRepository;
    private final RecipeRepository recipeRepository;
    private final RecipeTypeRepository recipeTypeRepository;

    public MeasureDTO getMeasure(Long id) {
        Optional<Measure> measureOptional = measureRepository.findById(id);
        Measure measure = measureOptional.orElseThrow(ResourceNotFoundException::new);
        return Assembler.makeMeasureDTO(measure);
    }

    public List<MeasureDTO> getAllMeasures() {
        List<Measure> measures = measureRepository.findAll();
        return Assembler.makeMeasureDTOList(measures);
    }

}
