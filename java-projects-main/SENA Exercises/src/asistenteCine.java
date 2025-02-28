public class asistenteCine {
    private int edad;
    public asistenteCine(int edad) {
        this.edad = edad;
    }
    public String recomendarPelicula() {
        if (edad < 7) {
            return "Recomendación: Películas animadas y educativas (Ej: 'Toy Story', 'Coco').";
        } else if (edad >= 7 && edad <= 17) {
            return "Recomendación: Aventuras, comedias familiares (Ej: 'Frozen', 'Los Increíbles').";
        } else if (edad >= 18 && edad <= 30) {
            return "Recomendación: Acción, drama, ciencia ficción (Ej: 'Inception', 'John Wick').";
        } else {
            return "Recomendación: Películas clásicas y dramas (Ej: 'El Padrino', 'Forrest Gump').";
        }
    }
}
