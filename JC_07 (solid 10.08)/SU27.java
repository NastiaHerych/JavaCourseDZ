package com.company;

public class SU27 extends Plane implements Turbo {

    int maxSpeed;
    String color;

    public SU27(int length, int height, int weight, int maxSpeed, String color) {
        super(length, height, weight);
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    @Override
    public void turboAcceleration (){
        int speed = this.maxSpeed + (int) (Math.random() * this.maxSpeed);
        System.out.println(" Speed: " + speed + " km/hour");
    }


    @Override
    public void stealthTechnology(){
        int unvisible = (int) (Math.random()*100);
        System.out.println(" The plane is unvisible during: " + unvisible + " minutes");
    }

    @Override
    public void nuclearStrike(){
        int bombs = (int) (Math.random() * (10 + 1));
        System.out.println(" Amount of bombs: " + bombs );
    }



}
