package JF.co.uk.demo.services;

import JF.co.uk.demo.models.Tarifa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface TarifaService {


    // List all tarifas, JpaRepository provides findAll method
    List<Tarifa> findAll();

    // Find tarifa by ID, JpaRepository provides findById method
    Optional<Tarifa> findById(Long id);

    // Delete tarifa by ID, JpaRepository provides deleteById method
    void deleteById(Long id);

    // Update tarifa: JpaRepository's save method supports both insert and update
 //   @Override
     Tarifa  save(Tarifa tarifa);

    // Custom query to list tarifas with a specific attribute (Example)
   // @Query("SELECT t FROM Tarifa t WHERE t.attribute = :value")
    List<Tarifa> findTarifasByAttribute(@Param("value") String value);

    // Example of native SQL query for tarifas
  //  @Query(value = "SELECT * FROM tarifa t WHERE t.attribute = :value", nativeQuery = true)
    List<Tarifa> findTarifasByAttributeNative(@Param("value") String value);
}
