package com.company;

public class SteeringWheel {
    private double diameter;


    public SteeringWheel(double diameter) {
        this.diameter = diameter;

    }

    public double biggerDiameter () {
        double newDiameter = this.diameter *2;
        return newDiameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "SteeringWheel diameter: " + diameter;
    }

}
