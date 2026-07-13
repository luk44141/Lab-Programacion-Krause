public class Main {
    public static void main(String[] args) {
        String[][] datos = {
            {"Intensamente 2", "Animación", "100", "ATP", "true"},
            {"Alien: Romulus", "Terror", "119", "+16", "true"},
            {"Deadpool & Wolverine", "Acción", "128", "+16", "true"},
            {"El Conde de Montecristo", "Drama", "178", "+13", "true"},
            {"Longlegs", "Terror", "101", "+18", "false"},
            {"Twisters", "Acción", "122", "+13", "true"},
            {"Cónclave", "Drama", "120", "+13", "true"},
            {"Kung Fu Panda 4", "Animación", "94", "ATP", "false"},
            {"Un Perfecto Desconocido", "Comedia", "107", "+13", "true"},
            {"Smile 2", "Terror", "127", "+18", "true"},
            {"Robot Salvaje", "Animación", "102", "ATP", "true"},
            {"Mufasa", "Animación", "118", "ATP", "false"}
        };

        Cine cine = new Cine();

        for(int i = 0; i < datos.length; i++){

            String titulo = datos[i][0];
            String genero = datos[i][1];
            int duracion = Integer.parseInt(datos[i][2]);
            String clasificacion = datos[i][3];
            boolean enCartelera = Boolean.parseBoolean(datos[i][4]);

            Pelicula pelicula = new Pelicula(titulo, genero, duracion, clasificacion, enCartelera);

            cine.agregarPelicula(pelicula);
        }

        System.out.println("----- PELICULAS EN CARTELERA -----");
        cine.mostrarEnCartelera();

        System.out.println("\n----- PELICULAS FUERA DE CARTELERA -----");
        cine.mostrarFueraDeCartelera();

        System.out.println("\n----- PELICULAS DE TERROR -----");
        cine.buscarPorGenero("Terror");

        System.out.println("\n----- PELICULAS +16 -----");
        cine.buscarPorClasificacion("+16");

        System.out.println("\n----- PELICULA MAS LARGA -----");
        System.out.println(cine.peliculaMasLarga());

        System.out.println("\n----- PELICULA MAS CORTA -----");
        System.out.println(cine.peliculaMasCorta());

        cine.ordenarPorDuracion();
        System.out.println("\n----- PELICULAS ORDENADAS POR DURACION -----");
        cine.mostrarEnCartelera();

        System.out.println("\n----- CANTIDAD POR GENERO -----");
        System.out.println(cine.contarPorGenero());

        System.out.println("\n----- PROMEDIO DE DURACION -----");
        System.out.println(cine.promedioDuracion());

        System.out.println("\n----- TOTAL DE PELICULAS -----");
        System.out.println(cine.totalPeliculas());

        Pelicula nueva = new Pelicula(
                "Avatar 3",
                "Acción",
                160,
                "+13",
                true
        );
        cine.agregarPelicula(nueva);

        System.out.println("\n----- DESPUES DE AGREGAR UNA PELICULA -----");
        System.out.println(cine.totalPeliculas());

        cine.eliminarPelicula("Alien: Romulus");

        System.out.println("\n----- DESPUES DE ELIMINAR ALIEN -----");
        System.out.println(cine.totalPeliculas());
    }
}