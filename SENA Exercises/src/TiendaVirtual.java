import java.util.Scanner;
public class TiendaVirtual {
    public void realizarCompras() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("🛒 Ingrese el número de productos a comprar: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        StringBuilder carrito = new StringBuilder();
        double totalCompra = 0;

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.print("\nIngrese el nombre del producto #" + i + ": ");
            String producto = scanner.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Consumir nueva línea

            carrito.append("🛍 ").append(producto).append(" - $").append(precio).append("\n");
            totalCompra += precio;
        }

        System.out.println("\n🛍 Resumen de Compra:");
        System.out.println(carrito.length() > 0 ? carrito.toString() : "⚠ No se agregó ningún producto.");
        System.out.printf("💰 Total a pagar: $%.2f\n", totalCompra);
        scanner.close();
    }
}
