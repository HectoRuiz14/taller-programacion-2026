package com.umb.taller.domain.exceptions;

public abstract class DomainException extends AppException {
    public DomainException(String message) {
        super(message);
    }
}