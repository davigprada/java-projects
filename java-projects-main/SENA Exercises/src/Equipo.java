public class Equipo {
    private String nombre;
    private int puntos;
    private int partidosJugados;
    private int ganados;
    private int empatados;
    private int perdidos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
        this.partidosJugados = 0;
        this.ganados = 0;
        this.empatados = 0;
        this.perdidos = 0;
    }
    public void actualizarClasificacion(String resultado) {
        partidosJugados++;
        switch (resultado.toLowerCase()) {
            case "ganado":
                ganados++;
                puntos += 3;
                break;
            case "empatado":
                empatados++;
                puntos += 1;
                break;
            case "perdido":
                perdidos++;
                break;
            default:
                System.out.println("Resultado no válido. Use: ganado, empatado o perdido.");
                partidosJugados--; // No cuenta un partido inválido
                break;
        }
    }
    public void mostrarClasificacion() {
        System.out.println("\n📊 Clasificación de " + nombre + ":");
        System.out.println("Partidos jugados: " + partidosJugados);
        System.out.println("Ganados: " + ganados);
        System.out.println("Empatados: " + empatados);
        System.out.println("Perdidos: " + perdidos);
        System.out.println("Puntos: " + puntos);
    }
}
