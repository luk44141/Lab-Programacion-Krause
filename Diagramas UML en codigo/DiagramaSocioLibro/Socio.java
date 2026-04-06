import java.util.ArrayList;

public class Socio {
    private String nombre;
    private int nroSocio;
    private ArrayList<Libro> libros;

    public Socio(String nombre, int nroSocio) {
        this.nombre = nombre;
        this.nroSocio = nroSocio;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        if (libros.size() < 3) {
            libros.add(libro);
        } else {
            System.out.println(nombre + " no puede tener más de 3 libros");
        }
    }

    public void mostrarSocio() {
        System.out.println("\nSocio: " + nombre + " | Nro: " + nroSocio);
        System.out.println("Libros:");

        for (Libro l : libros) {
            l.mostrar();
        }
    }
}