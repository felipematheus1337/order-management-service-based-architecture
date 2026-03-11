package com.orders.v1.application.exceptions;

public class UseCaseException extends RuntimeException {

    public UseCaseException() {
    }

    public UseCaseException(String message) {
        super(message);
    }
}
