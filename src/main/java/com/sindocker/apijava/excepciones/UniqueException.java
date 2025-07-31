package com.sindocker.apijava.excepciones;

public class UniqueException extends RuntimeException {
    public UniqueException(String msg) {
        super(msg);
    }
}
