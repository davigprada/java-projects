import java.util.Scanner;
public class cajeroAutomatico {
    private double saldo;
    public cajeroAutomatico(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("⚠ Saldo insuficiente. No puede retirar más de $" + saldo);
        } else if (monto <= 0) {
            System.out.println("⚠ Monto inválido. Ingrese un monto mayor a 0.");
        } else {
            saldo -= monto;
            System.out.println("✅ Retiro exitoso. Su nuevo saldo es: $" + saldo);
        }
    }
    public void iniciarCajero() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSaldo disponible: $" + saldo);
            System.out.print("Ingrese el monto a retirar (o 0 para salir): ");
            double monto = scanner.nextDouble();

            if (monto == 0) {
                System.out.println("👋 Gracias por usar el cajero. ¡Hasta pronto!");
                break;
            }
            retirar(monto);
        }
    }
}
