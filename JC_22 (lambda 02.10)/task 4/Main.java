package com.company;

public class Main {

    public static void main(String[] args) {

       Number1 number1 = SomeClass::new;
       Number2 number2 = SomeClass::new;

        System.out.println(number1.add(2));
        System.out.println(number2.create(7, 8));
    }
}

interface Number1{
    SomeClass add(double c);
}

interface Number2{
    SomeClass create(double a, double b);
}