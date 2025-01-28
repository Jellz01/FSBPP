package JF.co.uk.demo.services.imp;

import JF.co.uk.demo.daos.UsuarioDAO;
import JF.co.uk.demo.models.Usuario;

import JF.co.uk.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioDAO usuarioDAO;

    @Autowired
    public UsuarioServiceImpl(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return usuarioDAO.findAll();  // Retrieves all users from the database
    }

    @Override
    public Optional<Usuario> getUsuarioById(Long id) {
        return usuarioDAO.findById(id);  // Returns an Optional<Usuario> directly
    }

    @Override
    public Usuario createUsuario(Usuario usuario) {
        return usuarioDAO.save(usuario);  // Saves new user to the database
    }

    @Override
    public Usuario updateUsuario(Long id, Usuario usuario) {
        if (usuarioDAO.existsById(id)) {
            usuario.setId(id);  // Ensure that the ID is set before updating
            return usuarioDAO.save(usuario);  // Updates user information in the database
        }
        return null;  // Or throw an exception if user is not found
    }

    @Override
    public void deleteUsuario(Long id) {
        usuarioDAO.deleteById(id);  // Deletes user by ID from the database
    }
}
