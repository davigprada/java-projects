import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        //SensorTemperatura
        sensorTemperatura miSensor = new sensorTemperatura(18.0, 25.0);

        System.out.println("Ingrese la temperatura en grados Celsius: ");
        double temperaturaIngresada = scanner.nextDouble();

        miSensor.setTemperatura(temperaturaIngresada);

        System.out.println(miSensor.verificarTemperatura());
    }
}