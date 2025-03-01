import java.util.Scanner;
public class SumaNumeros {
    public void calcularSuma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("🔢 Ingrese la cantidad de números a sumar: ");
        int cantidadNumeros = scanner.nextInt();

        int suma = 0;
        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número #" + i + ": ");
            while (!scanner.hasNextInt()) {
                System.out.print("⚠ Ingrese un número válido: ");
                scanner.next();
            }
            suma += scanner.nextInt();
        }

        System.out.println("\n🧮 La suma total es: " + suma);
        scanner.close();
    }
}
