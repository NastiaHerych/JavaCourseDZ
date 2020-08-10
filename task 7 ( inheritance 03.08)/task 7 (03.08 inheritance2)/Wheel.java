package com.company;

public class Wheel {
    private double Size;

    public Wheel(double Size) {
        this.Size = Size;
    }

    public double biggerSize () {
        double newSize = this.Size * 5;
        return newSize;
    }

    public double getSize() {
        return Size;
    }

    public void setSize(double Size) {
        this.Size = Size;
    }

    @Override
    public String toString() {
        return "Wheel Size: " + Size;
    }


}
