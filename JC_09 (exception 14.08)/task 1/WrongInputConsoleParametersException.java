package com.company;

public class WrongInputConsoleParametersException extends Exception {

    private String wrong;

    public WrongInputConsoleParametersException(String wrong) {
        super(wrong);
        this.wrong = wrong;
    }

    public String getWrong() {
        return wrong;
    }
}
