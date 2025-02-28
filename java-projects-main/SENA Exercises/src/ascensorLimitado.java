public class ascensorLimitado {
    private int pisoActual;
    private int pisoMinimo;
    private int pisoMaximo;
    private double pesoMaximo;

    //Constructor
    public ascensorLimitado(int pisoMinimo, int pisoMaximo, double pesoMaximo){
        this.pisoActual = 1;
        this.pisoMinimo = pisoMinimo;
        this.pisoMaximo = pisoMaximo;
        this.pesoMaximo = pesoMaximo;
    }

    public void irAPiso(int pisoDeseado, double pesoUsuario){
        if(pesoUsuario > pesoMaximo) {
            System.out.println("El ascensor está sobrecargado.");
            return;
        }
        if (pisoDeseado >= pisoMinimo && pisoDeseado <= pisoMaximo){
            System.out.println("Moviendo el ascensor al piso "+ pisoDeseado);
            pisoActual = pisoDeseado;
        }else {
            System.out.println("Error: El piso "+pisoDeseado + "no es válido.");
        }
    }
}
