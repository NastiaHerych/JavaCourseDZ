package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Fraction {

    private String deputatName;

    public Fraction(String deputatName) {
        this.deputatName = deputatName;
    }

    public String getDeputatName() {
        return deputatName;
    }

    public void setDeputatName(String deputatName) {
        this.deputatName = deputatName;
    }


    static boolean isDeputyExists(ArrayList<Deputat> deputyGroupArray, String surname, String name) {
        boolean flag = false;
        for (Deputat deputy : deputyGroupArray) {
            if (deputy.getSurname().equalsIgnoreCase(surname) && deputy.getName().equalsIgnoreCase(name)) {
                flag = true;
            }
        }
        return flag;
    }


    ArrayList<Deputat> allDeputatsArray = new ArrayList<Deputat>();

    public void addDeputat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input surname:");
        String surname = scanner.next();
        System.out.println("Input name:");
        String name = scanner.next();
        System.out.println("Input age:");
        int age = scanner.nextInt();
        System.out.println("Input height:");
        int height = scanner.nextInt();
        System.out.println("Input weight:");
        int weight = scanner.nextInt();
        System.out.println("Is deputat a bribetaker? (true/false):");
        boolean bribeTaker = scanner.nextBoolean();


        Deputat deputy = new Deputat(surname, name, age, height, weight, bribeTaker);

        if (deputy.isBribe()) {
            deputy.giveBribe();
        }
        allDeputatsArray.add(deputy);
        System.out.println("Deputy " + deputy.toString() + "was successfully added in fraction");

    }


    public void removeDeputat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input surname: ");
        String surname = scanner.next();
        System.out.println("Input name: ");
        String name = scanner.next();

        boolean type = isDeputyExists(allDeputatsArray, surname, name);
        if (type) {
            Iterator<Deputat> iterator = allDeputatsArray.iterator();
            while (iterator.hasNext()) {
                Deputat nextDeputy = iterator.next();
                if (nextDeputy.getSurname().equalsIgnoreCase(surname) && nextDeputy.getName().equalsIgnoreCase(name)) {
                    iterator.remove();
                    System.out.println("Deputy " + nextDeputy.toString() + " was successfully deleted from fraction");
                }
            }
        } else {
            System.out.println("Wrong name or surname");
        }
    }


    public void allBribeTakers() {
        System.out.println("All bribe takers: ");
        for (Deputat deputy : allDeputatsArray) {
            if (deputy.isBribe()) {
                System.out.println(deputy.toString());
            }
        }
    }


    public void getLargestBribeTaker() {
        int bribeSize = 0;
        int deputyIndex = -1;

        for (int i = 0; i < allDeputatsArray.size(); i++) {
            if (allDeputatsArray.get(i).isBribe()) {
                if (allDeputatsArray.get(i).getBribeSize() > bribeSize) {
                    bribeSize = allDeputatsArray.get(i).getBribeSize();
                    deputyIndex = allDeputatsArray.indexOf(allDeputatsArray.get(i));
                }
            }
        }
        if (deputyIndex >= 0) {
            System.out.println("The Largest Bribe Taker: " + allDeputatsArray.get(deputyIndex).toString());
        }
    }


    public void getAllDeputats() {
        System.out.println("This fraction deputat's: ");
        for (Deputat deputy : allDeputatsArray) {
            System.out.println(deputy.toString());
        }
    }


    public void clearFraction() {
        allDeputatsArray.clear();
        System.out.println("The fraction was cleared");
    }

    @Override
    public String toString() {
        return "Fraction: \"" + deputatName + "\"";
    }


}