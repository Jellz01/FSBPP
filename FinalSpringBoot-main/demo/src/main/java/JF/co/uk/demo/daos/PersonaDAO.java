package JF.co.uk.demo.daos;

import JF.co.uk.demo.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonaDAO extends JpaRepository<Persona, Long> {

}
