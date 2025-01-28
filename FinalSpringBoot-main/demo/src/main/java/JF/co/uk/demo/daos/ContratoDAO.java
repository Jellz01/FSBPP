package JF.co.uk.demo.daos;

import JF.co.uk.demo.models.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ContratoDAO extends JpaRepository<Contrato, Long> {

    @Query("SELECT c FROM Contrato c")  // Custom query to select all records from Contrato
    List<Contrato> findAllContratos();
    // JpaRepository provides built-in methods like findAll(), save(), deleteById(), etc.
}
