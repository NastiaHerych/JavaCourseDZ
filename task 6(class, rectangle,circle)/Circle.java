package com.company;

public class Circle {
    private double diameter;
    private double radius;

    public Circle(double radius) {
        this.diameter = 2 * radius;
        this.radius = radius;
    }


    public double getArea() {
        double s;
        s = radius * radius * Math.PI;
        return s;
    }

    public double getLength() {
        double l;
        l = diameter * Math.PI;
        return l;
    }
}
