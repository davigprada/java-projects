import java.util.Scanner;
public class TiendaOnline {
    private double totalCompra = 0.0;

    public void agregarProducto(double precio, int cantidad) {
        if (precio <= 0 || cantidad <= 0) {
            System.out.println("⚠ Precio y cantidad deben ser mayores a 0.");
            return;
        }
        double costo = precio * cantidad;
        totalCompra += costo;
        System.out.println("✅ Producto agregado. Costo parcial: $" + totalCompra);
    }

    public void iniciarCompra() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("\nIngrese el precio del producto: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();

            agregarProducto(precio, cantidad);

            System.out.print("¿Desea agregar otro producto? (S/N): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }
        }
        System.out.println("\n💰 Total a pagar: $" + totalCompra);
        scanner.close();
    }
}
