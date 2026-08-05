package com.umb.taller.domain.exceptions;

public class ValidationException extends DomainException {
    public ValidationException(String message) {
        super("Validation failed: " + message);
    }
}