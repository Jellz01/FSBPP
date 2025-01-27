package JF.co.uk.demo.daos;

import JF.co.uk.demo.models.Tarifa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TarifaDAO extends JpaRepository<Tarifa, Long> {

}
