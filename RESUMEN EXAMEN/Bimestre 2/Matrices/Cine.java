import java.util.ArrayList;
import java.util.Collections;

public class Cine {
    private ArrayList<Pelicula> peliculas;

    public Cine(){
        peliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula p){
        peliculas.add(p);
    }
    public void mostrarEnCartelera(){
        for(Pelicula p : peliculas){
            if(p.getEnCartelera()){
                System.out.println(p);
            }
        }
    }
    public void mostrarFueraDeCartelera(){
        for(Pelicula p : peliculas){
            if(!p.getEnCartelera()){
                System.out.println(p);
            }
        }
    }
    public void buscarPorGenero(String genero){
        for(Pelicula p : peliculas){
            if(p.getGenero().equalsIgnoreCase(genero)){
                System.out.println(p);
            }
        }
    }
    public void eliminarPelicula(String titulo){
    for(int i = 0; i < peliculas.size(); i++){
        if(peliculas.get(i).getTitulo().equalsIgnoreCase(titulo)){
            peliculas.remove(i);
            break;
            }
        }
    }
    public int totalPeliculas(){
    return peliculas.size();
    }
    public Pelicula peliculaMasLarga(){
        Pelicula masLarga= peliculas.get(0);
        for(Pelicula p : peliculas){
            if(p.getDuracionMinutos() > masLarga.getDuracionMinutos()) {
                masLarga = p;
            }
        }
        return masLarga;
    }  
    public Pelicula peliculaMasCorta(){
        Pelicula masCorta= peliculas.get(0);
        for(Pelicula p : peliculas) {
            if(p.getDuracionMinutos() < masCorta.getDuracionMinutos()){
                masCorta = p;
            }
        }
        return masCorta;
    }
    public void buscarPorClasificacion(String clasificacion){
        for(Pelicula p : peliculas) {
        if(p.getClasificacion().equalsIgnoreCase(clasificacion)){
            System.out.println(p);
            }
        }
    }
    public double promedioDuracion(){
        int suma = 0;
        for (Pelicula p : peliculas){
            suma = suma + p.getDuracionMinutos();
        }
        return (double ) suma/ peliculas.size();
    }
    public String contarPorGenero(){
        int drama = 0;
        int comedia = 0;
        int terror = 0;
        int accion = 0;
        int animacion = 0;
        for(Pelicula p : peliculas){
            if(p.getGenero().equalsIgnoreCase("Terror")){
                terror++;
            } else if(p.getGenero().equalsIgnoreCase("Drama")){
                drama++;
            } else if(p.getGenero().equalsIgnoreCase("Comedia")){
                comedia++;
            } else if(p.getGenero().equalsIgnoreCase("Acción")){
                accion++;
            } else if(p.getGenero().equalsIgnoreCase("Animación")){
                animacion++;
            }
        }
        return ("Drama: "+ drama + "Comedia: "+ comedia + "Terror: "+ terror + "Accion: "+ accion + "Animacion: "+ animacion);
        }
    public void ordenarPorDuracion(){
        Collections.sort(peliculas, (p1, p2) -> 
            Integer.compare(p1.getDuracionMinutos(), p2.getDuracionMinutos())
        );
    }
}