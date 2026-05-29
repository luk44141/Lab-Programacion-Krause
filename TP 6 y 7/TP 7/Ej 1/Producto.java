public class Producto {

    private String nombre;
    private String codigo;
    private double precio;

    public Producto(String nombre, String codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Codigo: " + codigo);
        System.out.println("Precio: $" + precio);
        System.out.println();
    }
}