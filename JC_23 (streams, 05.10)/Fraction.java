package com.company;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

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

    Supplier<Deputat> addDeputat = () -> {
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

        return new Deputat(surname, name, age, height, weight, bribeTaker);
    };

    Supplier<Deputat> getDeputy = () -> {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input surname:");
        String surname = scanner.next();
        System.out.println("Input name:");
        String name = scanner.next();

        return new Deputat(surname, name);
    };

    public void addDeputy() {
        Deputat deputy = addDeputat.get();

        if (deputy.isBribe()) {
            deputy.giveBribe();
        }
        allDeputatsArray.add(deputy);
        System.out.println("Deputy " + deputy.toString() + "was successfully added in fraction");
    }


    public void removeDeputat() {
            Deputat DeputyTyped = getDeputy.get();

            Predicate<Deputat> isEqualSurnameName = deputy -> deputy.getSurname().equalsIgnoreCase(DeputyTyped.getSurname()) && deputy.getName().equalsIgnoreCase(DeputyTyped.getName());
            Optional<Deputat> deputyFound = allDeputatsArray.stream().filter(isEqualSurnameName).findFirst();

            if (deputyFound.isPresent()) {
                allDeputatsArray.remove(deputyFound.get());
                System.out.println("Deputy " + deputyFound.get().toString() + " was successfully deleted from fraction");

            } else {
                System.out.println("Wrong name or surname");
            }
    }



    public void allBribeTakers() {
        System.out.println("All bribe takers: ");
        List<Deputat> bribeTakers = allDeputatsArray.stream().filter(Deputat::isBribe).collect(Collectors.toList());
        bribeTakers.forEach(System.out::println);
    }


    public void getLargestBribeTaker() {
        Comparator<Deputat> deputyBribeSizeComparator = (deputy1,
                                                        deputy2) -> (deputy1.getBribeSize() > deputy2.getBribeSize()) ? 1
                : (deputy1.getBribeSize() == deputy2.getBribeSize()) ? 0 : -1;
        Optional<Deputat> largestBribeTaker = allDeputatsArray.stream().filter(Deputat::isBribe)
                .max(deputyBribeSizeComparator);
        if (largestBribeTaker.isPresent()) {
            System.out.println("The Largest Bribe Taker: " + largestBribeTaker.get().toString());
        }
    }


    public void getAllDeputats() {
        System.out.println("This fraction deputat's: ");
        allDeputatsArray.forEach(System.out::println);
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
