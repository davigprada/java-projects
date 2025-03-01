import java.util.Scanner;
public class Viaje {
    public void calcularTiempoViaje() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nIngrese la distancia total del viaje (km): ");
            double distancia = scanner.nextDouble();
            System.out.print("Ingrese la velocidad promedio del coche (km/h): ");
            double velocidad = scanner.nextDouble();

            if (distancia <= 0 || velocidad <= 0) {
                System.out.println("⚠ La distancia y la velocidad deben ser mayores a 0.");
                continue;
            }

            double tiempo = distancia / velocidad;
            System.out.printf("⏳ Tiempo estimado de viaje: %.2f horas\n", tiempo);

            System.out.print("¿Desea hacer otro viaje? (S/N): ");
            String respuesta = scanner.next();
            if (!respuesta.equalsIgnoreCase("S")) {
                break;
            }
        }
        scanner.close();
        System.out.println("🚗 Fin de la simulación de viajes.");
    }
}