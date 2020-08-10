package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal ("Lion", 100, 2);

        System.out.println("Data at the beginning:\n" + animal);

        animal.setName("Panther");
        animal.setSpeed(120);
        animal.setAge(5);

        System.out.println("\n New data:\n" + animal);

    }
}
