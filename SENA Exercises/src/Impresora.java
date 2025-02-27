import java.util.Scanner;
public class Impresora {
    private int papelDisponible;

    public Impresora(int hojasIniciales) {
        this.papelDisponible = hojasIniciales;
    }

    public void imprimir(int paginas) {
        if (paginas <= 0) {
            System.out.println("⚠ Número inválido de páginas.");
        } else if (paginas > papelDisponible) {
            System.out.println("⚠ No hay suficiente papel. Disponible: " + papelDisponible + " páginas.");
        } else {
            papelDisponible -= paginas;
            System.out.println("✅ Impresión realizada. Páginas restantes: " + papelDisponible);
        }
    }

    public void iniciarImpresion() {
        Scanner scanner = new Scanner(System.in);
        while (papelDisponible > 0) {
            System.out.print("\nIngrese la cantidad de páginas a imprimir: ");
            int paginas = scanner.nextInt();

            imprimir(paginas);

            if (papelDisponible == 0) {
                System.out.println("⚠ La impresora se ha quedado sin papel.");
                break;
            }
        }
        scanner.close();
    }
}
