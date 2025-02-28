import java.sql.SQLOutput;

public class ClaseMath {
    public static void main(String[] args) {
        int a = 3;
        float b = 5.2f;
        double c = 8.5;
        int a2 = 9;
        float b2 = 10.4f;
        double c2 = +17.5;

        //Potencia de un número
        System.out.println(Math.pow(a2,a));

        //Devuelve un entero hacia arriba
        System.out.println(Math.ceil(b));

        //Devuelve un entero hacia abajo
        System.out.println(Math.floor(b));

        //Devuelve el número mayor
        System.out.println(Math.max(c,c2));

        //Devuelve el número menor
        System.out.println(Math.min(c,c2));

        //Devuelve la raíz cuadrada de un número
        System.out.println(Math.sqrt(b2));

        //Area de un circulo
        // Pi * r2
        System.out.println(Math.PI * Math.pow(a,2));

        //Area de una esfera
        // 4*PI*r2
        System.out.println(4*Math.PI*Math.pow(a,2));

        //Volumen de una esfera
        // 4/3*PI*r3
        System.out.println((4/3F)*Math.PI*Math.pow(a,3));
    }
}
