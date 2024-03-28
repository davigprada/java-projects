public class Casting {
    public static void main(String[] args) {
/*
        //Cast implicito
        int entero = 42;
        double decimal = entero; // Cast implícito de int a double
        System.out.println(decimal);

        char caracter = 'A';
        int valorNumerico = caracter;
        System.out.println(valorNumerico);

        byte byteValor = 100;
        int intValor = byteValor; // Cast implícito de byte a int
        System.out.println(intValor); // Imprimirá 100 como int

*/
        //Cast Explicito
        double decimales = 42.56;
        int enteros = (int) decimales; // Cast explícito de double a int
        System.out.println(enteros);

        long numeroLargo = 1234567890123L;
        int entero = (int) numeroLargo; // Cast explícito de long a int
        System.out.println(entero); /* Imprimirá una parte del número,
                                       posiblemente con pérdida de información */
        
    }
}
