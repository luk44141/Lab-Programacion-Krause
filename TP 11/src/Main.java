import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {

        Connection conexion = Conexion.conectar();

        if (conexion == null) {
            return;
        }

        insertarVendedores(conexion);
        eliminarVendedor(conexion);
        modificarVendedor(conexion);
        listarVendedores(conexion);

        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion: " + e.getMessage());
        }
    }

    public static void insertarVendedores(Connection conexion) {

        String sql = "INSERT INTO vendedores (nombre, apellido, dni, rubro, actual) VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement sentencia = conexion.prepareStatement(sql)) {

            sentencia.setString(1, "Juan");
            sentencia.setString(2, "Perez");
            sentencia.setString(3, "12345678");
            sentencia.setString(4, "Electronica");
            sentencia.setBoolean(5, true);
            sentencia.executeUpdate();

            sentencia.setString(1, "Pedro");
            sentencia.setString(2, "Gomez");
            sentencia.setString(3, "23456789");
            sentencia.setString(4, "Indumentaria");
            sentencia.setBoolean(5, true);
            sentencia.executeUpdate();

            sentencia.setString(1, "Lucas");
            sentencia.setString(2, "Rodriguez");
            sentencia.setString(3, "34567890");
            sentencia.setString(4, "Alimentos");
            sentencia.setBoolean(5, false);
            sentencia.executeUpdate();

            sentencia.setString(1, "Martin");
            sentencia.setString(2, "Lopez");
            sentencia.setString(3, "45678901");
            sentencia.setString(4, "Automotores");
            sentencia.setBoolean(5, true);
            sentencia.executeUpdate();

            sentencia.setString(1, "Santiago");
            sentencia.setString(2, "Fernandez");
            sentencia.setString(3, "56789012");
            sentencia.setString(4, "Deportes");
            sentencia.setBoolean(5, true);
            sentencia.executeUpdate();

            System.out.println("5 vendedores insertados correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al insertar: " + e.getMessage());
        }
    }

    public static void eliminarVendedor(Connection conexion) {

        String sql = "DELETE FROM vendedores WHERE id = 4";

        try (PreparedStatement sentencia = conexion.prepareStatement(sql)) {

            int filas = sentencia.executeUpdate();

            System.out.println("Vendedor ID 4 eliminado. Filas afectadas: " + filas);

        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }
    }

    public static void modificarVendedor(Connection conexion) {

        String sql = "UPDATE vendedores SET apellido = ?, rubro = ? WHERE id = 2";

        try (PreparedStatement sentencia = conexion.prepareStatement(sql)) {

            sentencia.setString(1, "Martinez");
            sentencia.setString(2, "Tecnologia");

            int filas = sentencia.executeUpdate();

            System.out.println("Vendedor ID 2 modificado. Filas afectadas: " + filas);

        } catch (SQLException e) {
            System.out.println("Error al modificar: " + e.getMessage());
        }
    }

    public static void listarVendedores(Connection conexion) {

        String sql = "SELECT * FROM vendedores";

        try (
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery()
        ) {

            System.out.println("\nLISTADO DE VENDEDORES:");

            while (resultado.next()) {

                System.out.println(
                    resultado.getInt("id") + " - " +
                    resultado.getString("nombre") + " - " +
                    resultado.getString("apellido") + " - " +
                    resultado.getString("dni") + " - " +
                    resultado.getString("rubro") + " - " +
                    resultado.getBoolean("actual")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error al listar: " + e.getMessage());
        }
    }
}