package com.company;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

    Supplier<Integer> menu = () -> {
        System.out.println("Input 1 to add fraction in Council ");
        System.out.println("Input 2 to remove fraction from Council ");
        System.out.println("Input 3 to show all fractions ");
        System.out.println("Input 4 to clear fraction ");
        System.out.println("Input 5 to show specific fraction ");
        System.out.println("Input 6 to add deputat in fraction ");
        System.out.println("Input 7 to remove deputat from fraction ");
        System.out.println("Input 8 to show bribers list ");
        System.out.println("Input 9 to show the largest bribe taker ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    };


        while (true) {

            switch (menu.get()) {
                case 1: {
                    SupremeCouncil.getResult().addFraction();
                    break;
                }
                case 2: {
                    SupremeCouncil.getResult().removeFraction();
                    break;
                }
                case 3: {
                    SupremeCouncil.getResult().getAllFractions();
                    break;
                }
                case 4: {
                    SupremeCouncil.getResult().clearFraction();
                    break;
                }
                case 5: {
                    SupremeCouncil.getResult().getFraction();
                    break;
                }
                case 6: {
                    SupremeCouncil.getResult().addDeputyToFraction();
                    break;
                }
                case 7: {
                    SupremeCouncil.getResult().removeDeputyFromFraction();
                    break;
                }
                case 8: {
                    SupremeCouncil.getResult().getBribeTakersFromFraction();
                    break;
                }
                case 9: {
                    SupremeCouncil.getResult().getLargestBribeTakerFromFraction();
                    break;
                }
                default: {
                    System.out.println("Input number from 1 to 9");
                    break;
                }
            }
        }
    }
}
