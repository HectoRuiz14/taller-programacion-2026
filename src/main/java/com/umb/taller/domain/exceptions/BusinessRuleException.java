package com.umb.taller.domain.exceptions;

public class BusinessRuleException extends DomainException {
    public BusinessRuleException(String message) {
        super("Business rule violation: " + message);
    }
}