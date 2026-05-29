public class Main {

    public static void main(String[] args) {

        String[][] datos = {
                {"Mouse inalámbrico Logitech M185", "M101", "18500"},
                {"Teclado mecánico Redragon K552", "TE102", "54900"},
                {"Monitor Samsung 24 Full HD", "MO103", "248000"}
        };

        Producto[] productos = new Producto[datos.length];

        for (int i = 0; i < datos.length; i++) {

            String nombre = datos[i][0];
            String codigo = datos[i][1];
            double precio = Double.parseDouble(datos[i][2]);

            productos[i] = new Producto(nombre, codigo, precio);
        }

        Inventario inventario = new Inventario();

        for (Producto p : productos) {
            inventario.agregarProducto(p);
        }

        inventario.listarProductos();

        System.out.println("Cantidad: " + inventario.cantidadProductos());
    }
}