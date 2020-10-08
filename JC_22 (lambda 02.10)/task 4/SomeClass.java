package com.company;

public class SomeClass {
    private double a, b, c;

    public SomeClass(){
        a = b = 5;
    }

    public SomeClass (double a, double b, double c){
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public SomeClass(double c){
        this();
        this.c = c;
    }

    public SomeClass (double b, double c){
        this(c);
        this.b = b;
    }


    @Override
    public String toString(){
        return " Result : " + a + "  " + b + "  " + c;
    }
}
