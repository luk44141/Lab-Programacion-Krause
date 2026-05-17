import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre; 
    List<ContenidoMultimedia> listaFavoritos = new ArrayList<>();
    
    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    public void agregarAFavoritos(ContenidoMultimedia contenido) {
        listaFavoritos.add(contenido);
    }

    public List<ContenidoMultimedia> getListaFavoritos() {
        return listaFavoritos;
    }
}
