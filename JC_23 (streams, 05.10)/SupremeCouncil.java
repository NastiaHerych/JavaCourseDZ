package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupremeCouncil {
    private static SupremeCouncil result = new SupremeCouncil();

    private SupremeCouncil() {
    }

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

    Supplier<Fraction> getFraction = () ->{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name of fraction: ");
        String fractionName = scanner.next();
        return new Fraction(fractionName);
    };

    public Optional<Fraction> findFraction(){
        Fraction fractionTyped = getFraction.get();
        Predicate<Fraction> isEqualDeputyGroupName = Fraction -> Fraction.getDeputatName().equalsIgnoreCase(fractionTyped.getDeputatName());
        Optional<Fraction> deputyGroupFound = supremeCouncilArray.stream().filter(isEqualDeputyGroupName).findFirst();
        return deputyGroupFound;
    };

    public void addFraction() {

        Fraction deputyGroup = getFraction.get();
        supremeCouncilArray.add(deputyGroup);
        System.out.println(deputyGroup.toString() + " was successfully added in Council");
    }


    public void removeFraction() {
        Optional<Fraction> deputyGroupFound = findFraction();
        if (deputyGroupFound.isPresent()) {
            supremeCouncilArray.remove(deputyGroupFound.get());
            System.out.println(deputyGroupFound.get().toString() + "was successfully removed from Council");
        } else {
            System.out.println("Wrong fraction");
        }
    }


    public void getAllFractions() {
        System.out.println("All fractions in council: ");
        supremeCouncilArray.forEach(System.out::println);
    }


    public void getFraction() {
        Optional<Fraction> deputyGroupFound = findFraction();
        if (deputyGroupFound.isPresent()) {
            System.out.println(deputyGroupFound.get().toString());
            deputyGroupFound.get().getAllDeputats();
        }
    }


    public void addDeputyToFraction() {
        Optional<Fraction> deputyGroupFound = findFraction();
        if (deputyGroupFound.isPresent()) {
            deputyGroupFound.get().addDeputy();
        } else {
            System.out.println("Wrong fraction");
        }
    }


    public void removeDeputyFromFraction() {
        Optional<Fraction> deputyGroupFound = findFraction();
        if (deputyGroupFound.isPresent()) {
            deputyGroupFound.get().removeDeputat();
        } else {
            System.out.println("Wrong fraction");
        }
    }


    public void getBribeTakersFromFraction() {
        Optional<Fraction> deputyGroupFound = findFraction();
        if (deputyGroupFound.isPresent()) {
            deputyGroupFound.get().allBribeTakers();
        } else {
            System.out.println("Wrong fraction");
        }
    }


    public void getLargestBribeTakerFromFraction() {
        Optional<Fraction> deputyGroupFound = findFraction();
        if (deputyGroupFound.isPresent()) {
            deputyGroupFound.get().getLargestBribeTaker();
        } else {
            System.out.println("Wrong fraction");
        }
    }


    public void getAllDeputiesFromFraction() {
        Optional<Fraction> deputyGroupFound = findFraction();
        if (deputyGroupFound.isPresent()) {
            deputyGroupFound.get().getAllDeputats();
        } else {
            System.out.println("Wrong fraction");
        }
    }


    public void clearFraction() {
        Optional<Fraction> deputyGroupFound = findFraction();
        if (deputyGroupFound.isPresent()) {
            deputyGroupFound.get().clearFraction();
        } else {
            System.out.println("Wrong fraction");
        }
    }
}
