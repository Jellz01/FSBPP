package JF.co.uk.demo.models;

public class ConfigParqueadero {

    private int numeroDeParqueos;
    private double tarifaPorHora;
    private double tarifaPorDia;
    private double tarifaPorMes;

    // Default constructor
    public ConfigParqueadero() {
    }

    // Constructor with all fields
    public ConfigParqueadero(int numeroDeParqueos, double tarifaPorHora, double tarifaPorDia, double tarifaPorMes) {
        this.numeroDeParqueos = numeroDeParqueos;
        this.tarifaPorHora = tarifaPorHora;
        this.tarifaPorDia = tarifaPorDia;
        this.tarifaPorMes = tarifaPorMes;
    }

    // Getters and setters
    public int getNumeroDeParqueos() {
        return numeroDeParqueos;
    }

    public void setNumeroDeParqueos(int numeroDeParqueos) {
        this.numeroDeParqueos = numeroDeParqueos;
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    public double getTarifaPorDia() {
        return tarifaPorDia;
    }

    public void setTarifaPorDia(double tarifaPorDia) {
        this.tarifaPorDia = tarifaPorDia;
    }

    public double getTarifaPorMes() {
        return tarifaPorMes;
    }

    public void setTarifaPorMes(double tarifaPorMes) {
        this.tarifaPorMes = tarifaPorMes;
    }

    // Method to update parking configuration
    public void actualizarConfiguracion(int numeroDeParqueos, double tarifaPorHora, double tarifaPorDia, double tarifaPorMes) {
        this.numeroDeParqueos = numeroDeParqueos;
        this.tarifaPorHora = tarifaPorHora;
        this.tarifaPorDia = tarifaPorDia;
        this.tarifaPorMes = tarifaPorMes;
    }

    @Override
    public String toString() {
        return "ConfigParqueadero{" +
                "numeroDeParqueos=" + numeroDeParqueos +
                ", tarifaPorHora=" + tarifaPorHora +
                ", tarifaPorDia=" + tarifaPorDia +
                ", tarifaPorMes=" + tarifaPorMes +
                '}';
    }
}
