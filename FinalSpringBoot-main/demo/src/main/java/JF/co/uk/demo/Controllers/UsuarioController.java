package JF.co.uk.demo.Controllers;

import JF.co.uk.demo.models.Usuario;
import JF.co.uk.demo.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    // Endpoint to get all users
    @GetMapping
    public List<Usuario> getAllUsuarios() {
        return usuarioService.getAllUsuarios();  // Calls service to get all users
    }

    // Endpoint to get a user by ID
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable Long id) {
        Optional<Usuario> usuarioOptional = usuarioService.getUsuarioById(id);
        return usuarioOptional.map(ResponseEntity::ok)  // Return 200 OK if user found
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());  // Return 404 if user not found
    }

    // Endpoint to create a new user
    @PostMapping
    public ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
        Usuario createdUsuario = usuarioService.createUsuario(usuario);  // Calls service to create user
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUsuario);  // Return 201 Created
    }

    // Endpoint to update an existing user
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        Usuario updatedUsuario = usuarioService.updateUsuario(id, usuario);
        if (updatedUsuario != null) {
            return ResponseEntity.ok(updatedUsuario);  // Return 200 OK if user updated
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();  // Return 404 if user not found
    }

    // Endpoint to delete a user by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable Long id) {
        usuarioService.deleteUsuario(id);  // Calls service to delete user
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();  // Return 204 No Content
    }
}
