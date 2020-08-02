package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Task 1
        System.out.print("Task 1: \n");
        int a, b;
        Scanner in = new Scanner(System.in);

        System.out.print("a = ");
        a = in.nextInt();
        System.out.print("b = ");
        b = in.nextInt();

        Rectangle rec = new Rectangle(a,b);
        int area = rec.getArea();
        System.out.println("Area = " + area);

        int perum = rec.getPerum();
        System.out.println("Perumetr = " + perum);


        //Task 2
        System.out.print("Task 2: \n ");
        double radius;
        Scanner scan = new Scanner(System.in);
        System.out.print("Radius = ");
        radius = scan.nextDouble();

        Circle circ = new Circle(radius);
        double areaa = circ.getArea();
        System.out.println("Area = " + areaa);

        double lenght = circ.getLength();
        System.out.println("Lenght = " + lenght);


    }
}