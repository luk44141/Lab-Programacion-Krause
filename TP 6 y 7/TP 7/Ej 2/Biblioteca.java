import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro l) {
        libros.add(l);
    }

    public void listarLibros() {
        for (Libro l : libros) {
            l.mostrar();
        }
    }

    public int cantidadLibros() {
        return libros.size();
    }
}