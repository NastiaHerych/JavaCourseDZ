package com.company;

public class MyException extends Exception {
    private String error;

    public MyException(String error) {
        super(error);
        this.error = error;
    }

    public String getMessage() {
        return error;
    }
}
