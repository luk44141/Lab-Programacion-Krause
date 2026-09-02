package com.sistemaestudiantes.dao;

import com.sistemaestudiantes.model.Estudiante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAOImpl implements EstudianteDAO {

    private final String URL = "jdbc:mysql://localhost:3306/sistema_estudiantes";
    private final String USUARIO = "root";
    private final String PASSWORD = "";

    public Connection ConexionBd() {
        try {
            return DriverManager.getConnection(URL, USUARIO, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void Crear(Estudiante e) {
        String sql = "INSERT INTO estudiantes (id, nombre, apellido, dni, curso) VALUES (?, ?, ?, ?, ?)";

        try (Connection conexion = ConexionBd();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, e.getId());
            ps.setString(2, e.getNombre());
            ps.setString(3, e.getApellido());
            ps.setInt(4, e.getDni());
            ps.setString(5, e.getCurso());

            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void Actualizar(Estudiante e) {
        String sql = "UPDATE estudiantes SET nombre = ?, apellido = ?, dni = ?, curso = ? WHERE id = ?";

        try (Connection conexion = ConexionBd();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setInt(3, e.getDni());
            ps.setString(4, e.getCurso());
            ps.setInt(5, e.getId());

            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void Eliminar(int id) {
        String sql = "DELETE FROM estudiantes WHERE id = ?";

        try (Connection conexion = ConexionBd();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public Estudiante ListarPorId(int id) {
        String sql = "SELECT * FROM estudiantes WHERE id = ?";

        try (Connection conexion = ConexionBd();
             PreparedStatement ps = conexion.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Estudiante(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("dni"),
                        rs.getString("curso")
                );
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Estudiante> ListarTodo() {
        List<Estudiante> estudiantes = new ArrayList<>();

        String sql = "SELECT * FROM estudiantes";

        try (Connection conexion = ConexionBd();
             PreparedStatement ps = conexion.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Estudiante estudiante = new Estudiante(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("dni"),
                        rs.getString("curso")
                );

                estudiantes.add(estudiante);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return estudiantes;
    }
}