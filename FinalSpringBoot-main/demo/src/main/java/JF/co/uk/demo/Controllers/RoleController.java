package JF.co.uk.demo.Controllers;

import JF.co.uk.demo.services.RoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/role")
public class RoleController {

    private final RoleService roleService;
    public RoleController(RoleService roleService) {

        this.roleService = roleService;
    }

    @GetMapping
    public String roleController() {
        return "roleController";
    }

    @PutMapping
    public String roleControllerUpdate() {
        return "roleControllerUpdate";

    }
}
