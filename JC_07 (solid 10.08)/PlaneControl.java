package com.company;

public class PlaneControl {

    public void goUp () {
        System.out.println( " The plane is going up on " + Move.move() + " km");
    }


    public void goDown (){
        System.out.println( " The plane is going down on "+ Move.move() + " km");
    }


    public void goAhead (){
        System.out.println( " The plane is going ahead on " + Move.move() + " km");
    }


    public void goBack (){
        System.out.println( " The plane is going back on " + Move.move() + " km");
    }





}
