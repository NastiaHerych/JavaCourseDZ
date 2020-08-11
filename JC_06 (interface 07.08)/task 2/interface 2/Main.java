package com.interface2;

public class Main {

    public static void main(String[] args) {

        MyCalculator calc = new MyCalculator( 5, 3);


        MyCalculator.Result(calc.plus());
        MyCalculator.Result(calc.minus());
        MyCalculator.Result(calc.multiply());
        MyCalculator.Result(calc.divide());

        System.out.println();

    }
}
