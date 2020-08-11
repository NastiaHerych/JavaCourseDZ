package com.company;

public class Main {

    public static void main(String[] args) {

        SU27 su27 = new SU27( 1200, 6427,2350, 1000, "white" );

        su27.Begin();
        su27.TakeOff();

        PlaneControl planeControl = new PlaneControl();

        planeControl.goUp();
        planeControl.goDown();
        planeControl.goAhead();
        planeControl.goBack();

        su27.stealthTechnology();
        su27.nuclearStrike();
        su27.turboAcceleration();
        su27.Landing();

    }
}
