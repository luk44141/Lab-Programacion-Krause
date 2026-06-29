public class Seleccion {

    private String nombre;
    private String continente;
    private int puntos;
    private int jugadoresConvocados;
    private String estadoClasificacion;
    private DirectorTecnico directorTecnico;

    public Seleccion(String nombre, String continente, int puntos,
                     int jugadoresConvocados, String estadoClasificacion,
                     DirectorTecnico directorTecnico) {

        this.nombre = nombre;
        this.continente = continente;
        this.puntos = puntos;

        validarJugadores(jugadoresConvocados);
        this.jugadoresConvocados = jugadoresConvocados;

        this.estadoClasificacion = estadoClasificacion;
        this.directorTecnico = directorTecnico;
    }

    public void validarJugadores(int cantidad) {

        if (cantidad < 1 || cantidad > 26) {
            throw new IllegalArgumentException("La cantidad de jugadores debe estar entre 1 y 26.");
        }

    }

    public void disputarPartido() throws JugadoresInsuficientesException {

        if (jugadoresConvocados < 11) {
            throw new JugadoresInsuficientesException(
                    "La seleccion " + nombre + " no puede disputar el partido porque tiene menos de 11 jugadores."
            );
        }

        System.out.println(nombre + " puede disputar el partido.");
    }

    public String getNombre() {
        return nombre;
    }

    public String getContinente() {
        return continente;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getJugadoresConvocados() {
        return jugadoresConvocados;
    }

    public String getEstadoClasificacion() {
        return estadoClasificacion;
    }

    public DirectorTecnico getDirectorTecnico() {
        return directorTecnico;
    }

    @Override
    public String toString() {

        return "Nombre: " + nombre +
                "\nContinente: " + continente +
                "\nPuntos: " + puntos +
                "\nJugadores: " + jugadoresConvocados +
                "\nEstado: " + estadoClasificacion;

    }

}