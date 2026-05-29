public class Jugador {

    private String nombre;
    private String posicion;
    private int edad;
    private String equipo;
    private boolean convocado;

    public Jugador(String nombre, String posicion,
                   int edad, String equipo,
                   boolean convocado) {

        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.equipo = equipo;
        this.convocado = convocado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getEdad() {
        return edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public boolean isConvocado() {
        return convocado;
    }

    @Override
    public String toString() {

        return nombre +
                " | " + posicion +
                " | " + edad +
                " | " + equipo +
                " | Convocado: " + convocado;
    }
}