import java.util.Scanner;
class ControlAcceso {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Tiene membresía? (true/false): ");
        boolean tieneMembresia = scanner.nextBoolean();
        System.out.print("¿Es empleado? (true/false): ");
        boolean esEmpleado = scanner.nextBoolean();
        System.out.print("¿Está dentro del horario de atención? (true/false): ");
        boolean horarioAtencion = scanner.nextBoolean();
        if ((tieneMembresia && horarioAtencion) || esEmpleado) {
            System.out.println("Acceso permitido.");
        } else {
            System.out.println("Acceso denegado.");
        }
    }
}
