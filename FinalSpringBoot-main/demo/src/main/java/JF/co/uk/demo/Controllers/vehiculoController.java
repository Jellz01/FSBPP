package JF.co.uk.demo.Controllers;


import JF.co.uk.demo.services.VehiculoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehiculo")
public class vehiculoController {

    private final VehiculoService vehiculoService;
    public vehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }


}
