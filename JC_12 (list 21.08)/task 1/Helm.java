package com.company;

public class Helm {
    private int wheelDiameter;
    private String wheelMaterial;

    public Helm(int wheelDiameter, String wheelMaterial) {
        this.wheelDiameter = wheelDiameter;
        this.wheelMaterial = wheelMaterial;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }

    public String getWheelMaterial() {
        return wheelMaterial;
    }

}
