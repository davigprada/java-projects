public class ActualizandoVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //bono $200
        //int bono = 200;
        salary+=200;
        System.out.println("El nuevo salario es de: "+salary);

        //pension $50 descuento
        // int pension = 50;
        salary-=50;
        System.out.println("Se descuenta la pensión del salario: "+salary);

        //2 horas extras $30 c/u
        // int extraHour = 30;
        //comida: $45
        // int comida = 45;
        salary = (salary + 30 * 2) - 45;
        System.out.println("El salario final es: "+salary);


        //Actualizando cadenas de texto
        String employeeName = "David Gelves";
        employeeName = employeeName + " Prada";
        //Utilizamos la función .replace() para añadir "Gonzalo" como segundo nombre
        //employeeName = employeeName.replace(" ", " Gonzalo ") + " Prada";
        System.out.println(employeeName);

    }
}
