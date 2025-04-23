package vista;

import controlador.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- SISTEMA MVC ---");
            System.out.println("1. Calculadora Simple");
            System.out.println("2. Control de Acceso");
            System.out.println("3. Control de Aire");
            System.out.println("4. Control de Luces");
            System.out.println("5. Control de Temperatura");
            System.out.println("6. Detección de Intrusos");
            System.out.println("7. Juego FizzBuzz");
            System.out.println("8. Sistema de Reservas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> new ControladorCalculadora().ejecutar();
                case 2 -> new ControladorAcceso().ejecutar();
                case 3 -> new ControladorAire().ejecutar();
                case 4 -> new ControladorLuces().ejecutar();
                case 5 -> new ControladorTemperatura().ejecutar();
                case 6 -> new ControladorIntrusos().ejecutar();
                case 7 -> new ControladorFizzBuzz().ejecutar();
                case 8 -> new ControladorReservas().ejecutar();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 0);
    }
}