package lenart.jan.menugenerator.repositories;

import lenart.jan.menugenerator.model.Measure;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MeasureRepository extends JpaRepository<Measure, Long> {

}
