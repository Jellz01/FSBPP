package JF.co.uk.demo.Controllers;


import JF.co.uk.demo.services.UsuarioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class ControllerUsuario {

    private UsuarioService usuarioService;
    public ControllerUsuario(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


}
