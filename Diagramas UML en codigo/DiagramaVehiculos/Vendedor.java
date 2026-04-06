import java.util.ArrayList;

public class Vendedor {
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;

    public Vendedor(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public void mostrar() {
        System.out.println("\nVendedor: " + nombre);

        for (Vehiculo v : vehiculos) {
            v.mostrar();
        }
    }
}