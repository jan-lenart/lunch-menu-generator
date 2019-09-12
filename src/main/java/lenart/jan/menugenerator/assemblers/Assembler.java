package lenart.jan.menugenerator.assemblers;

import lenart.jan.menugenerator.assemblers.dto.IngredientAmountDTO;
import lenart.jan.menugenerator.assemblers.dto.MeasureDTO;
import lenart.jan.menugenerator.model.IngredientAmount;
import lenart.jan.menugenerator.model.Measure;

import java.util.ArrayList;
import java.util.List;

public class Assembler {

    public static MeasureDTO makeMeasureDTO(Measure measure) {
        return new MeasureDTO(measure.getId(),
                measure.getName());
    }

    public static Measure unpackMeasureDTO(MeasureDTO dto) {
        return new Measure(dto.getId(),
                dto.getName());
    }

    public static List<MeasureDTO> makeMeasureDTOList(List<Measure> measures) {
        List<MeasureDTO> measureDTOs = new ArrayList<>();
        for (Measure measure : measures) {
            MeasureDTO dto = makeMeasureDTO(measure);
            measureDTOs.add(dto);
        }
        return measureDTOs;
    }

    public static List<Measure> unpackMeasureDTOList(List<MeasureDTO> dtos) {
        List<Measure> measures = new ArrayList<>();
        for (MeasureDTO dto : dtos) {
            Measure measure = unpackMeasureDTO(dto);
            measures.add(measure);
        }
        return measures;
    }

    public static IngredientAmountDTO makeIngredientAmountDTO(IngredientAmount ingredientAmount) {
        return new IngredientAmountDTO(ingredientAmount.getId(),
                ingredientAmount.getAmount(),
                ingredientAmount.getMeasure(),
                ingredientAmount.getIngredient());
    }

    public static IngredientAmount unpackIngredientAmountDTO(IngredientAmountDTO dto) {
        return new IngredientAmount(dto.getId(),
                dto.getAmount(),
                dto.getMeasure(),
                dto.getIngredient());
    }
}
