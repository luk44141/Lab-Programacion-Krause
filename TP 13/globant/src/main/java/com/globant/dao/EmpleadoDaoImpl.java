package com.globant.dao;

import com.globant.model.Empleado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDaoImpl implements EmpleadoDao {

    private Connection conexion;

    public Connection ConexionBd() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/globant_db";
        String usuario = "root";
        String password = "";

        conexion = DriverManager.getConnection(url, usuario, password);

        return conexion;
    }

    @Override
    public void Crear(Empleado e) throws SQLException {

        String sql = "INSERT INTO empleados (nombre, apellido, dni, cargo, salario, activo) " +
                     "VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBd();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCargo());
            ps.setDouble(5, e.getSalario());
            ps.setBoolean(6, e.isActivo());

            ps.executeUpdate();
        }
    }

    @Override
    public void Actualizar(Empleado e) throws SQLException {

        String sql = "UPDATE empleados SET nombre = ?, apellido = ?, dni = ?, " +
                     "cargo = ?, salario = ? WHERE id = ?";

        try (Connection conn = ConexionBd();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCargo());
            ps.setDouble(5, e.getSalario());
            ps.setInt(6, e.getId());

            ps.executeUpdate();
        }
    }

    @Override
    public void Eliminar(int id) throws SQLException {

        String sql = "UPDATE empleados SET activo = false WHERE id = ?";

        try (Connection conn = ConexionBd();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            ps.executeUpdate();
        }
    }

    @Override
    public Empleado ListarPorId(int id) throws SQLException {

        String sql = "SELECT * FROM empleados WHERE id = ? AND activo = true";

        try (Connection conn = ConexionBd();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    return convertirEmpleado(rs);
                }
            }
        }

        return null;
    }

    @Override
    public List<Empleado> ListarTodo() throws SQLException {

        List<Empleado> empleados = new ArrayList<>();

        String sql = "SELECT * FROM empleados WHERE activo = true";

        try (Connection conn = ConexionBd();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                empleados.add(convertirEmpleado(rs));
            }
        }

        return empleados;
    }

    @Override
    public Empleado BuscarPorDni(int dni) throws SQLException {

        String sql = "SELECT * FROM empleados WHERE dni = ?";

        try (Connection conn = ConexionBd();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, dni);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    return convertirEmpleado(rs);
                }
            }
        }

        return null;
    }

    private Empleado convertirEmpleado(ResultSet rs) throws SQLException {

        return new Empleado(
                rs.getInt("id"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getInt("dni"),
                rs.getString("cargo"),
                rs.getDouble("salario"),
                rs.getBoolean("activo")
        );
    }

        @Override
    public Empleado BuscarPorId(int id) throws SQLException {

        String sql = "SELECT * FROM empleados WHERE id = ?";

        try (Connection conn = ConexionBd();
            PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {
                    return convertirEmpleado(rs);
                }
            }
        }

        return null;
    }
}