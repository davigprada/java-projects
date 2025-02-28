public class IMC {
    private double peso;
    private double altura;

    // Constructor
    public IMC(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }
    public double calcularIMC() { // Método para calcular el IMC
        return peso / (altura * altura);
    }
    public String clasificarIMC() {
        double imc = calcularIMC();
        int categoria = (imc < 18.5) ? 1 :
                (imc < 24.9) ? 2 :
                        (imc < 29.9) ? 3 : 4;

        switch (categoria) {
            case 1:
                return "Bajo peso";
            case 2:
                return "Peso normal";
            case 3:
                return "Sobrepeso";
            case 4:
                return "Obesidad";
            default:
                return "Error en la clasificación";
        }
    }
    public void mostrarResultado() {
        System.out.printf("\nSu IMC es: %.2f\n", calcularIMC());
        System.out.println("Clasificación: " + clasificarIMC());
    }
}
