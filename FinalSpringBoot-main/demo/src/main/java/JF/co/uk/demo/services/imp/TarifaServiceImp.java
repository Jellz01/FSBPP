package JF.co.uk.demo.services.imp;

import JF.co.uk.demo.daos.TarifaDAO;
import JF.co.uk.demo.models.Tarifa;
import JF.co.uk.demo.services.TarifaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TarifaServiceImp implements TarifaService {

    private final TarifaDAO tarifaDAO;

    public TarifaServiceImp(TarifaDAO tarifaDAO) {
        this.tarifaDAO = tarifaDAO;
    }


    @Override
    public List<Tarifa> findAll() {
        return List.of();
    }

    @Override
    public Optional<Tarifa> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Tarifa save(Tarifa tarifa) {
        return null;
    }

    @Override
    public List<Tarifa> findTarifasByAttribute(String value) {
        return List.of();
    }

    @Override
    public List<Tarifa> findTarifasByAttributeNative(String value) {
        return List.of();
    }
}
