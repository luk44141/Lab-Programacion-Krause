public class Main {

    public static void main(String[] args) {

        String[][] datos = {
                {"El Principito", "9789504000044", "3200"},
                {"Matilda", "9788420432885", "4500"},
                {"Harriet, la espía", "9788420401164", "5100"}
        };

        Libro[] libros = new Libro[datos.length];

        for (int i = 0; i < datos.length; i++) {

            String titulo = datos[i][0];
            String isbn = datos[i][1];
            int paginas = Integer.parseInt(datos[i][2]);

            libros[i] = new Libro(titulo, isbn, paginas);
        }

        Biblioteca biblioteca = new Biblioteca();

        for (Libro l : libros) {
            biblioteca.agregarLibro(l);
        }

        biblioteca.listarLibros();

        System.out.println("Cantidad: " + biblioteca.cantidadLibros());

        System.out.println("Paginas del indice 1: "
                + libros[1].getCantidadPaginas());
    }
}