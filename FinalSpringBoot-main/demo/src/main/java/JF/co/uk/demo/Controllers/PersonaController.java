package JF.co.uk.demo.Controllers;

import JF.co.uk.demo.models.Persona;
import JF.co.uk.demo.services.PersonaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    // Endpoint to list all personas
    @GetMapping
    public List<Persona> getAllPersonas() {
        return personaService.findAll();
    }

    // Endpoint to get persona by id
    @GetMapping("/{id}")
    public Optional<Persona> getPersonaById(@PathVariable Long id) {
        return personaService.findById(id);
    }

    // Endpoint to create or update persona
    @PostMapping
    public Persona createOrUpdatePersona(@RequestBody Persona persona) {
        return personaService.save(persona);
    }

    // Endpoint to delete persona by id
    @DeleteMapping("/{id}")
    public String deletePersona(@PathVariable Long id) {
        personaService.deleteById(id);
        return "Persona with ID " + id + " has been deleted.";
    }

    // Endpoint to find persona by cedula
    @GetMapping("/cedula/{cedula}")
    public Persona getPersonaByCedula(@PathVariable String cedula) {
        return personaService.findByCedula(cedula);
    }
}
