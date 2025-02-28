public class ascensor {
    private int pisoActual;
    private int pisoMinimo = 1;
    private int pisoMaximo = 10;

    //Constructor
    public ascensor(){
        this.pisoActual = 1;
    }

    public void irAPiso(int pisoDeseado){
        if(pisoDeseado >= pisoMinimo && pisoDeseado <= pisoMaximo){
            System.out.println("Moviendo el ascensor al piso "+ pisoDeseado);
            pisoActual = pisoDeseado;
        }else{
            System.out.println("Error: El piso "+pisoDeseado + "no es válido.");
        }

    }
}
