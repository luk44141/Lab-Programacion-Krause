public class Libro {

    private String titulo;
    private String isbn;
    private int cantidadPaginas;

    public Libro(String titulo, String isbn, int cantidadPaginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.cantidadPaginas = cantidadPaginas;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void mostrar() {
        System.out.println("Titulo: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Paginas: " + cantidadPaginas);
        System.out.println();
    }
}