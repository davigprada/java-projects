import java.util.Scanner;
class ControlAire {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Ingrese la temperatura actual o -1 para salir: ");
            int temperatura = scanner.nextInt();
            if (temperatura == -1) break;
            System.out.print("Ingrese la humedad actual (%): ");
            int humedad = scanner.nextInt();
            if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
                System.out.println("Aire acondicionado encendido.");
            } else {
                System.out.println("Aire acondicionado apagado.");
            }
        }
    }
}