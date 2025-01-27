package JF.co.uk.demo.services;

import JF.co.uk.demo.models.Vehiculo;

import java.util.List;
import java.util.Optional;

public interface VehiculoService {


    // Custom query to find a vehicle by its ID (JpaRepository provides findById method)
    Optional<Vehiculo> findById(Long id);

    // List all vehicles, JpaRepository provides findAll method
    List<Vehiculo> findAll();

    // Delete vehicle by ID, JpaRepository provides deleteById method
    void deleteById(Long id);

    // Update vehicle: JpaRepository's save method supports both insert and update
     Vehiculo save(Vehiculo vehiculo);
}
