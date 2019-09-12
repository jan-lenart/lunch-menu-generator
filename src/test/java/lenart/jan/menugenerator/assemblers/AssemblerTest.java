package lenart.jan.menugenerator.assemblers;

import lenart.jan.menugenerator.assemblers.dto.MeasureDTO;
import lenart.jan.menugenerator.model.Measure;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AssemblerTest {

    private Measure measure;
    private MeasureDTO dto;
    private List<Measure> measureList;
    private List<MeasureDTO> measureDTOList;

    AssemblerTest() {
        measure = new Measure(1L, "Measure");
        dto = new MeasureDTO(1L, "MeasureDTO");
        measureList = Arrays.asList(measure, measure);
        measureDTOList = Arrays.asList(dto, dto);
    }


    @Test
    void testMakeMeasureDTO() {

        MeasureDTO dto = Assembler.makeMeasureDTO(measure);

        assertEquals(measure.getId(), dto.getId());
        assertEquals(measure.getName(), dto.getName());
    }

    @Test
    void testUnpackMeasureDTO() {
        Measure measure = Assembler.unpackMeasureDTO(dto);

        assertEquals(dto.getId(), measure.getId());
        assertEquals(dto.getName(), measure.getName());
    }

    @Test
    void testMakeMeasureDTOList() {
        List<MeasureDTO> dtos = Assembler.makeMeasureDTOList(measureList);

        assertEquals(2, dtos.size());
    }

    @Test
    void testUnpackMeasureDTOList() {
        List<Measure> measures = Assembler.unpackMeasureDTOList(measureDTOList);

        assertEquals(2, measures.size());
    }

    @Test
    void testMakeIngredientAmountDTO() {
    }

    @Test
    void testUnpackIngredientAmountDTO() {
    }
}
