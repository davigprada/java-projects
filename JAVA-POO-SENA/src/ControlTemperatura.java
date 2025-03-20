import java.util.Scanner;
class ControlTemperatura {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Ingrese la temperatura actual o -1 para salir: ");
            int temperatura = scanner.nextInt();
            if (temperatura == -1) break;
            if (temperatura < 10) {
                System.out.println("Calefactor activado.");
            } else if (temperatura > 25) {
                System.out.println("Ventilador activado.");
            } else {
                System.out.println("Sistema inactivo.");
            }
        }
    }
}
