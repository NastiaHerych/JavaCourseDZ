package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Input a: ");

        if (scan.hasNextInt()) {
            a = scan.nextInt();

            System.out.println("Input b: ");

            if (scan.hasNextInt()) {
                b = scan.nextInt();
                int sum = a + b;
                System.out.println("Sum: " + sum);
            }

            else
                System.out.println("You should input integer number");
        }

        else
            System.out.println("You should input integer number");

    }
}
