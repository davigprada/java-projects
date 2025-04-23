package modelo;

public class Reserva {
    public int numeroAsiento;
    public boolean reservado;

    public Reserva(int numeroAsiento, boolean reservado) {
        this.numeroAsiento = numeroAsiento;
        this.reservado = reservado;
    }

    @Override
    public String toString() {
        return "Asiento " + numeroAsiento + ": " + (reservado ? "Reservado" : "Disponible");
    }
}