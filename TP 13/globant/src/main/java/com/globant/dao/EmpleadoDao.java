package com.globant.dao;

import com.globant.model.Empleado;

import java.sql.SQLException;
import java.util.List;

public interface EmpleadoDao {

    void Crear(Empleado e) throws SQLException;

    void Actualizar(Empleado e) throws SQLException;

    void Eliminar(int id) throws SQLException;

    Empleado ListarPorId(int id) throws SQLException;

    Empleado BuscarPorId(int id) throws SQLException;

    List<Empleado> ListarTodo() throws SQLException;

    Empleado BuscarPorDni(int dni) throws SQLException;
}