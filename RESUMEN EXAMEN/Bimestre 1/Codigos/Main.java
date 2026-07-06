public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Luk");
        ContenidoMultimedia p1 = new Pelicula(1, "Batman", 180);
        ContenidoMultimedia p2 = new Pelicula(2, "Metegol", 200);
        ContenidoMultimedia s1 = new Serie(3, "Naruto", 10);

        u1.agregarAFavoritos(p1);
        u1.agregarAFavoritos(p2);
        u1.agregarAFavoritos(s1);

        for(ContenidoMultimedia contenido : u1.getListaFavoritos()) {
            contenido.reproducir();
        }

    }
}
