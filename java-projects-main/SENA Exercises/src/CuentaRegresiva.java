import java.util.Scanner;
public class CuentaRegresiva {
    public void iniciarCuenta() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIngrese un número entero positivo para la cuenta regresiva: ");
    int numero = scanner.nextInt();

        while(numero< 0)

    {
        System.out.print("⚠ Ingrese un número válido (positivo): ");
        numero = scanner.nextInt();
    }

        System.out.println("\n📢 Iniciando cuenta regresiva:");
        while(numero >=0)

    {
        System.out.println(numero);
        numero--;
        try {
            Thread.sleep(500); // Pausa de medio segundo para efecto visual
        } catch (InterruptedException e) {
            System.out.println("Error en la pausa");
        }
    }

        System.out.println("🎉 ¡Tiempo cumplido!");
        scanner.close();
    }
}
