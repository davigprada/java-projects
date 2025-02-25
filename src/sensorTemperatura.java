public class sensorTemperatura {
    private double temperatura;
    private final double TEMPERATURA_MINIMA;
    private final double TEMPERATURA_MAXIMA;

    public sensorTemperatura(double temperaturaMinima, double temperaturaMaxima) {
        this.TEMPERATURA_MINIMA = temperaturaMinima;
        this.TEMPERATURA_MAXIMA = temperaturaMaxima;
    }

    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }

    public String verificarTemperatura(){
        if (temperatura >= TEMPERATURA_MINIMA && temperatura <= TEMPERATURA_MAXIMA){
            return "La temperatura adecuada es: "+temperatura;
        } else{
            return  "La temperatura está fuera del rango deseado";
        }
    }
}
