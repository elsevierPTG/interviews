package com.elsevier.javaspringapi.contract;

public class ErrorResponse {

    public ErrorResponse(String error) {
        this.error = error;
    }

    private final String error;

    public String getError() {
        return error;
    }
}
