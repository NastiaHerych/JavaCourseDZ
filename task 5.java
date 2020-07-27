package com.company;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        //Task 1:
        System.out.print("Task 1: \n ");
        for (int a = 1, b = 1; a <= 55; a++, b = b + 2) {
            System.out.print(b + " ");
        }

        //Task 2:
        System.out.print("\n Task 2:\n");
        for (int a = 95; a > 0; a -= 5) {
            System.out.print(a + " ");
        }

        //Task 3:
        System.out.print("\n Task 3:\n");
        Scanner number = new Scanner(System.in);
        int num;
        System.out.print("Введіть число: ");
        num = number.nextInt();
        if (num % 2 == 0)
            System.out.println("Парне");
        else
            System.out.println("Непарне");


        //Task 4
        System.out.print("\n Task 4:\n");
        Scanner first = new Scanner(System.in);
        double n;
        System.out.print("Введіть n: ");
        n = first.nextInt();
        Scanner second = new Scanner(System.in);
        double m;
        System.out.print("Введіть m: ");
        m = second.nextInt();
        int a=10;
        double b=Math.abs(a-n);
        double c=Math.abs(a-m);
        if(b>c){
            System.out.println("Число "+m+" ближче до "+a);
        }
        if (b<c) {
            System.out.println("Число "+n+" ближче до "+a);
        }
        if (b==c){
            System.out.println("Числа "+n +" і "+m + " однаково віддалені від "+a);
        }


        //Task 5
        System.out.print("\n Task 5:\n");
        Random rand = new Random();
        int []array;
        array =new int [5];
        //int [] array = {25, 11, 250, 5};
        int max = array[0];
        int min = array[0];
        for ( int i=0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20) ;

            System.out.print(array[i] + " ");
            if ( array[i] > max) {
                max = array[i];
                System.out.println("\n Максимальний елемент масиву:" + max);
            }
            if (array[i] < min) {
                min = array[i];
                System.out.println("\n Мінімальний елемент масиву:" + min);
            }
        }


    }
}