package JF.co.uk.demo.daos;

import JF.co.uk.demo.models.ConfigParqueadero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigParqueoDao  extends JpaRepository<ConfigParqueadero,Long> {
}
