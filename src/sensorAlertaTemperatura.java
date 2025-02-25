class sensorAlertaTemperatura {
    private double temperatura;
    private final double UMBRAL_ALERTA;

    // Constructor
    public sensorAlertaTemperatura(double umbralAlerta) {
        this.UMBRAL_ALERTA = umbralAlerta;
    }

    // Método para establecer la temperatura
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    // Método para verificar si la temperatura supera el umbral de alerta
    public String verificarAlerta() {
        if (temperatura > UMBRAL_ALERTA) {
            return "¡ALERTA! La temperatura ha superado el umbral de seguridad.";
        } else {
            return "La temperatura es normal.";
        }
    }
}


