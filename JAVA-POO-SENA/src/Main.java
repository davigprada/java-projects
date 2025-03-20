import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Sistema de Reservas");
            System.out.println("2. Juego FizzBuzz");
            System.out.println("3. Calculadora Simple");
            System.out.println("4. Control de Temperatura en Invernadero");
            System.out.println("5. Detección de Intrusos");
            System.out.println("6. Control de Luces Automático");
            System.out.println("7. Control de Aire Acondicionado");
            System.out.println("8. Control de Acceso a Tienda");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    SistemaReservas.ejecutar();
                    break;
                case 2:
                    JuegoFizzBuzz.ejecutar();
                    break;
                case 3:
                    CalculadoraSimple.ejecutar();
                    break;
                case 4:
                    ControlTemperatura.ejecutar();
                    break;
                case 5:
                    DeteccionIntrusos.ejecutar();
                    break;
                case 6:
                    ControlLuces.ejecutar();
                    break;
                case 7:
                    ControlAire.ejecutar();
                    break;
                case 8:
                    ControlAcceso.ejecutar();
                    break;
                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 9);

        scanner.close();
    }
}
