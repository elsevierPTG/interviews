package com.elsevier.javaspringapi.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConversionException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpMediaTypeException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Collections.singletonMap;
import static org.springframework.http.HttpStatus.*;

@RestControllerAdvice
public class APIExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, String>> handleException(Exception exception) {
        // TODO: log exception
        return new ResponseEntity<>(singletonMap("message", "Unexpected error occurred"), INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Map<String, String>> handleCustomException(NotFoundException exception) {
        // TODO: log exception
        return new ResponseEntity<>(singletonMap("message", "Record Not found"), BAD_REQUEST);
    }

    @ExceptionHandler(ObjectAlreadyExist.class)
    public ResponseEntity<Map<String, String>> handleCustomException(ObjectAlreadyExist exception) {
        // TODO: log exception
        return new ResponseEntity<>(singletonMap("message", "Record Already Exist"), CONFLICT);
    }

    @ExceptionHandler({HttpMessageConversionException.class, HttpMediaTypeException.class})
    public ResponseEntity<Map<String, String>> handleRequestException(Exception e) {
        // TODO: log exception
        String validationError = e.getMessage();
        return new ResponseEntity<>(singletonMap("message", validationError), BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleMethodArgumentNotValidException(
            MethodArgumentNotValidException methodArgumentNotValidException) {
        // TODO: log exception
        List<FieldError> fieldErrors = methodArgumentNotValidException.getBindingResult().getFieldErrors();
        String message = fieldErrors.stream()
                .map(e -> e.getField() + " - " + e.getDefaultMessage())
                .collect(Collectors.joining(", "));
        return new ResponseEntity<>(singletonMap("message", message), BAD_REQUEST);
    }
}
