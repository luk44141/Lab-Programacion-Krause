package com.globant.exceptions;

public class EmpleadoNoEncontradoException extends Exception {

    public EmpleadoNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}