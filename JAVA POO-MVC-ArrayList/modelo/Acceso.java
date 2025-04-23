package modelo;

public class Acceso {
    public boolean tieneMembresia, esEmpleado, horarioAtencion;

    public Acceso(boolean tieneMembresia, boolean esEmpleado, boolean horarioAtencion) {
        this.tieneMembresia = tieneMembresia;
        this.esEmpleado = esEmpleado;
        this.horarioAtencion = horarioAtencion;
    }
}