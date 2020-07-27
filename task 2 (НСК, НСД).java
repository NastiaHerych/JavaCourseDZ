package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        // Ввід вхідних даних
        System.out.print("Enter number 1:");
        int x = scann.nextInt();
        System.out.print("Enter number 2:");
        int y = scann.nextInt();

     /*   НСД
    // int x = 252;
     // int y = 105;
        if (x == y) {
            System.out.println("End");
        }
        while (x != y) {
            if (x < y) {
                y -= x;
            } else
                x -= y;
        }
        System.out.println(x);*/

        //НСК
        if (x < y) {
            int num = x;
            x = y;
            y = num;
        }
        int mult = x * y;

        while (x != y) {
            if (x < y) {
                y -= x;
            } else
                x -= y;
        }
        int nsk = mult / x;
        System.out.print("Result:" + nsk);

    }
}