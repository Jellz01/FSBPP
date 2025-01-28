package JF.co.uk.demo.Controllers;

import JF.co.uk.demo.models.Tarifa;
import JF.co.uk.demo.services.TarifaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarifas")
public class TarifaController {

    private final TarifaService tarifaService;

    public TarifaController(TarifaService tarifaService) {
        this.tarifaService = tarifaService;
    }

    // Endpoint to get all tarifas
    @GetMapping
    public List<Tarifa> getAllTarifas() {
        return tarifaService.findAll();  // Calls service to get all tarifas
    }

    // Endpoint to get a tarifa by ID
    @GetMapping("/{id}")
    public ResponseEntity<Tarifa> getTarifaById(@PathVariable Long id) {
        Optional<Tarifa> tarifaOptional = tarifaService.findById(id);
        return tarifaOptional.map(ResponseEntity::ok)  // Return 200 OK if tarifa found
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());  // Return 404 if tarifa not found
    }

    // Endpoint to create a new tarifa
    @PostMapping
    public ResponseEntity<Tarifa> createTarifa(@RequestBody Tarifa tarifa) {
        Tarifa createdTarifa = tarifaService.save(tarifa);  // Calls service to save new tarifa
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTarifa);  // Return 201 Created
    }

    // Endpoint to update an existing tarifa
    @PutMapping("/{id}")
    public ResponseEntity<Tarifa> updateTarifa(@PathVariable Long id, @RequestBody Tarifa tarifa) {
        // Check if the tarifa exists
        Optional<Tarifa> existingTarifa = tarifaService.findById(id);
        if (existingTarifa.isPresent()) {
            tarifa.setId(id);  // Ensure the ID is set for the update
            Tarifa updatedTarifa = tarifaService.save(tarifa);
            return ResponseEntity.ok(updatedTarifa);  // Return 200 OK with updated tarifa
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();  // Return 404 if tarifa not found
    }

    // Endpoint to delete a tarifa by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTarifa(@PathVariable Long id) {
        Optional<Tarifa> tarifa = tarifaService.findById(id);
        if (tarifa.isPresent()) {
            tarifaService.deleteById(id);  // Calls service to delete the tarifa
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();  // Return 204 No Content
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();  // Return 404 if tarifa not found
    }

    // Endpoint to find tarifas by a specific attribute (e.g., by value)
    @GetMapping("/attribute/{value}")
    public List<Tarifa> getTarifasByAttribute(@PathVariable String value) {
        return tarifaService.findTarifasByAttribute(value);  // Calls custom query method
    }

    // Endpoint to find tarifas using a native SQL query by attribute
    @GetMapping("/native/{value}")
    public List<Tarifa> getTarifasByAttributeNative(@PathVariable String value) {
        return tarifaService.findTarifasByAttributeNative(value);  // Calls native query method
    }
}
