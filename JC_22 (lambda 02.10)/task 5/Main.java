package com.company;

public class Main {

    public static void main(String[] args) {
        Amphibiaa eat = () -> System.out.println("I can eat");
        Amphibiaa sleep = () -> System.out.println("I can sleep");
        Amphibiaa swim = () -> System.out.println("I can swim");
        Amphibiaa walk = () -> System.out.println("I can walk");

        eat.print();
        sleep.print();
        swim.print();
        walk.print();
    }
}
