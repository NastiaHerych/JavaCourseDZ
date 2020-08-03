package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("     Task 2:");

        SteeringWheel steeringWheel = new SteeringWheel(2);
        Wheel wheel = new Wheel(3.5);
        Body body = new Body("Porsche");
        Car car = new Car("white", 500, steeringWheel, wheel, body);

        System.out.println("Data at the beginning:\n" + car);

        car.setMaxSpeed(700);
        car.setColor("black");
        steeringWheel.setDiameter(steeringWheel.biggerDiameter());
        wheel.setSize(wheel.biggerSize());
        body.setBrand("BMW");

        System.out.println("\nNew data:\n" + car);
    }
}
