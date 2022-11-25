package ejercicio4.herencia;

import ejercicio4.clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    // 1. Atributos

    boolean medirOxigenoSangre;
    boolean medirSueño;
    boolean medirPulso;
    int numeroEjercicios;
    String sistemaOperativo;
    String autonomia;
    String fabricante;


    // 2. Constructores
    public SmartWatch() {
        super();
    }

    public SmartWatch(String fabricante, String color, int memoriaRAM, int numeroNucleos, int bateria, double almacenamiento, double velocidad, double tamañoPantalla, boolean nfc, boolean medirOxigenoSangre, boolean medirSueño, boolean medirPulso, int numeroEjercicios, String sistemaOperativo, String autonomia, String fabricante1) {
        super(fabricante, color, memoriaRAM, numeroNucleos, bateria, almacenamiento, velocidad, tamañoPantalla, nfc);
        this.medirOxigenoSangre = medirOxigenoSangre;
        this.medirSueño = medirSueño;
        this.medirPulso = medirPulso;
        this.numeroEjercicios = numeroEjercicios;
        this.sistemaOperativo = sistemaOperativo;
        this.autonomia = autonomia;
        this.fabricante = fabricante1;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "medirOxigenoSangre=" + medirOxigenoSangre +
                ", medirSueño=" + medirSueño +
                ", medirPulso=" + medirPulso +
                ", numeroEjercicios=" + numeroEjercicios +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", autonomia='" + autonomia + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}