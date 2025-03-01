import java.util.Scanner;
public class AgendaContactos {
    public void registrarContactos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("📖 Ingrese el número de contactos a registrar: ");
        int cantidadContactos = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        StringBuilder agenda = new StringBuilder();

        for (int i = 1; i <= cantidadContactos; i++) {
            System.out.print("\nIngrese el nombre del contacto #" + i + ": ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el número de teléfono: ");
            String telefono = scanner.nextLine();

            agenda.append("📞 ").append(nombre).append(" - ").append(telefono).append("\n");
        }

        System.out.println("\n📜 Agenda de Contactos:");
        System.out.println(agenda.length() > 0 ? agenda.toString() : "⚠ No se registraron contactos.");
        scanner.close();
    }
}
