package JF.co.uk.demo.Controllers;

import JF.co.uk.demo.models.Espacio;
import JF.co.uk.demo.services.EspacioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/espacios")
public class EspacioController {

    private final EspacioService espacioService;

    // Constructor for dependency injection
    public EspacioController(EspacioService espacioService) {
        this.espacioService = espacioService;
    }

    // Endpoint to get all available spaces
    @GetMapping("/disponibles")
    public List<Espacio> getEspaciosDisponibles() {
        return espacioService.findEspaciosDisponibles();
    }

    // Optional endpoint to get available spaces using native query (if needed)
    @GetMapping("/disponibles-native")
    public List<Espacio> getEspaciosDisponiblesNative() {
        return espacioService.findEspaciosDisponiblesNative();
    }
}
