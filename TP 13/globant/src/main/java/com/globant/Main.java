package com.globant;

import com.globant.dao.EmpleadoDaoImpl;
import com.globant.exceptions.CargoInvalidoException;
import com.globant.exceptions.DniDuplicadoException;
import com.globant.exceptions.DniInvalidoException;
import com.globant.exceptions.EmpleadoNoEncontradoException;
import com.globant.exceptions.EmpleadoYaInactivoException;
import com.globant.exceptions.SalarioInvalidoException;
import com.globant.model.Empleado;
import com.globant.service.EmpleadoService;

import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmpleadoDaoImpl dao = new EmpleadoDaoImpl();
        EmpleadoService service = new EmpleadoService(dao);

        try {

            System.out.println("=== REGISTRAR EMPLEADOS ===");

            service.Registrar(
                    "Juan",
                    "Perez",
                    12345678,
                    "Desarrollador",
                    500000
            );

            System.out.println("Empleado registrado correctamente.");

            service.Registrar(
                    "Maria",
                    "Gomez",
                    23456789,
                    "Analista",
                    600000
            );

            System.out.println("Empleado registrado correctamente.");

        } catch (DniInvalidoException |
                 DniDuplicadoException |
                 SalarioInvalidoException |
                 CargoInvalidoException |
                 SQLException e) {

            System.out.println("Error: " + e.getMessage());
        }

        try {

            System.out.println("\n=== DNI REPETIDO ===");

            service.Registrar(
                    "Pedro",
                    "Lopez",
                    12345678,
                    "Soporte",
                    400000
            );

        } catch (DniInvalidoException |
                 DniDuplicadoException |
                 SalarioInvalidoException |
                 CargoInvalidoException |
                 SQLException e) {

            System.out.println("Error: " + e.getMessage());
        }

        try {

            System.out.println("\n=== DNI INVALIDO ===");

            service.Registrar(
                    "Carlos",
                    "Diaz",
                    12345,
                    "Analista",
                    400000
            );

        } catch (DniInvalidoException |
                 DniDuplicadoException |
                 SalarioInvalidoException |
                 CargoInvalidoException |
                 SQLException e) {

            System.out.println("Error: " + e.getMessage());
        }

        try {

            System.out.println("\n=== SALARIO INVALIDO ===");

            service.Registrar(
                    "Lucia",
                    "Rodriguez",
                    34567890,
                    "Analista",
                    0
            );

        } catch (DniInvalidoException |
                 DniDuplicadoException |
                 SalarioInvalidoException |
                 CargoInvalidoException |
                 SQLException e) {

            System.out.println("Error: " + e.getMessage());
        }

        try {

            System.out.println("\n=== CARGO INVALIDO ===");

            service.Registrar(
                    "Martin",
                    "Sanchez",
                    45678901,
                    "ProgramadorSenior",
                    700000
            );

        } catch (DniInvalidoException |
                 DniDuplicadoException |
                 SalarioInvalidoException |
                 CargoInvalidoException |
                 SQLException e) {

            System.out.println("Error: " + e.getMessage());
        }

        try {

            System.out.println("\n=== ACTUALIZAR ===");

            service.Actualizar(
                    1,
                    "Juan",
                    "Perez Actualizado",
                    12345678,
                    "Gerente",
                    800000
            );

            System.out.println("Empleado actualizado correctamente.");

        } catch (DniInvalidoException |
                 DniDuplicadoException |
                 SalarioInvalidoException |
                 CargoInvalidoException |
                 EmpleadoNoEncontradoException |
                 SQLException e) {

            System.out.println("Error: " + e.getMessage());
        }

        try {

            System.out.println("\n=== ACTUALIZAR ID INEXISTENTE ===");

            service.Actualizar(
                    999,
                    "Pedro",
                    "Lopez",
                    56789012,
                    "Soporte",
                    400000
            );

        } catch (DniInvalidoException |
                 DniDuplicadoException |
                 SalarioInvalidoException |
                 CargoInvalidoException |
                 EmpleadoNoEncontradoException |
                 SQLException e) {

            System.out.println("Error: " + e.getMessage());
        }

        try {

            System.out.println("\n=== ELIMINAR ===");

            service.Eliminar(1);

            System.out.println("Empleado eliminado lógicamente.");

        } catch (EmpleadoNoEncontradoException |
                 EmpleadoYaInactivoException |
                 SQLException e) {

            System.out.println("Error: " + e.getMessage());
        }

        try {

            System.out.println("\n=== ELIMINAR DOS VECES ===");

            service.Eliminar(1);

        } catch (EmpleadoNoEncontradoException |
                 EmpleadoYaInactivoException |
                 SQLException e) {

            System.out.println("Error: " + e.getMessage());
        }

        try {

            System.out.println("\n=== LISTAR TODOS ===");

            List<Empleado> empleados = service.ListarTodo();

            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }

        } catch (SQLException e) {

            System.out.println("Error: " + e.getMessage());
        }

        try {

            System.out.println("\n=== BUSCAR ID INEXISTENTE ===");

            Empleado empleado = service.ListarPorId(999);

            System.out.println(empleado);

        } catch (EmpleadoNoEncontradoException |
                 SQLException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}