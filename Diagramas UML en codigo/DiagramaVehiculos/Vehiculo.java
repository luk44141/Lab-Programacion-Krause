public abstract class Vehiculo {
    protected String patente;
    protected String modelo;

    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

    public abstract void mostrar();
}