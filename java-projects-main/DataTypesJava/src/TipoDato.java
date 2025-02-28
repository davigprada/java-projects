public class TipoDato {
    public static void main(String[] args) {
        //Caracteres
        char letraA = 'a';
        char letraAnumerico = 97;
        System.out.println(letraA); //a
        System.out.println(letraAnumerico); //a

        //Booleanos
        boolean verdadero = true;
        boolean falso = false;


        // Ejemplo con un entero
        int numero = 42;
        System.out.println(numero);
        System.out.println("Tipo de dato de numero: " + obtenerTipoDato(numero));

        // Ejemplo con una constante
        final var PI = 3.141516F;
        System.out.println(PI);
        System.out.println("Tipo de dato de numero: " + obtenerTipoDato(PI));

        // Ejemplo con una cadena
        String texto = "Hola, mundo!";
        System.out.println(texto);
        System.out.println("Tipo de dato de texto: " + obtenerTipoDato(texto));

        // Ejemplo con un objeto
        Object objeto = new Object();
        System.out.println(objeto);
        System.out.println("Tipo de dato de objeto: " + obtenerTipoDato(objeto));
    }

    public static String obtenerTipoDato(Object objeto) {
        return objeto.getClass().getName();
    }
}
