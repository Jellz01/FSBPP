package JF.co.uk.demo.services;

import JF.co.uk.demo.models.Usuario;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    // Method to get all users
    List<Usuario> getAllUsuarios();

    // Method to get a user by ID, returning Optional<Usuario>
    Optional<Usuario> getUsuarioById(Long id);

    // Method to create a new user
    Usuario createUsuario(Usuario usuario);

    // Method to update an existing user
    Usuario updateUsuario(Long id, Usuario usuario);

    // Method to delete a user by ID
    void deleteUsuario(Long id);
}
