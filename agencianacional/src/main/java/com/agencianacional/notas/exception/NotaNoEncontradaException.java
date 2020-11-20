package com.agencianacional.notas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class NotaNoEncontradaException extends RuntimeException{
    public NotaNoEncontradaException(String message) {
        super(message);
    }
    public NotaNoEncontradaException(String message, Throwable cause) {
        super(message, cause);
    }
}
