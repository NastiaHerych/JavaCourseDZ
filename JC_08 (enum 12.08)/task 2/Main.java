package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number: ");

        if (scanner.hasNextInt()) {
            if (scanner.nextInt() % 2 == 0) {
                System.out.println("Even number");
            } else
                System.out.println("Odd number");
        } else {
            System.out.println("You should input integer number ");
        }
    }


}
