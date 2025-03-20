import java.util.Scanner;
class DeteccionIntrusos {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Es de noche? (true/false): ");
        boolean esDeNoche = scanner.nextBoolean();
        while (true) {
            System.out.print("Ingrese detección de los 3 sensores (1 o 0) separados por espacio: ");
            int s1 = scanner.nextInt(), s2 = scanner.nextInt(), s3 = scanner.nextInt();
            int detectados = s1 + s2 + s3;
            if (detectados >= 2 && esDeNoche) {
                System.out.println("Alarma activada.");
            } else {
                System.out.println("Sistema seguro.");
            }
        }
    }
}
