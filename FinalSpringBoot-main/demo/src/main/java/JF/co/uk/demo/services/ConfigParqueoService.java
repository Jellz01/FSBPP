package JF.co.uk.demo.services;

import JF.co.uk.demo.models.ConfigParqueadero;
import java.util.Optional;

public interface ConfigParqueoService {

    // Obtener la configuración actual del parqueo
    Optional<ConfigParqueadero> obtenerConfiguracion();

    // Actualizar la configuración del parqueo
    ConfigParqueadero actualizarConfiguracion(ConfigParqueadero nuevaConfiguracion);

    // Crear una nueva configuración para el parqueo
    ConfigParqueadero crearConfiguracion(ConfigParqueadero configuracion);

    // Eliminar la configuración del parqueo (si es necesario)
    void eliminarConfiguracion();
}
