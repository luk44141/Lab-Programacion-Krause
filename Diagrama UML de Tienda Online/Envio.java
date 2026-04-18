public class Envio {
    private int idEnvio;
    private String direccionEntrega;
    private String estado;
    private String fechaEnvio;

    public Envio(int idEnvio, String direccionEntrega, String estado, String fechaEnvio) {
        this.idEnvio = idEnvio;
        this.direccionEntrega = direccionEntrega;
        this.estado = estado;
        this.fechaEnvio = fechaEnvio;
    }
}