import java.util.Scanner;
public class RegistroVentas {
    public void registrarVentas() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder listaVentas = new StringBuilder();
        double totalVentas = 0;
        String respuesta;

        do {
            System.out.print("\nIngrese el nombre del producto: ");
            String producto = scanner.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Consumir la nueva línea

            if (precio > 0) {
                totalVentas += precio;
                listaVentas.append("🛒 ").append(producto).append(" - $").append(precio).append("\n");
            } else {
                System.out.println("⚠ Precio no válido.");
            }

            System.out.print("¿Desea registrar otra venta? (S/N): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));

        System.out.println("\n📋 Resumen de Ventas:");
        System.out.println(listaVentas.length() > 0 ? listaVentas.toString() : "⚠ No se registraron ventas.");
        System.out.printf("💰 Total de ventas: $%.2f\n", totalVentas);
        scanner.close();
    }
}
