package modelo;

public class RegistroTemperatura {
    public int temperatura;
    public String accion;

    public RegistroTemperatura(int temperatura, String accion) {
        this.temperatura = temperatura;
        this.accion = accion;
    }

    @Override
    public String toString() {
        return "Temp: " + temperatura + "°C -> " + accion;
    }
}