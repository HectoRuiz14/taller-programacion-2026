package com.umb.taller.domain.exceptions;

public class EntityNotFoundException extends DomainException {
    public EntityNotFoundException(String entity, String id) {
        super(entity + " with ID " + id + " was not found.");
    }
}