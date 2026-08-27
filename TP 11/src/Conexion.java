import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/vendedores_db";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    public static Connection conectar() {

        try {
            Connection conexion = DriverManager.getConnection(
                URL,
                USUARIO,
                PASSWORD
            );

            System.out.println("Conexion exitosa a MySQL");

            return conexion;

        } catch (SQLException e) {

            System.out.println("Error al conectar: " + e.getMessage());

            return null;
        }
    }
}