public class LineaProducto {
    private int idLinea;
    private int cantidad;
    private double precioUnitario;
    private Producto producto;

    public LineaProducto(int idLinea, int cantidad, double precioUnitario, Producto producto) {
        this.idLinea = idLinea;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.producto = producto;
    }
}