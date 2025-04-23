package modelo;

public class ResultadoFizzBuzz {
    public int numero;
    public String resultado;

    public ResultadoFizzBuzz(int numero, String resultado) {
        this.numero = numero;
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return resultado;
    }
}