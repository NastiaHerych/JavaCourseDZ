package com.company;

public class Car {
    private SteeringWheel steeringWheel;
    private Wheel wheel;
    private Body body;
    private String color;
    private int maxSpeed;

    public Car(String color,int maxSpeed,SteeringWheel steeringWheel, Wheel wheel, Body body) {
        this.maxSpeed = maxSpeed;
        this.steeringWheel = steeringWheel;
        this.wheel = wheel;
        this.body = body;
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public double getDiameter() {
        return steeringWheel.getDiameter();
    }

    public double getSize() {
        return wheel.getSize();
    }

    public String getBrand() {
        return body.getBrand();
    }

    @Override
    public String toString() {
        return "Car:\n Max Speed: " + getMaxSpeed() +  "\n Steering Wheel Diameter: " + getDiameter() +  "\n Wheel Size: " + getSize() + "\n Color: " + getColor() +"\n Brand: " + getBrand();
    }

}
