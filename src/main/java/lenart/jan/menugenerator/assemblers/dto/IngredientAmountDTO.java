package lenart.jan.menugenerator.assemblers.dto;

import lenart.jan.menugenerator.model.Ingredient;
import lenart.jan.menugenerator.model.Measure;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
public class IngredientAmountDTO {
    Long id;
    BigDecimal amount;
    Measure measure;
    Ingredient ingredient;
}
