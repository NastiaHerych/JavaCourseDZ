package com.company;

public class Commodity {
    private String name;
    private int length;
    private int width;
    private int weight;

    public Commodity(String name, int length, int weight, int width) {
        this.name = name;
        this.length = length;
        this.weight = weight;
        this.width= width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return  " Name: " + name +
                " Lenght: " + length +
                " Width: " + width +
                " Weight: " + weight ;
    }
}
