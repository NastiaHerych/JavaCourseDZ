package com.company;

public class Car {
    private int numberOfEngineHorsePower;
    private int productionYear;
    private Helm wheel;
    private Engine engine;

    public Car(int numberOfEngineHorsePower, int productionYear, Helm wheel, Engine engine) {
        this.numberOfEngineHorsePower = numberOfEngineHorsePower;
        this.productionYear = productionYear;
        this.wheel = wheel;
        this.engine = engine;
    }


    public int getNumberOfEngineHorsePower() {
        return numberOfEngineHorsePower;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public Helm getWheel() {
        return wheel;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "\n Car:\n" + "  1) Engine Horse Power: " + numberOfEngineHorsePower +
                "  2) Production Year: " + productionYear +
                "  3) Wheel Diameter: " + wheel.getWheelDiameter() +
                "  4) Wheel Material: " + wheel.getWheelMaterial() +
                "  5) Number Of Cylinders: " + engine.getNumberOfCylinders();
    }
}