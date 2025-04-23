package modelo;

public class Deteccion {
    public int s1, s2, s3;
    public boolean esDeNoche, alarma;

    public Deteccion(int s1, int s2, int s3, boolean esDeNoche, boolean alarma) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.esDeNoche = esDeNoche;
        this.alarma = alarma;
    }

    @Override
    public String toString() {
        return "Sensores: " + s1 + " " + s2 + " " + s3 + " -> " + (alarma ? "Alarma activada" : "Sistema seguro");
    }
}