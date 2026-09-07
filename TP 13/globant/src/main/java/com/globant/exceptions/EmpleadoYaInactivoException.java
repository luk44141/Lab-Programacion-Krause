package com.globant.exceptions;

public class EmpleadoYaInactivoException extends Exception {

    public EmpleadoYaInactivoException(String mensaje) {
        super(mensaje);
    }
}