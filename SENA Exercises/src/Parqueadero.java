import java.util.Scanner;
public class Parqueadero {
    public void registrarVehiculos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("🚗 Ingrese el número de vehículos a registrar: ");
        int cantidadVehiculos = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        StringBuilder listaVehiculos = new StringBuilder();

        for (int i = 1; i <= cantidadVehiculos; i++) {
            System.out.print("\nIngrese la placa del vehículo #" + i + ": ");
            String placa = scanner.nextLine();
            System.out.print("Ingrese la hora de ingreso (hh:mm): ");
            String horaIngreso = scanner.nextLine();

            listaVehiculos.append("🚘 Placa: ").append(placa).append(" - Hora de ingreso: ").append(horaIngreso).append("\n");
        }

        System.out.println("\n📋 Registro de Vehículos:");
        System.out.println(listaVehiculos.length() > 0 ? listaVehiculos.toString() : "⚠ No se registraron vehículos.");
        scanner.close();
    }
}
