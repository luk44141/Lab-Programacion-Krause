package com.globant.exceptions;

public class SalarioInvalidoException extends Exception {

    public SalarioInvalidoException(String mensaje) {
        super(mensaje);
    }
}