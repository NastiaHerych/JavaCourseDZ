package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyException {
        Scanner scan = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Input a:");

        if (scan.hasNextInt()) {
            a = scan.nextInt();

            System.out.println("Input b:");

            if (scan.hasNextInt()) {
                b = scan.nextInt();

                Methods calc = new Methods(a, b);

                Methods.Result(calc.plus());
                Methods.Result(calc.minus());
                Methods.Result(calc.multiply());
                Methods.Result(calc.divide());
            }

            else
                System.out.println("You should input integer number");
        }

        else
            System.out.println("You should input integer number");


    }
}
