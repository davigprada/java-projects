import java.util.Scanner;
public class MenuComidaRapida {
    public void realizarPedido() {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        String respuesta;
        StringBuilder pedido = new StringBuilder();

        do {
            System.out.println("\n🍔 Menú de Comida Rápida:");
            System.out.println("1. Hamburguesa - $15.000");
            System.out.println("2. Perro Caliente - $10.000");
            System.out.println("3. Papas Fritas - $8.000");
            System.out.println("4. Gaseosa - $5.000");
            System.out.print("Seleccione una opción (1-4): ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    pedido.append("🍔 Hamburguesa - $15.000\n");
                    total += 15000;
                    break;
                case 2:
                    pedido.append("🌭 Perro Caliente - $10.000\n");
                    total += 10000;
                    break;
                case 3:
                    pedido.append("🍟 Papas Fritas - $8.000\n");
                    total += 8000;
                    break;
                case 4:
                    pedido.append("🥤 Gaseosa - $5.000\n");
                    total += 5000;
                    break;
                default:
                    System.out.println("⚠ Opción no válida.");
            }

            System.out.print("¿Desea agregar otro producto? (S/N): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("S"));

        System.out.println("\n🛒 Resumen del Pedido:");
        System.out.println(pedido.length() > 0 ? pedido.toString() : "⚠ No se realizó ningún pedido.");
        System.out.printf("💰 Total a pagar: $%.2f\n", total);
        System.out.println("🍽 ¡Gracias por su compra!");
        scanner.close();
    }
}
