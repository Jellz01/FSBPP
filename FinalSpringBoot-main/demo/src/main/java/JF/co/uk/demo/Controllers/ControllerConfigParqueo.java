package JF.co.uk.demo.Controllers;

import JF.co.uk.demo.services.ConfigParqueoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/configP")
public class ControllerConfigParqueo {

    private final ConfigParqueoService configParqueoService;

    public ControllerConfigParqueo(ConfigParqueoService configParqueoService) {
        this.configParqueoService = configParqueoService;
    }
}
