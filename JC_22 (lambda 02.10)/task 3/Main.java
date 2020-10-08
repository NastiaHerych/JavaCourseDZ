package com.company;

public class Main {

    public static void main(String[] args) {

        Show message = text -> System.out.println(text);
        message.show("Float min = " + Float.MIN_VALUE);
        message.show("Float max = " + Float.MAX_VALUE);
        message.show("Double min = " + Double.MIN_VALUE);
        message.show("Double max = " + Double.MAX_VALUE);

    }
}
