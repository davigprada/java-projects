import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ejercicio Factura
        // Crear un objeto Factura con valores de ejemplo
        Factura factura = new Factura("Juan Pérez", "Laptop", 2, 750.00, true, 'A');
        factura.mostrarFactura();

        //Ejercicio del Ascensor
        ascensor ascensorUno = new ascensor();
        System.out.println("¿A qué piso del 1 al 10 deseas llegar?");
        int pisoDeseado = scanner.nextInt();
        ascensorUno.irAPiso(pisoDeseado);

        //Ejercicio del Ascensor con Peso Limitado
        ascensorLimitado ascensorDos = new ascensorLimitado(1,10,250.0);

        System.out.println("Ingrese su peso en KG: ");
        double pesoUsuario = scanner.nextDouble();
        System.out.println("¿A qué piso del 1 al 10 deseas llegar?");
        int pisoDeseadO = scanner.nextInt();
        ascensorDos.irAPiso(pisoDeseadO,pesoUsuario);

        //Sensor Temperatura
        sensorTemperatura miSensor = new sensorTemperatura(18.0, 25.0);

        System.out.println("Ingrese la temperatura en grados Celsius: ");
        double temperaturaIngresada = scanner.nextDouble();

        miSensor.setTemperatura(temperaturaIngresada);
        System.out.println(miSensor.verificarTemperatura());

        //Sensor Alerta Temperatura
        sensorAlertaTemperatura sensor = new sensorAlertaTemperatura(30.0); // Umbral de alerta a 30°C
        System.out.print("Ingrese la temperatura actual en grados Celsius: ");
        double inputTemp = scanner.nextDouble();
        sensor.setTemperatura(inputTemp);
        System.out.println(sensor.verificarAlerta());

        //Switch Case Tienda
        // Solicitar tipo de producto
        System.out.print("Ingrese el tipo de producto (A - Alimentos, V - Vestimenta, E - Electrónicos): ");
        char tipoProducto = scanner.next().charAt(0);

        // Validar tipo de producto
        if (tipoProducto != 'A' && tipoProducto != 'V' && tipoProducto != 'E') {
            System.out.println("Error: Tipo de producto inválido.");
            return;
        }
        System.out.print("Ingrese la cantidad de unidades: ");
        int cantidad = scanner.nextInt();

        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor a 0.");
            return;
        }
        Producto producto = new Producto(tipoProducto, cantidad);
        System.out.println("\n===== FACTURA =====");
        producto.mostrarFactura();

        //Asistente Virtual
    }
}