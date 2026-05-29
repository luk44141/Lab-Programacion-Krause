public class Estudiante {

    private String nombre;
    private String dni;
    private double promedio;

    // Constructor
    public Estudiante(String nombre, String dni, double promedio) {
        this.nombre = nombre;
        this.dni = dni;
        this.promedio = promedio;
    }

    // Getter nombre
    public String getNombre() {
        return nombre;
    }

    // Getter promedio
    public double getPromedio() {
        return promedio;
    }

    // Mostrar ficha
    public void mostrarFicha() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Promedio: " + promedio);
        System.out.println("-------------------");
    }
}