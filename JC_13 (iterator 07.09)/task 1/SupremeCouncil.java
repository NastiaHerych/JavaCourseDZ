package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SupremeCouncil {
    private static SupremeCouncil result = new SupremeCouncil();

    public static SupremeCouncil getResult() {
        if (result == null) {
            result = new SupremeCouncil();
        }
        return result;
    }

    static boolean isFractionExists(ArrayList<Fraction> supremeCouncilArray, String deputatName) {
        boolean flag = false;
        for (Fraction fraction : supremeCouncilArray) {
            if (fraction.getDeputatName().equalsIgnoreCase(deputatName)) {
                flag = true;
            }
        }
        return flag;
    }


    ArrayList<Fraction> supremeCouncilArray = new ArrayList<Fraction>();


    public void addFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of fraction: ");
        String deputatName = scanner.next();

        Fraction deputyGroup = new Fraction(deputatName);

        supremeCouncilArray.add(deputyGroup);
        System.out.println(deputyGroup.toString() + " was successfully added in Council");
    }


    public void removeFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of fraction: ");
        String FractionName = scanner.next();
        boolean type = isFractionExists(supremeCouncilArray, FractionName);
        if (type) {
            Iterator<Fraction> iterator = supremeCouncilArray.iterator();
            while (iterator.hasNext()) {
                Fraction nextFraction = iterator.next();
                if (nextFraction.getDeputatName().equalsIgnoreCase(FractionName)) {
                    iterator.remove();
                    System.out.println(nextFraction.toString() + "was successfully removed from Council");
                }
            }
        } else {
            System.out.println("Wrong fraction");
        }
    }


    public void getAllFractions() {
        System.out.println("All fractions in council: ");
        for (Fraction Fraction : supremeCouncilArray) {
            System.out.println(Fraction.toString());
        }
    }


    public void getFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input specific fraction: ");
        String FractionName = scanner.next();
        for (Fraction Fraction : supremeCouncilArray) {
            if (Fraction.getDeputatName().equalsIgnoreCase(FractionName)) {
                System.out.println(Fraction.toString());
                Fraction.getAllDeputats();
            }
        }
    }


    public void addDeputyToFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of fraction: ");
        String FractionName = scanner.next();
        boolean type = isFractionExists(supremeCouncilArray, FractionName);
        if (type) {
            for (Fraction Fraction : supremeCouncilArray) {
                if (Fraction.getDeputatName().equalsIgnoreCase(FractionName)) {
                    Fraction.addDeputat();
                }
            }
        } else {
            System.out.println("Wrong fraction");
        }
    }


    public void removeDeputyFromFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of fraction: ");
        String FractionName = scanner.next();
        boolean typeCorrect = isFractionExists(supremeCouncilArray, FractionName);
        if (typeCorrect) {
            for (Fraction Fraction : supremeCouncilArray) {
                if (Fraction.getDeputatName().equalsIgnoreCase(FractionName)) {
                    Fraction.removeDeputat();
                }
            }
        } else {
            System.out.println("Wrong fraction");
        }
    }


    public void getBribeTakersFromFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of fraction: ");
        String FractionName = scanner.next();
        boolean type = isFractionExists(supremeCouncilArray, FractionName);
        if (type) {
            for (Fraction Fraction : supremeCouncilArray) {
                if (Fraction.getDeputatName().equalsIgnoreCase(FractionName)) {
                    Fraction.allBribeTakers();
                }
            }
        }
    }


    public void getLargestBribeTakerFromFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of fraction: ");
        String FractionName = scanner.next();
        boolean type = isFractionExists(supremeCouncilArray, FractionName);
        if (type) {
            for (Fraction Fraction : supremeCouncilArray) {
                if (Fraction.getDeputatName().equalsIgnoreCase(FractionName)) {
                    Fraction.getLargestBribeTaker();
                }
            }
        }
    }


    public void getAllDeputiesFromFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of fraction: ");
        String FractionName = scanner.next();
        boolean type = isFractionExists(supremeCouncilArray, FractionName);
        if (type) {
            for (Fraction Fraction : supremeCouncilArray) {
                if (Fraction.getDeputatName().equalsIgnoreCase(FractionName)) {
                    Fraction.getAllDeputats();
                    ;
                }
            }
        }
    }


    public void clearFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of fraction: ");
        String FractionName = scanner.next();
        boolean type = isFractionExists(supremeCouncilArray, FractionName);
        if (type) {
            for (Fraction Fraction : supremeCouncilArray) {
                if (Fraction.getDeputatName().equalsIgnoreCase(FractionName)) {
                    Fraction.clearFraction();
                }
            }
        }
    }
}

