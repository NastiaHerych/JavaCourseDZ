package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Task 1
        int q;     // опис змінної з іменем a типу int
        int w = 5; // опис змінної b та її ініціалізація значенням 5
        byte c = 0;
        double pi = 3.1415; // опис та ініціалізація змінної pi типу double
        double d = 0; // опис змінної x та її ініціалізація
        boolean bool = true, bool2;
        boolean bb = false;
        char ch = 'A';
        char c1, c2, c3 = 'B';
        short sh;
        long l = 123456789l;
        float f;


            //Task 2
        System.out.println("boolean = " + Boolean.FALSE);
        System.out.println("boolean = " + Boolean.TRUE);
        System.out.println("byte min = " + Byte.MIN_VALUE);
        System.out.println("byte max = " + Byte.MAX_VALUE);
        System.out.println("char = " + Character.MAX_VALUE);
        System.out.println("short min = " + Short.MIN_VALUE);
        System.out.println("short max = " + Short.MAX_VALUE);
        System.out.println("int min = " + Integer.MIN_VALUE);
        System.out.println("int max = " + Integer.MAX_VALUE);
        System.out.println("long min = " + Long.MIN_VALUE);
        System.out.println("long max = " + Long.MAX_VALUE);
        System.out.println("double min = " + Double.MIN_VALUE);
        System.out.println("double max = " + Double.MAX_VALUE);
        System.out.println("float min = " + Float.MIN_VALUE);
        System.out.println("float max = " + Float.MAX_VALUE);
        System.out.println();


        //Task 3
        Scanner s = new Scanner(System.in);
        System.out.println("Введіть кількість чисел: ");
        int a = s.nextInt();

        int[] array = new int[a];
        System.out.println("Введіть числа в масив: ");
        for(int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];

            if(array[i] < min)
                min = array[i];
        }
        System.out.println("Мінімальне число: " + min);
        System.out.println("Максимальне число: " + max);


    }
}