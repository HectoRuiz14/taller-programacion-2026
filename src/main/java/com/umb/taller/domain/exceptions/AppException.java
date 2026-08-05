package com.umb.taller.domain.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AppException extends RuntimeException {
    private static final Logger logger = LoggerFactory.getLogger(AppException.class);

    public AppException(String message) {
        super(message);
        logger.error("AppException occurred: {}", message);
    }
}