package com.globant.service;

import com.globant.dao.EmpleadoDao;
import com.globant.exceptions.CargoInvalidoException;
import com.globant.exceptions.DniDuplicadoException;
import com.globant.exceptions.DniInvalidoException;
import com.globant.exceptions.EmpleadoNoEncontradoException;
import com.globant.exceptions.EmpleadoYaInactivoException;
import com.globant.exceptions.SalarioInvalidoException;
import com.globant.model.Empleado;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class EmpleadoService {

    private EmpleadoDao empleadoDao;

    private final List<String> cargosPermitidos = Arrays.asList(
            "Analista",
            "Desarrollador",
            "Gerente",
            "Soporte"
    );

    public EmpleadoService(EmpleadoDao empleadoDao) {
        this.empleadoDao = empleadoDao;
    }

    public void Registrar(
            String nombre,
            String apellido,
            int dni,
            String cargo,
            double salario)
            throws DniInvalidoException,
                   DniDuplicadoException,
                   SalarioInvalidoException,
                   CargoInvalidoException,
                   SQLException {

        validarDni(dni);
        validarDniDuplicado(dni);
        validarSalario(salario);
        validarCargo(cargo);

        Empleado empleado = new Empleado(
                0,
                nombre,
                apellido,
                dni,
                cargo,
                salario,
                true
        );

        empleadoDao.Crear(empleado);
    }

    public void Actualizar(
            int id,
            String nombre,
            String apellido,
            int dni,
            String cargo,
            double salario)
            throws DniInvalidoException,
                   DniDuplicadoException,
                   SalarioInvalidoException,
                   CargoInvalidoException,
                   EmpleadoNoEncontradoException,
                   SQLException {

        Empleado empleadoExistente = empleadoDao.ListarPorId(id);

        if (empleadoExistente == null) {
            throw new EmpleadoNoEncontradoException(
                    "No existe un empleado activo con el ID " + id
            );
        }

        validarDni(dni);

        Empleado empleadoConDni = empleadoDao.BuscarPorDni(dni);

        if (empleadoConDni != null && empleadoConDni.getId() != id) {
            throw new DniDuplicadoException(
                    "El DNI " + dni + " ya pertenece a otro empleado."
            );
        }

        validarSalario(salario);
        validarCargo(cargo);

        Empleado empleado = new Empleado(
                id,
                nombre,
                apellido,
                dni,
                cargo,
                salario,
                true
        );

        empleadoDao.Actualizar(empleado);
    }

    public void Eliminar(int id)
            throws EmpleadoNoEncontradoException,
                   EmpleadoYaInactivoException,
                   SQLException {

        Empleado empleado = empleadoDao.BuscarPorId(id);

        if (empleado == null) {
            throw new EmpleadoNoEncontradoException(
                    "No existe un empleado con el ID " + id
            );
        }

        if (!empleado.isActivo()) {
            throw new EmpleadoYaInactivoException(
                    "El empleado con ID " + id + " ya esta inactivo."
            );
        }

        empleadoDao.Eliminar(id);
    }

    public Empleado ListarPorId(int id)
            throws EmpleadoNoEncontradoException,
                   SQLException {

        Empleado empleado = empleadoDao.ListarPorId(id);

        if (empleado == null) {
            throw new EmpleadoNoEncontradoException(
                    "No existe un empleado activo con el ID " + id
            );
        }

        return empleado;
    }

    public List<Empleado> ListarTodo() throws SQLException {
        return empleadoDao.ListarTodo();
    }

    private void validarDni(int dni)
            throws DniInvalidoException {

        if (dni < 1000000 || dni > 99999999) {
            throw new DniInvalidoException(
                    "El DNI debe tener 7 u 8 digitos."
            );
        }
    }

    private void validarDniDuplicado(int dni)
            throws DniDuplicadoException, SQLException {

        Empleado empleado = empleadoDao.BuscarPorDni(dni);

        if (empleado != null) {
            throw new DniDuplicadoException(
                    "El DNI " + dni + " ya esta registrado."
            );
        }
    }

    private void validarSalario(double salario)
            throws SalarioInvalidoException {

        if (salario <= 0) {
            throw new SalarioInvalidoException(
                    "El salario debe ser mayor a 0."
            );
        }
    }

    private void validarCargo(String cargo)
            throws CargoInvalidoException {

        if (!cargosPermitidos.contains(cargo)) {
            throw new CargoInvalidoException(
                    "El cargo '" + cargo + "' no es valido."
            );
        }
    }
}