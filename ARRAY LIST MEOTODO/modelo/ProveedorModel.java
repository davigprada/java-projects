package modelo;

public class ProveedorModel {
    private String nombre;
    private String identificacion;
    private String servicio;

    public ProveedorModel(String nombre, String identificacion, String servicio) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.servicio = servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getServicio() {
        return servicio;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", ID: " + identificacion + ", Servicio: " + servicio;
    }
}
