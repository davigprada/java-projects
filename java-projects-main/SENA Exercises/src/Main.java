import java.util.ArrayList;
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
        ascensorLimitado ascensorDos = new ascensorLimitado(1, 10, 250.0);

        System.out.println("Ingrese su peso en KG: ");
        double pesoUsuario = scanner.nextDouble();
        System.out.println("¿A qué piso del 1 al 10 deseas llegar?");
        int pisoDeseadO = scanner.nextInt();
        ascensorDos.irAPiso(pisoDeseadO, pesoUsuario);

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

        //IMC
        double peso = 69.5;
        double altura = 1.89;
        IMC paciente = new IMC(peso, altura);
        paciente.mostrarResultado();

        //Asistente Cine
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        asistenteCine asistente = new asistenteCine(edad);
        System.out.println(asistente.recomendarPelicula());

        //Campeonato Deportivo
        System.out.print("Ingrese el nombre del equipo: ");
        String nombreEquipo = scanner.next();
        Equipo equipo = new Equipo(nombreEquipo);

        String continuar;
        do {
            System.out.print("\nIngrese el resultado del partido (ganado, empatado, perdido): ");
            String resultado = scanner.nextLine();
            equipo.actualizarClasificacion(resultado);
            equipo.mostrarClasificacion();

            System.out.print("\n¿Desea ingresar otro partido? (si/no): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("si"));

        //MENU RESTAURANTE
        ArrayList<menuRestaurante> menu = new ArrayList<>();
        menu.add(new menuRestaurante("Pizza", 20.0));
        menu.add(new menuRestaurante("Hamburguesa", 15.0));
        menu.add(new menuRestaurante("Pasta", 18.0));
        menu.add(new menuRestaurante("Refresco", 5.0));
        menu.add(new menuRestaurante("Café", 3.0));
        menu.add(new menuRestaurante("Jugo Natural", 6.0));
        //Mostrar menú
        System.out.println("🍽 Bienvenido al Restaurante");
        System.out.println("📜 Menú:");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " +  menu.get(i).getNombre()+ " - $" + menu.get(i).getPrecio());
        }

        Orden orden = new Orden();
        String Continuar;
        do {
            System.out.print("\nIngrese el número del producto que desea pedir: ");
            int opcion = scanner.nextInt();
            if (opcion > 0 && opcion <= menu.size()) {
                orden.agregarItem(menu.get(opcion - 1));
                System.out.println(menu.get(opcion - 1).getNombre() + " agregado a su orden.");
            } else {
                System.out.println("⚠ Opción no válida.");
            }

            System.out.print("¿Desea agregar otro producto? (si/no): ");
            Continuar = scanner.next();
        } while (Continuar.equalsIgnoreCase("si"));

        // Mostrar orden antes del pago
        orden.mostrarOrden();
        // Solicitar método de pago
        System.out.print("\nIngrese el método de pago (efectivo, tarjeta, cheque): ");
        String metodoPago = scanner.next();
        // Calcular total con descuento
        double totalFinal = orden.calcularTotalConDescuento(metodoPago);
        System.out.println("\n💰 Total a pagar: $" + totalFinal);

        //CAJERO AUTOMATICO
        cajeroAutomatico cuenta = new cajeroAutomatico(1000.0);
        cuenta.iniciarCajero();

        //COMPRA EN TIENDA ONLINE
        TiendaOnline tienda = new TiendaOnline();
        tienda.iniciarCompra();

        //IMPRESORA
        Impresora impresora = new Impresora(20);
        impresora.iniciarImpresion();

        //VIAJE EN COCHE
        Viaje viaje = new Viaje();
        viaje.calcularTiempoViaje();

        //CUENTA REGRESIVA
        CuentaRegresiva cuenta1 = new CuentaRegresiva();
        cuenta1.iniciarCuenta();

        //JUEGO ADIVINANZA
        JuegoAdivinanza juego = new JuegoAdivinanza();
        juego.jugar();
    }
}