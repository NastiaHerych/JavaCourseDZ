package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Menu {

    ArrayList<Commodity> menu = new ArrayList<Commodity>();

    static boolean isCommodityExists(ArrayList<Commodity> shelf, String name, int length, int width, int weight) {
        boolean flag = false;

        for (Commodity commodity : shelf) {
            if (commodity.getName().equalsIgnoreCase(name) && commodity.getLength() == length
                    && commodity.getWidth() == width && commodity.getWeight() == weight) {
                flag = true;
            }
        }

        return flag;
    }

    public void addCommodity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = scanner.next();
        System.out.println("Input lenght: ");
        int length = scanner.nextInt();
        System.out.println("Input width: ");
        int width = scanner.nextInt();
        System.out.println("Input weight: ");
        int weight = scanner.nextInt();


        Commodity commodity = new Commodity(name, length, width, weight);
        menu.add(commodity);
        System.out.println("Commodity " + commodity.toString() + " was successfully added");
    }


    public void removeCommodity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = scanner.next();
        System.out.println("Input lenght: ");
        int length = scanner.nextInt();
        System.out.println("Input width: ");
        int width = scanner.nextInt();
        System.out.println("Input weight: ");
        int weight = scanner.nextInt();


        boolean one = isCommodityExists(menu, name, length, width, weight);
        if (one) {
            Iterator<Commodity> iterator = menu.iterator();
            while (iterator.hasNext()) {
                Commodity nextCommodity = iterator.next();
                if (nextCommodity.getName().equalsIgnoreCase(name) && nextCommodity.getLength() == length
                        && nextCommodity.getWidth() == width && nextCommodity.getWeight() == weight) {
                    iterator.remove();
                    System.out.println("Commodity " + nextCommodity.toString() + "  was successfully deleted");
                }
            }
        } else {
            System.out.println("Wrong commodity");
        }
    }

    public void replaceCommodity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = scanner.next();
        System.out.println("Input lenght: ");
        int length = scanner.nextInt();
        System.out.println("Input width: ");
        int width = scanner.nextInt();
        System.out.println("Input weight: ");
        int weight = scanner.nextInt();

        boolean typeCorrect = isCommodityExists(menu, name, length, width, weight);

        if (typeCorrect) {
            for (Commodity commodity : menu) {
                if (commodity.getName().equalsIgnoreCase(name) && commodity.getLength() == length
                        && commodity.getWidth() == width && commodity.getWeight() == weight) {
                    System.out.println("Input new name: ");
                    String newName = scanner.next();
                    System.out.println("Input new lenght: ");
                    int newLength = scanner.nextInt();
                    System.out.println("Input new width: ");
                    int newWidth = scanner.nextInt();
                    System.out.println("Input new weight: ");
                    int newWeight = scanner.nextInt();
                    commodity.setName(newName);
                    commodity.setLength(newLength);
                    commodity.setWidth(newWidth);
                    commodity.setWeight(newWeight);
                    System.out.println("Commodity was successfully replaced " + commodity.toString() );
                }
            }
        } else {
            System.out.println("Wrong commodity");
        }
    }


    public void sortByName() {
        System.out.println("Before sorting: ");
        for (Commodity commodity : menu) {
            System.out.println(commodity);
        }
        Collections.sort(menu, new NameComp());
        System.out.println("After sorting: ");
        for (Commodity commodity : menu) {
            System.out.println(commodity);
        }
    }


    public void sortByLength() {
        System.out.println("Before sorting: ");
        for (Commodity commodity : menu) {
            System.out.println(commodity);
        }
        Collections.sort(menu, new LenghtComp());
        System.out.println("After sorting: ");
        for (Commodity commodity : menu) {
            System.out.println(commodity);
        }
    }


    public void sortByWidth() {
        System.out.println("Before sorting: ");
        for (Commodity commodity : menu) {
            System.out.println(commodity);
        }
        Collections.sort(menu, new WidthComp());
        System.out.println("After sorting: ");
        for (Commodity commodity : menu) {
            System.out.println(commodity);
        }
    }


    public void sortByWeight() {
        System.out.println("Before sorting: ");
        for (Commodity commodity : menu) {
            System.out.println(commodity);
        }
        Collections.sort(menu, new WeightComp());
        System.out.println("After sorting: ");
        for (Commodity commodity : menu) {
            System.out.println(commodity);
        }
    }


    public void getCommodity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number:");
        int i = scanner.nextInt();
        if (i < 0 || i > (menu.size() - 1)) {
            System.out.println("wrong commodity");
        } else {
            System.out.println("In number " + i + " is " + menu.get(i).toString());
        }
    }
}