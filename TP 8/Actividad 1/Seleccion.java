public class Seleccion {
    private String nombre;
    private String continente;
    private int puntos;
    private int cantidadJugadores;
    private String estadoClasificacion; 
    private String directorTecnico;

public Seleccion (String nombre, String continente, int puntos, int cantidadJugadores, String estadoClasificacion, String directorTecnico) {
    this.nombre = nombre;
    this.continente = continente;
    this.puntos = puntos;
    this.cantidadJugadores = cantidadJugadores;
    this.estadoClasificacion = estadoClasificacion;
    this.directorTecnico = directorTecnico;
}

public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getContinente() {
    return continente;
}
public void setContinente(String continente) {
    this.continente = continente;
}
public int getPuntos() {
    return puntos;
}
public void setPuntos(int puntos) {
    this.puntos = puntos;
}
public int getCantidadJugadores() {
    return cantidadJugadores;
}
public void setCantidadJugadores(int cantidadJugadores) {
    this.cantidadJugadores = cantidadJugadores;
}
public String getEstadoClasificacion() {
    return estadoClasificacion;
}
public void setEstadoClasificacion(String estadoClasificacion) {
    this.estadoClasificacion = estadoClasificacion;
}
public String getDirectorTecnico() {
    return directorTecnico;
}
public void setDirectorTecnico(String directorTecnico) {
    this.directorTecnico = directorTecnico;
}

@Override
public String toString() {
    return "Nombre: " + nombre +
    " continente: " + continente + 
    " puntos: " + puntos + 
    " cantidad de jugadores: " + cantidadJugadores + 
    " estado de clasificacion: " + estadoClasificacion + 
    " director tecnico: " + directorTecnico;
}

public void ValidarCantidadJugadores() throws Excepcion {
    if (cantidadJugadores < 1 || cantidadJugadores > 26) {
        throw new Excepcion ("La cantidad de jugadores es incorrecta");
    }
}

public void disputarPartido() throws JugadoresInsuficientesException {
    if (cantidadJugadores < 11) {
        throw new JugadoresInsuficientesException("La cantidad de jugadores es insuficiente");
    }
    System.out.println("El partido se ha disputado correctamente");
}