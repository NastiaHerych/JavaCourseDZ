package com.company;

public class Body {
    private String brand;

    public Body (String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Body brand: " + brand;
    }

}
