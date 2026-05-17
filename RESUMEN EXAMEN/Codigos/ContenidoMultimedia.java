public abstract class ContenidoMultimedia {
    protected int id;
    protected String titulo;

    public ContenidoMultimedia(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public abstract void reproducir();

}
