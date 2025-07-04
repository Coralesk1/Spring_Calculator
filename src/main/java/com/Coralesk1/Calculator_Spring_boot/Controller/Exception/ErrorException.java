package com.Coralesk1.Calculator_Spring_boot.Controller.Exception;

public class ErrorException extends RuntimeException {
    public ErrorException(String message) {
        super(message);
    }
}
