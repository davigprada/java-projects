public class Operadores {
    public static void main(String[] args) {
        //Operadores de asignación
        int x = 5;
        x*=2;
        System.out.println("Se multiplica el valor de x: " +x); //10

        int y = 5;
        y-=1;
        System.out.println("Se resta el valor de y: " +y);//4


        //Operadores de decremento e incremento
        int lives = 5;

        lives--; //Decremento
        System.out.println(lives);//4

        lives++; //Incremento
        System.out.println(lives);//5
    }
}
