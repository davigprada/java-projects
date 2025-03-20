import java.util.Scanner;
class ControlLuces {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Es de noche? (true/false): ");
        boolean esDeNoche = scanner.nextBoolean();
        System.out.print("¿Hay movimiento en la habitación? (true/false): ");
        boolean hayMovimiento = scanner.nextBoolean();
        if (esDeNoche && hayMovimiento) {
            System.out.println("Luces encendidas.");
        } else {
            System.out.println("Luces apagadas.");
        }
    }
}

