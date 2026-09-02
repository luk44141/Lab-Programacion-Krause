package com.sistemaestudiantes;

import com.sistemaestudiantes.dao.EstudianteDAOImpl;
import com.sistemaestudiantes.model.Estudiante;
import com.sistemaestudiantes.service.EstudianteService;

public class Main {

    public static void main(String[] args) {

        EstudianteDAOImpl estudianteDAO = new EstudianteDAOImpl();
        EstudianteService estudianteService = new EstudianteService(estudianteDAO);

        // Registrar 10 estudiantes
        estudianteService.Registrar("Juan", "Perez", 12345678, "Programacion");
        estudianteService.Registrar("Maria", "Gomez", 23456789, "Base de Datos");
        estudianteService.Registrar("Lucas", "Rodriguez", 34567890, "Java");
        estudianteService.Registrar("Ana", "Fernandez", 45678901, "Programacion");
        estudianteService.Registrar("Pedro", "Lopez", 56789012, "Redes");
        estudianteService.Registrar("Sofia", "Martinez", 67890123, "Java");
        estudianteService.Registrar("Carlos", "Gonzalez", 78901234, "Base de Datos");
        estudianteService.Registrar("Lucia", "Diaz", 89012345, "Redes");
        estudianteService.Registrar("Mateo", "Sanchez", 90123456, "Programacion");
        estudianteService.Registrar("Valentina", "Romero", 11234567, "Java");

        // Listar todos
        System.out.println("===== ESTUDIANTES =====");

        for (Estudiante estudiante : estudianteService.ListarTodo()) {
            System.out.println(estudiante);
        }

        // Eliminar estudiante con ID 4
        estudianteService.Eliminar(4);

        // Actualizar estudiante con ID 6
        estudianteService.Actualizar(
                6,
                "Sofia",
                "Martinez",
                67890123,
                "Ingenieria Informatica"
        );

        // Actualizar estudiante con ID 8
        estudianteService.Actualizar(
                8,
                "Lucia",
                "Diaz",
                89012345,
                "Desarrollo Web"
        );

        // Mostrar resultado final
        System.out.println("\n===== DESPUES DE LOS CAMBIOS =====");

        for (Estudiante estudiante : estudianteService.ListarTodo()) {
            System.out.println(estudiante);
        }
    }
}