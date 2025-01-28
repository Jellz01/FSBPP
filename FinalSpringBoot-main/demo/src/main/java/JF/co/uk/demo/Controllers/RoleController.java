package JF.co.uk.demo.Controllers;

import JF.co.uk.demo.services.RoleService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    // Get role information (for simplicity, returning a string representation)
    @GetMapping
    public String getRole() {
        return roleService.toString();  // This will call the toString() method in RoleServiceImpl
    }

    // Update role information (expects a JSON body with id and nombre)
    @PutMapping
    public String updateRole(@RequestBody RoleRequest roleRequest) {
        roleService.setId(roleRequest.getId());
        roleService.setNombre(roleRequest.getNombre());
        return "Role updated: " + roleService.toString();
    }

    // Simple DTO for Role Update Request
    public static class RoleRequest {
        private Long id;
        private String nombre;

        // Getters and Setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
}
