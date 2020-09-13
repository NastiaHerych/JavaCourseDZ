package com.company;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

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
        List <Material> wheelMaterialList = new ArrayList<Material>();

        for (Material wheelMaterialValue : Material.values()) {
            wheelMaterialList.add(wheelMaterialValue);
        }

        while (true) {
            menu();

            switch (scanner.nextInt()) {

                case 1: {

                    List <Car> carArrayList = new ArrayList<Car>();
                    for (int i = 0; i < getRandomValue(1, 5); i++) {
                        List <Car> carArrayList1 = new ArrayList<Car>();
                        for (int j = 0; j < getRandomValue(1, 5); j++) {
                            carArrayList1.add(new Car(getRandomValue(100, 300), //number Of Engine Horse Power
                                    getRandomValue(2000, 2020), //production year
                                    new Helm(getRandomValue(10, 30), //wheel diameter
                                            wheelMaterialList.get(getRandomValue(0,wheelMaterialList.size() - 1)).toString()), //material
                                    new Engine(getRandomValue(1, 10)))); //number of cylinders
                        }
                        carArrayList.addAll(carArrayList1);
                    }
                    System.out.println(carArrayList);
                    break;
                }


                case 2: {

                    Car car = new Car(getRandomValue(100, 200), //number Of Engine Horse Power
                            getRandomValue(2000, 2020),//production year
                            new Helm(getRandomValue(35, 50),//wheel diameter
                                    wheelMaterialList.get(getRandomValue(0, wheelMaterialList.size() - 1)).toString()),//material
                            new Engine(getRandomValue(11, 20))); //number of cylinders

                    List <Car> carArrayList = new ArrayList <Car>();

                    for (int i = 0; i < getRandomValue(1, 5); i++) {
                        carArrayList.add(car);
                    }

                    System.out.println(carArrayList);
                    break;
                }
            }
        }
    }
}

