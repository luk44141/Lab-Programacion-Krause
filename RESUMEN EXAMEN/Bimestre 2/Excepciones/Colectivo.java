public class Colectivo {
    private String linea;
    private int capacidadMax;
    private int pasajerosActuales;
    private double tarifa;

    public Colectivo(String linea, int capacidadMax, int pasajerosActuales, double tarifa) {
        this.linea = linea;
        this.capacidadMax = capacidadMax;
        this.pasajerosActuales = pasajerosActuales;
        this.tarifa = tarifa;
    }

    public String getLinea() {
        return linea;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setPasajerosActuales(int pasajerosActuales) {
        this.pasajerosActuales = pasajerosActuales;
    }

    @Override
    public String toString() {
        return "Linea: " + linea +
               "\nCapacidad maxima: " + capacidadMax +
               "\nPasajeros: " + pasajerosActuales +
               "\nTarifa: " + tarifa;
    }
}