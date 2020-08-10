package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

    Robot defaultRobot = new Robot();
    CoffeRobot coffeRobot = new CoffeRobot();
    RobotDancer robotDancer = new RobotDancer();
    RobotCoocker robotCoocker = new RobotCoocker();

    defaultRobot.work();
    coffeRobot.work();
    robotDancer.work();
    robotCoocker.work();

//    ArrayList <Robot> robots = new ArrayList<Robot>();
//    robots.add(defaultRobot);
//    robots.add(coffeRobot);
//    robots.add(robotDancer);
//    robots.add(robotCoocker);


        Robot[] robots = { defaultRobot, coffeRobot, robotDancer, robotCoocker};
        for (int i = 0; i < robots.length; i++){
            robots[i].work();

           // robots[0].work();


   }










    }
}
