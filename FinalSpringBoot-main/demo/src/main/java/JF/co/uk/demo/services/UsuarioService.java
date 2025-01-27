package JF.co.uk.demo.services;

import JF.co.uk.demo.models.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



public interface UsuarioService {


    // Custom query to find a user by email
    Optional<Usuario> findByEmail(String email);

    // Listing all users
    List<Usuario> findAll();

    // Delete user by ID, JpaRepository provides deleteById
    void deleteById(Long id);

    // Update user: Spring Data JPA supports save() for both insert and update

    Usuario  save(Usuario usuario);
}
