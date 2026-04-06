public class Auto extends Vehiculo {

    public Auto(String patente, String modelo) {
        super(patente, modelo);
    }

    public void mostrar() {
        System.out.println("Auto - " + patente + " - " + modelo);
    }
}