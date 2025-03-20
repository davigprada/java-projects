import java.util.Scanner;
class SistemaReservas {
    private static boolean[] asientos = new boolean[10];
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Sistema de Reservas.");
        while (true) {
            System.out.println("Ingrese el número de asiento (0-9) o -1 para salir: ");
            int asiento = scanner.nextInt();
            if (asiento == -1) break;
            if (asiento < 0 || asiento >= asientos.length) {
                System.out.println("Número de asiento inválido.");
                continue;
            }
            if (!asientos[asiento]) {
                asientos[asiento] = true;
                System.out.println("Asiento reservado exitosamente.");
            } else {
                System.out.println("El asiento ya está ocupado.");
            }
        }
    }
}
