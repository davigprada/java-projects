package modelo;

public class Operacion {
    public double num1, num2;
    public char operador;
    public double resultado;

    public Operacion(double num1, double num2, char operador, double resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return num1 + " " + operador + " " + num2 + " = " + resultado;
    }
}