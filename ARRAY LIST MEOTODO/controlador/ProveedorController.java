package controlador;

import modelo.ProveedorModel;
import vista.ProveedorView;
import java.util.ArrayList;

public class ProveedorController {
    private ArrayList<ProveedorModel> proveedores = new ArrayList<>();
    private ProveedorView vista = new ProveedorView();

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            int opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1 -> registrarProveedor();
                case 2 -> mostrarProveedores();
                case 3 -> buscarProveedor();
                case 4 -> {
                    vista.mostrarMensaje("Saliendo del programa...");
                    salir = true;
                }
                default -> vista.mostrarMensaje("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private void registrarProveedor() {
        String id = vista.ingresarIdentificacion();
        if (buscarProveedorPorID(id) != null) {
            vista.mostrarMensaje("¡El proveedor ya está registrado!");
            return;
        }
        String nombre = vista.ingresarNombre();
        String servicio = vista.ingresarServicio();
        proveedores.add(new ProveedorModel(nombre, id, servicio));
        vista.mostrarMensaje("Proveedor registrado exitosamente.");
    }

    private void mostrarProveedores() {
        if (proveedores.isEmpty()) {
            vista.mostrarMensaje("No hay proveedores registrados.");
        } else {
            vista.mostrarMensaje("--- Lista de Proveedores ---");
            for (ProveedorModel p : proveedores) {
                vista.mostrarMensaje(p.toString());
            }
        }
    }

    private void buscarProveedor() {
        String id = vista.ingresarIdentificacion();
        ProveedorModel proveedor = buscarProveedorPorID(id);
        if (proveedor != null) {
            vista.mostrarMensaje("Proveedor encontrado:\n" + proveedor.toString());
        } else {
            vista.mostrarMensaje("Proveedor no encontrado.");
        }
    }

    private ProveedorModel buscarProveedorPorID(String id) {
        for (ProveedorModel p : proveedores) {
            if (p.getIdentificacion().equals(id)) {
                return p;
            }
        }
        return null;
    }
}
