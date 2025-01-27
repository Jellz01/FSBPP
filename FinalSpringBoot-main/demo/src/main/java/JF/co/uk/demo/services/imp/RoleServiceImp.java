package JF.co.uk.demo.services.imp;

import JF.co.uk.demo.daos.RoleDAO;
import JF.co.uk.demo.services.RoleService;
import org.springframework.stereotype.Service;


@Service
public class RoleServiceImp implements RoleService {

    private final RoleDAO roleDAO;




    public RoleServiceImp(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }


    @Override
    public Long getId() {
        return 0L;
    }

    @Override
    public void setId(Long id) {

    }

    @Override
    public String getNombre() {
        return "";
    }

    @Override
    public void setNombre(String nombre) {

    }
}
