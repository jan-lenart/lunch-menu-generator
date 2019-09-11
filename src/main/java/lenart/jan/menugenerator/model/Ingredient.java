package lenart.jan.menugenerator.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ingredient {
    @Id
    Long id;
    String name;
    @OneToOne
    Measure baseMeasure;
    @OneToOne
    IngredientType type;
}
