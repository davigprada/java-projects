import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    private int numeroSecreto;
    private int intentos;

    public JuegoAdivinanza() {
        Random random = new Random();
        this.numeroSecreto = random.nextInt(100) + 1; // Número entre 1 y 100
        this.intentos = 0;
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        int intentoUsuario = -1;

        System.out.println("\n🎯 ¡Bienvenido al juego de adivinanza!");
        System.out.println("Adivina un número entre 1 y 100.");

        while (intentoUsuario != numeroSecreto) {
            System.out.print("Ingrese su número: ");
            intentoUsuario = scanner.nextInt();
            intentos++;

            if (intentoUsuario < numeroSecreto) {
                System.out.println("📈 El número es mayor.");
            } else if (intentoUsuario > numeroSecreto) {
                System.out.println("📉 El número es menor.");
            }
        }

        System.out.println("\n🎊 ¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
        scanner.close();
    }
}