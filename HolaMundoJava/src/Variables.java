public class Variables {
    public static void main(String[] args) {

        String greet = "Hello, David!";
        String $farewells = "Bye, David!";
        String _country = "Colombia";


        //No es una convención en Java
        String civil_status = "single";
        String Color = "blue";

        /*
        Naming camelCase
        👉 Upper Camel Case: Inicia con Mayúscula para nombrar clases y interfaces.
        👉 Lower Camel Case: Inicia con minúscula para nombrar variables y métodos.
        👉 Snake Case: Se nombra en mayúsucula y utiliza guión bajo _.
         */

        String secondName = "Gonzalo";
        int maxWeight = 55;

        //CONSTANTES
        final int POSITION = -5;
        final int LIMITE_MAXIMO = 1000;


        System.out.println(greet);
        System.out.println($farewells);
        System.out.println(_country);
        System.out.println(civil_status);
        System.out.println(Color);
        System.out.println(secondName);
        System.out.println(maxWeight);
        System.out.println(POSITION);
        System.out.println(LIMITE_MAXIMO);


        /*
        Declaring an empty String variable
        int speed;
        System.out.println(speed); //java: variable greet might not have been initialized
        */
    }
}
