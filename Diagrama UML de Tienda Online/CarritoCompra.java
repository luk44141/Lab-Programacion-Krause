public class CarritoCompra {
    private int idCarrito;
    private String fechaCreacion;
    private Cliente cliente;

    public CarritoCompra(int idCarrito, String fechaCreacion, Cliente cliente) {
        this.idCarrito = idCarrito;
        this.fechaCreacion = fechaCreacion;
        this.cliente = cliente;
    }
}