package com.sistemaestudiantes.service;

import com.sistemaestudiantes.dao.EstudianteDAO;
import com.sistemaestudiantes.model.Estudiante;

import java.util.List;

public class EstudianteService {

    private EstudianteDAO estudianteDAO;

    public EstudianteService(EstudianteDAO estudianteDAO) {
        this.estudianteDAO = estudianteDAO;
    }

    public void Registrar(String nombre, String apellido, int dni, String curso) {
        int id = estudianteDAO.ListarTodo().size() + 1;

        Estudiante estudiante = new Estudiante(
                id,
                nombre,
                apellido,
                dni,
                curso
        );

        estudianteDAO.Crear(estudiante);
    }

    public void Actualizar(int id, String nombre, String apellido, int dni, String curso) {
        Estudiante estudiante = new Estudiante(
                id,
                nombre,
                apellido,
                dni,
                curso
        );

        estudianteDAO.Actualizar(estudiante);
    }

    public void Eliminar(int id) {
        estudianteDAO.Eliminar(id);
    }

    public Estudiante ListarPorId(int id) {
        return estudianteDAO.ListarPorId(id);
    }

    public List<Estudiante> ListarTodo() {
        return estudianteDAO.ListarTodo();
    }
}