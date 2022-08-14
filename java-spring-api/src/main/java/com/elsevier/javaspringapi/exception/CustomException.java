package com.elsevier.javaspringapi.exception;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {

    public CustomException(HttpStatus code, String message) {
        super(message);
        this.code = code;
    }

    private HttpStatus code;

    public HttpStatus getCode() {
        return code;
    }
}
