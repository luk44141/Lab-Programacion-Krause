public class Producto {
    protected int idProducto;
    protected String nombre;
    protected double precio;
    protected int stock;

    public Producto(int idProducto, String nombre, double precio, int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}