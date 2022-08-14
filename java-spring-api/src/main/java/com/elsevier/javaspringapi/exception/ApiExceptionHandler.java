package com.elsevier.javaspringapi.exception;

import com.elsevier.javaspringapi.contract.ErrorResponse;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleUnknownErrors(Exception exception) {

        return new ResponseEntity<>(new ErrorResponse("Something went wrong."), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ErrorResponse> handleCustomException(CustomException exception) {

        return new ResponseEntity<>(new ErrorResponse(exception.getMessage()), exception.getCode());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleMethodArgumentNotValidException(
            MethodArgumentNotValidException methodArgumentNotValidException) {

        List<FieldError> fieldErrors = methodArgumentNotValidException.getBindingResult().getFieldErrors();
        String message = fieldErrors.stream()
                .map(e -> e.getField() + " - " + e.getDefaultMessage())
                .collect(Collectors.joining(", "));
        return new ResponseEntity<>(new ErrorResponse(message), HttpStatus.BAD_REQUEST);
    }
}
