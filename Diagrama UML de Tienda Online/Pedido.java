public class Pedido {
    private int idPedido;
    private String fecha;
    private String estado;
    private double total;
    private Cliente cliente;

    public Pedido(int idPedido, String fecha, String estado, double total, Cliente cliente) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.estado = estado;
        this.total = total;
        this.cliente = cliente;
    }
}