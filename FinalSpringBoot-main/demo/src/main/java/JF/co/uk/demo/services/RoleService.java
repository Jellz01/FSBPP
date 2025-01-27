package JF.co.uk.demo.services;


import org.springframework.stereotype.Service;



public interface RoleService {

    Long getId();

    void setId(Long id);

    String getNombre();

    void setNombre(String nombre);

    @Override
    String toString();
}
