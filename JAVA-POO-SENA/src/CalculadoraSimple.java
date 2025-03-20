import java.util.Scanner;
class CalculadoraSimple {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();
            System.out.print("Ingrese la operación (+, -, *, /) o 'q' para salir: ");
            char operacion = scanner.next().charAt(0);
            if (operacion == 'q') break;
            double resultado = switch (operacion) {
                case '+' -> num1 + num2;
                case '-' -> num1 - num2;
                case '*' -> num1 * num2;
                case '/' -> num2 != 0 ? num1 / num2 : Double.NaN;
                default -> Double.NaN;
            };
            System.out.println("Resultado: " + resultado);
        }
    }
}
