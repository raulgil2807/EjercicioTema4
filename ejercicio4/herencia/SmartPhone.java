package ejercicio4.herencia;

import ejercicio4.clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    // 1. Atributos

    String tipoWifi; // 2.5Ghz, 5Ghz o 6Ghz
    String sistemaOperativo; // iOS o Android
    String tipoCobertura; // 4G o 5G
    boolean conexionAuriculares;

    // 2. Constructores.
    public SmartPhone() {
        super();
    }

    public SmartPhone(String fabricante, String color, int memoriaRAM, int numeroNucleos, int bateria, double almacenamiento, double velocidad, double tamañoPantalla, boolean nfc, String tipoWifi, String sistemaOperativo, String tipoCobertura, boolean conexionAuriculares) {
        super(fabricante, color, memoriaRAM, numeroNucleos, bateria, almacenamiento, velocidad, tamañoPantalla, nfc);
        this.tipoWifi = tipoWifi;
        this.sistemaOperativo = sistemaOperativo;
        this.tipoCobertura = tipoCobertura;
        this.conexionAuriculares = conexionAuriculares;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "tipoWifi='" + tipoWifi + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", tipoCobertura='" + tipoCobertura + '\'' +
                ", conexionAuriculares=" + conexionAuriculares +
                '}';
    }
}
    // 3. Métodos






