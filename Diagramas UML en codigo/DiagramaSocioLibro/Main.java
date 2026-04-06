public class Main {
    public static void main(String[] args) {

        Libro l1 = new Libro("111", "Java Básico");
        Libro l2 = new Libro("222", "POO");
        Libro l3 = new Libro("333", "Bases de Datos");
        Libro l4 = new Libro("444", "HTML");
        Libro l5 = new Libro("555", "CSS");

        Socio s1 = new Socio("Luca", 1);
        Socio s2 = new Socio("Ana", 2);
        Socio s3 = new Socio("Pedro", 3);

        s1.agregarLibro(l1);
        s1.agregarLibro(l2);

        s2.agregarLibro(l3);
        s2.agregarLibro(l4);

        s3.agregarLibro(l5);

        Biblioteca biblio = new Biblioteca();
        biblio.agregarSocio(s1);
        biblio.agregarSocio(s2);
        biblio.agregarSocio(s3);

        biblio.mostrarTodo();
    }
}