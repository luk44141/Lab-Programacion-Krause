public class Moto extends Vehiculo {

    public Moto(String patente, String modelo) {
        super(patente, modelo);
    }

    public void mostrar() {
        System.out.println("Moto - " + patente + " - " + modelo);
    }
}