package com.company;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static void menu() {
        System.out.println("Введіть 1, щоб вивести випадковий масив елементів авто");
        System.out.println("Введіть 2, щоб вивести одне записане значення в масив авто");
    }

    static int getRandomValue(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("Min value must be less than max value!");
        }

        Random randomValue = new Random();
        return randomValue.nextInt(max - min + 1) + min;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Material wheelMaterial[] = Material.values();

        while (true) {
            menu();

            switch (scanner.nextInt()) {

                case 1: {

                    Car CarArray[][] = new Car[getRandomValue(1, 3)][getRandomValue(1, 3)]; //number of cars

                    for (int i = 0; i < CarArray.length; i++) {
                        for (int j = 0; j < CarArray[i].length; j++) {
                            CarArray[i][j] = new Car(getRandomValue(100, 300), //number Of Engine Horse Power
                                    getRandomValue(2000, 2020), //production year
                                    new Helm(getRandomValue(10, 30), //wheel diameter
                                            wheelMaterial[getRandomValue(0,wheelMaterial.length - 1)].toString()), //material
                                    new Engine(getRandomValue(1, 10))); //number of cylinders
                        }
                    }
                    System.out.println(Arrays.deepToString(CarArray));
                    break;
                }


                case 2: {

                    Car CarArray[] = new Car[getRandomValue(2, 6)]; //number of cars

                    Car car = new Car(getRandomValue(100, 200), //number Of Engine Horse Power
                            getRandomValue(2000, 2020), //production year
                            new Helm(getRandomValue(30, 50), //wheel diameter
                                    wheelMaterial[getRandomValue(0, wheelMaterial.length - 1)].toString()), //material
                            new Engine(getRandomValue(11, 20))); //number of cylinders


                    Arrays.fill(CarArray, car);

                    System.out.println(Arrays.deepToString(CarArray));
                    break;
                }
            }
        }
    }
}

