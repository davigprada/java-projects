import java.util.Scanner;
public class PromedioExamenes {
    public void calcularPromedio(){
        Scanner scanner = new Scanner(System.in);
        double sumaNotas = 0;
        int cantidadNotas = 0;
        double nota;
        String respuesta;

        do {
            System.out.println("Ingrese la nota del examen: ");
            nota = scanner.nextDouble();

            if (nota >=0 && nota <= 10){
                sumaNotas += nota;
                cantidadNotas++;
            }else{
                System.out.println("Nota no válida. Debe estar entre 0 y 10.");
            }

            System.out.print("¿Desea ingresar otra nota? (S/N): ");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("S"));

        if (cantidadNotas > 0) {
            double promedio = sumaNotas / cantidadNotas;
            System.out.printf("📊 Promedio de exámenes: %.2f\n", promedio);
            System.out.println(promedio >= 6 ? "✅ Aprobado" : "❌ Reprobado");
        } else {
            System.out.println("⚠ No se ingresaron notas.");
        }
        scanner.close();
    }
}
