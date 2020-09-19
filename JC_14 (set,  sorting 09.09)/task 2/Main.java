package com.company;
import java.util.Scanner;

public class Main {

    static void menu() {
        System.out.println();
        System.out.println("Input 1 to add commodity");
        System.out.println("Input 2 to delete commodity");
        System.out.println("Input 3 to replace commodity");
        System.out.println("Input 4 to sort commodities by name");
        System.out.println("Input 5 to sort commodities by lenght");
        System.out.println("Input 6 to sort commodities by width");
        System.out.println("Input 7 to sort commodities by weight");
        System.out.println("Input 8 to show the commodity by his number");
        System.out.println("Input 9 to exit");
    }

    public static void main(String[] args) {

        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();
            switch (scanner.nextInt()) {
                case 1: {
                    menu.addCommodity();
                    break;
                }
                case 2: {
                    menu.removeCommodity();
                    break;
                }
                case 3: {
                    menu.replaceCommodity();
                    break;
                }
                case 4: {
                    menu.sortByName();
                    break;
                }
                case 5: {
                    menu.sortByLength();
                    break;
                }
                case 6: {
                    menu.sortByWidth();
                    break;
                }
                case 7: {
                    menu.sortByWeight();
                    break;
                }
                case 8: {
                    menu.getCommodity();
                    break;
                }
                case 9: {
                    System.exit(0);
                    break;
                }
            }
        }
    }
}
