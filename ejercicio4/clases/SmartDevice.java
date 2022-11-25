package ejercicio4.clases;

public class SmartDevice {

    // 1. Atributos
    String fabricante;
    String color;
    int memoriaRAM; //GB
    int numeroNucleos; //Ghz
    int bateria; //mAh
    double almacenamiento; //GB
    double velocidad;
    double pantalla; //pulgadas
    boolean nfc;

    // 2. Constructores
    public SmartDevice(){
    }

    public SmartDevice(String fabricante, String color, int memoriaRAM, int numeroNucleos, int bateria, double almacenamiento, double velocidad, double tamañoPantalla, boolean nfc) {
        this.fabricante = fabricante;
        this.color = color;
        this.memoriaRAM = memoriaRAM;
        this.numeroNucleos = numeroNucleos;
        this.bateria = bateria;
        this.almacenamiento = almacenamiento;
        this.velocidad = velocidad;
        this.pantalla = pantalla;
        this.nfc = nfc;
    }

    // 3. Métodos.
}
