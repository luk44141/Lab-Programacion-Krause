package com.sistemaestudiantes.dao;

import com.sistemaestudiantes.model.Estudiante;
import java.util.List;

public interface EstudianteDAO {

    void Crear(Estudiante e);

    void Actualizar(Estudiante e);

    void Eliminar(int id);

    Estudiante ListarPorId(int id);

    List<Estudiante> ListarTodo();
}