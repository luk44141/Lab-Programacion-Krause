public class Pelicula {
    private String titulo;
    private String genero;
    private int duracionMinutos;
    private String clasificacion;
    private boolean enCartelera;

public Pelicula (String titulo, String genero, int duracionMinutos, String clasificacion, boolean enCartelera) {
    this.titulo=titulo;
    this.genero=genero;
    this.duracionMinutos=duracionMinutos;
    this.clasificacion=clasificacion;
    this.enCartelera=enCartelera;
}
public String getTitulo(){
    return titulo;
}
public String getGenero(){
    return genero;
}
public int getDuracionMinutos(){
    return duracionMinutos;
}
public String getClasificacion(){
    return clasificacion;
}
public boolean getEnCartelera(){
    return enCartelera;
}
public void setTitulo(String titulo){
    this.titulo=titulo;
}
public void setGenero(String genero){
    this.genero=genero;
}
public void setDuracionMinutos(int duracionMinutos){
    this.duracionMinutos=duracionMinutos;
}
public void setClasificacion(String clasificacion){
    this.clasificacion=clasificacion;
}
public void setEnCartelera(boolean enCartelera){
    this.enCartelera=enCartelera;
}

@Override
public String toString(){
    return "Titulo: " + titulo +
    "\nGenero: " + genero +
    "\nDuracion: " + duracionMinutos +
    "\nClasificacion: " + clasificacion +
    "\nEsta en cartelera?: " + enCartelera;
}
}