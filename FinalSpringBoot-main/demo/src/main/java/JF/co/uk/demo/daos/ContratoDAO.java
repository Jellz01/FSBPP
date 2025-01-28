package JF.co.uk.demo.daos;

import JF.co.uk.demo.models.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ContratoDAO extends JpaRepository<Contrato, Long> {
    // JpaRepository provides built-in methods like findAll(), save(), deleteById(), etc.
}
