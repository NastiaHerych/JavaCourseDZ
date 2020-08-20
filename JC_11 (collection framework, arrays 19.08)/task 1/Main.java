package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class Main {

    static int getRandomValues (int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random numbers = new Random();
        return numbers.nextInt((max - min) + 1) + min;

    }


    public static void main(String[] args) {

        Integer array[] = new Integer[getRandomValues(0,10)];

        for (int i = 0; i < array.length; i++){
            array[i] = getRandomValues(0,100);
        }

        System.out.println("Random massive: " + Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Sorted massive in ascending order: " + Arrays.toString(array));

        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Sorted massive in descending order: " + Arrays.toString(array));


    }
}
