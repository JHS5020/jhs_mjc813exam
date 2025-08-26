package com.mjc813.swimpool_app.common.exception;

public class MyDataNotFoundException extends RuntimeException {
    public MyDataNotFoundException() {
        super();
    }

    public MyDataNotFoundException(String message) {
        super(message);
    }

    public MyDataNotFoundException(Exception e, String message) {
        super(message, e);
    }
}
