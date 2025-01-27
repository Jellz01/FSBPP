package JF.co.uk.demo.services.imp;

import JF.co.uk.demo.daos.UsuarioDAO;
import JF.co.uk.demo.models.Usuario;
import JF.co.uk.demo.services.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UsuarioServiceImp implements UsuarioService {

    private final UsuarioDAO usuarioDAO;

    public UsuarioServiceImp(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }
    @Override
    public Optional<Usuario> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public List<Usuario> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Usuario save(Usuario usuario) {
        return null;
    }
}
