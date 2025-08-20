package com.Coralesk1.Calculator_Spring_boot.Controller.Exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ErrorException.class)
    public ResponseEntity<String> handleErrorException(ErrorException ex) {
        return ResponseEntity
                .badRequest()  // status HTTP 400
                .body(ex.getMessage()); // mensagem que vai para o frontend
    };
};