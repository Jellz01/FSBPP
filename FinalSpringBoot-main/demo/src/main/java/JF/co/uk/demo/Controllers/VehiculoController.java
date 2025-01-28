package JF.co.uk.demo.Controllers;

import JF.co.uk.demo.models.Vehiculo;
import JF.co.uk.demo.services.VehiculoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {

    private final VehiculoService vehiculoService;

    public VehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    // Endpoint to get all vehicles
    @GetMapping
    public List<Vehiculo> getAllVehiculos() {
        return vehiculoService.findAll();  // Calls service to get all vehicles
    }

    // Endpoint to get a vehicle by ID
    @GetMapping("/{id}")
    public ResponseEntity<Vehiculo> getVehiculoById(@PathVariable Long id) {
        Optional<Vehiculo> vehiculoOptional = vehiculoService.findById(id);
        return vehiculoOptional.map(ResponseEntity::ok)  // Return 200 OK if vehicle found
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());  // Return 404 if vehicle not found
    }

    // Endpoint to create a new vehicle
    @PostMapping
    public ResponseEntity<Vehiculo> createVehiculo(@RequestBody Vehiculo vehiculo) {
        Vehiculo createdVehiculo = vehiculoService.save(vehiculo);  // Calls service to save new vehicle
        return ResponseEntity.status(HttpStatus.CREATED).body(createdVehiculo);  // Return 201 Created
    }

    // Endpoint to update an existing vehicle
    @PutMapping("/{id}")
    public ResponseEntity<Vehiculo> updateVehiculo(@PathVariable Long id, @RequestBody Vehiculo vehiculo) {
        // Check if the vehicle exists
        Optional<Vehiculo> existingVehiculo = vehiculoService.findById(id);
        if (existingVehiculo.isPresent()) {
            vehiculo.setId(id);  // Ensure the ID is set for the update
            Vehiculo updatedVehiculo = vehiculoService.save(vehiculo);
            return ResponseEntity.ok(updatedVehiculo);  // Return 200 OK with updated vehicle
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();  // Return 404 if vehicle not found
    }

    // Endpoint to delete a vehicle by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVehiculo(@PathVariable Long id) {
        Optional<Vehiculo> vehiculo = vehiculoService.findById(id);
        if (vehiculo.isPresent()) {
            vehiculoService.deleteById(id);  // Calls service to delete the vehicle
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();  // Return 204 No Content
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();  // Return 404 if vehicle not found
    }
}
