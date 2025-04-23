package vista;

import java.util.Scanner;

public class ProveedorView {
    private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- MENÚ DE PROVEEDORES ---");
        System.out.println("1. Registrar proveedor");
        System.out.println("2. Ver lista de proveedores");
        System.out.println("3. Buscar proveedor por ID");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public String ingresarNombre() {
        System.out.print("Ingrese el nombre del proveedor: ");
        return scanner.next();
    }

    public String ingresarIdentificacion() {
        System.out.print("Ingrese el número de identificación: ");
        return scanner.next();
    }

    public String ingresarServicio() {
        System.out.print("Ingrese el tipo de servicio: ");
        return scanner.next();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
