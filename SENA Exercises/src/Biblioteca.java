import java.util.Scanner;
public class Biblioteca {
    public void registrarLibros(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder listaLibros = new StringBuilder();
        String respuesta;

        do {
            System.out.print("\nIngrese el título del libro: ");
            String titulo = scanner.nextLine();
            System.out.print("Ingrese el autor del libro: ");
            String autor = scanner.nextLine();
            System.out.print("Ingrese el número de páginas: ");
            int paginas = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            listaLibros.append("📖 ").append(titulo).append(" - ").append(autor)
                    .append(" - ").append(paginas).append(" páginas\n");

            System.out.print("¿Desea registrar otro libro? (S/N): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));

        System.out.println("\n📚 Libros Registrados:");
        System.out.println(listaLibros.length() > 0 ? listaLibros.toString() : "⚠ No se registraron libros.");
        scanner.close();
    }
}
