public class Pasajero {
    private String nombre;
    private String tipoPase;
    private double saldo;

    public Pasajero(String nombre, String tipoPase, double saldo) {
        this.nombre = nombre;
        this.tipoPase = tipoPase;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPase() {
        return tipoPase;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nTipo de pase: " + tipoPase +
               "\nSaldo: " + saldo;
    }

    public void subirAlColectivo(Colectivo c) {

        if (c.getPasajerosActuales() >= c.getCapacidadMax()) {
            throw new RuntimeException("El colectivo esta lleno");
        }

        if (saldo < c.getTarifa()) {
            throw new RuntimeException("Saldo insuficiente");
        }

        if (tipoPase.equals("estudiante")) {
            if (saldo < c.getTarifa() / 2) {
                throw new RuntimeException("No tiene 50% de saldo suficiente");
            }
            saldo = saldo - (c.getTarifa() / 2);
        } else {
            saldo = saldo - c.getTarifa();
        }

        c.setPasajerosActuales(c.getPasajerosActuales() + 1);
    }
}