package JF.co.uk.demo.services.imp;


import JF.co.uk.demo.daos.VehiculoDAO;
import JF.co.uk.demo.models.Vehiculo;
import JF.co.uk.demo.services.VehiculoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoServiceImp implements VehiculoService {


    private VehiculoDAO vehiculoDAO;

    @Override
    public Optional<Vehiculo> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Vehiculo> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Vehiculo save(Vehiculo vehiculo) {
        return null;
    }
}
