import java.util.Scanner;
public class GestorTareas {
    public void gestionarTareas() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder listaTareas = new StringBuilder();
        String respuesta;

        do {
            System.out.print("\nIngrese la descripción de la tarea: ");
            String descripcion = scanner.nextLine();
            System.out.print("Ingrese la fecha de vencimiento (dd/mm/aaaa): ");
            String fecha = scanner.nextLine();

            listaTareas.append("📌 ").append(descripcion).append(" - Fecha: ").append(fecha).append("\n");

            System.out.print("¿Desea agregar otra tarea? (S/N): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));

        System.out.println("\n📝 Lista de Tareas:");
        System.out.println(listaTareas.length() > 0 ? listaTareas.toString() : "⚠ No se ingresaron tareas.");
        scanner.close();
    }
}
