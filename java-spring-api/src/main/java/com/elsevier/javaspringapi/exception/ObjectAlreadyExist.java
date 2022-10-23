package com.elsevier.javaspringapi.exception;

public class ObjectAlreadyExist extends RuntimeException {
    public ObjectAlreadyExist(String message) {
        super(message);
    }
}
