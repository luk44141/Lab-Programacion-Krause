public class Pelicula extends ContenidoMultimedia implements Calificable {
    
    private int duracionMinutos;

    public Pelicula(int id, String titulo, int duracionMinutos) {
        super(id, titulo);
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo película de " + duracionMinutos + " minutos...");
    }
    @Override
    public void darLike() {
        System.out.println("Like agregado");
    }
}