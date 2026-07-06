import java.util.ArrayList;

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
}