package JF.co.uk.demo.services.imp;

import JF.co.uk.demo.daos.ConfigParqueoDao;
import JF.co.uk.demo.models.ConfigParqueadero;
import JF.co.uk.demo.services.ConfigParqueoService;
import org.springframework.stereotype.Service;

import java.util.Optional;




@Service
public class ConfigParqueoServiceImp implements ConfigParqueoService {


    private final ConfigParqueoDao configParqueoDao;
    public ConfigParqueoServiceImp(ConfigParqueoDao configParqueoDao) {

        this.configParqueoDao = configParqueoDao;
    }

    @Override
    public Optional<ConfigParqueadero> obtenerConfiguracion() {
        return Optional.empty();
    }

    @Override
    public ConfigParqueadero actualizarConfiguracion(ConfigParqueadero nuevaConfiguracion) {
        return null;
    }

    @Override
    public ConfigParqueadero crearConfiguracion(ConfigParqueadero configuracion) {
        return null;
    }

    @Override
    public void eliminarConfiguracion() {

    }
}
