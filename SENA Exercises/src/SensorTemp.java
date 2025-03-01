import java.util.Scanner;
public class SensorTemp {
    public void verificarTemperatura() {
        Scanner scanner = new Scanner(System.in);
        int temperatura;

        do {
            System.out.print("🌡 Ingrese la temperatura actual (°C): ");
            temperatura = scanner.nextInt();

            if (temperatura < 18) {
                System.out.println("⚠ Alerta: La temperatura es demasiado baja.");
            } else if (temperatura > 25) {
                System.out.println("⚠ Alerta: La temperatura es demasiado alta.");
            } else {
                System.out.println("✅ Temperatura dentro del rango aceptable.");
            }

        } while (temperatura < 18 || temperatura > 25);

        scanner.close();
    }
}
