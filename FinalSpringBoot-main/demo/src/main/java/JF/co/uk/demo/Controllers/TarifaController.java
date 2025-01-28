package JF.co.uk.demo.Controllers;


import JF.co.uk.demo.services.TarifaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarifas")
public class TarifaController {

    private final TarifaService tarifaService;
    public TarifaController(TarifaService tarifaService) {
        this.tarifaService = tarifaService;
    }
}
