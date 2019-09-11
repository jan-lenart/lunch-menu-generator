package lenart.jan.menugenerator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class IngredientAmount {
    @Id
    Long id;
    BigDecimal amount;
    @OneToOne
    Measure measure;
    @OneToOne
    Ingredient ingredient;
}
