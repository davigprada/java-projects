import java.util.Scanner;
public class VentasRegistradas {
    public void registrarVentas() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("🛍 Ingrese el número de productos vendidos: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        StringBuilder resumenVentas = new StringBuilder();
        double totalVentas = 0;

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.print("\nIngrese el nombre del producto #" + i + ": ");
            String producto = scanner.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese la cantidad vendida: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Consumir nueva línea

            double totalProducto = precio * cantidad;
            totalVentas += totalProducto;

            resumenVentas.append("🛒 ").append(producto).append(" - $").append(precio)
                    .append(" x ").append(cantidad).append(" = $").append(totalProducto).append("\n");
        }

        System.out.println("\n📋 Resumen de Ventas:");
        System.out.println(resumenVentas.length() > 0 ? resumenVentas.toString() : "⚠ No se registraron ventas.");
        System.out.printf("💰 Total de Ventas: $%.2f\n", totalVentas);
        scanner.close();
    }
}

