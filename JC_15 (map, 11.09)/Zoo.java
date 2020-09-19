package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Zoo {
    Map<Person, ArrayList<Animal>> zoo = new HashMap<Person, ArrayList<Animal>>();


    static boolean isZooMemberExists(Map<Person, ArrayList<Animal>> zooClub, String name, int age) {
        boolean flag = false;
        Set<Entry<Person, ArrayList<Animal>>> zooClubMembers = zooClub.entrySet();
        for (Entry<Person, ArrayList<Animal>> entry : zooClubMembers) {
            if (entry.getKey().getName().equalsIgnoreCase(name) && entry.getKey().getAge() == age) {
                flag = true;
            }
        }
        return flag;
    }

    static boolean isZooMemberAnimalExists(Map<Person, ArrayList<Animal>> zooClub, String name, int age, String type, String animalName) {
        boolean flag = false;
        Iterator<Entry<Person, ArrayList<Animal>>> iterator = zooClub.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<Person, ArrayList<Animal>> nextMember = iterator.next();
            if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
                ArrayList<Animal> animalList = nextMember.getValue();
                Iterator<Animal> iterator2 = animalList.iterator();
                while (iterator2.hasNext()) {
                    Animal next2 = iterator2.next();
                    if (next2.getType().equalsIgnoreCase(type) && next2.getName().equalsIgnoreCase(animalName)) {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }



    public void addZooMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = scanner.next();
        System.out.println("Input age: ");
        int age = scanner.nextInt();

        Person zooMember = new Person(name, age);
        zoo.put(zooMember, new ArrayList<Animal>());
        System.out.println(zooMember.toString() + " was successfully added");
    }


    public void addAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input person`s name: ");
        String name = scanner.next();
        System.out.println("Input person`s age: ");
        int age = scanner.nextInt();

        boolean bool = isZooMemberExists(zoo, name, age);

        if (bool) {
            System.out.println("Input animal: ");
            String type = scanner.next();
            System.out.println("Введите animal`s name: ");
            String animalName = scanner.next();

            Animal newAnimal = new Animal(type, animalName);
            Iterator<Entry<Person, ArrayList<Animal>>> iterator = zoo.entrySet().iterator();
            while (iterator.hasNext()) {
                Entry<Person, ArrayList<Animal>> nextMember = iterator.next();
                if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
                    ArrayList<Animal> animalList = nextMember.getValue();
                    animalList.add(newAnimal);
                    System.out.println("Animal " + newAnimal.toString() + " was added to member " + nextMember.getKey() );
                }
            }
        }
    }


    public void removeAnimal() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input person`s name: ");
        String name = scanner.next();
        System.out.println("Input person`s age: ");
        int age = scanner.nextInt();

        boolean boool = isZooMemberExists(zoo, name, age);
        if (boool) {
            System.out.println("Input animal: ");
            String type = scanner.next();
            System.out.println("Input animal`s name: ");
            String animalName = scanner.next();

            boolean typeAnimalCorrect = isZooMemberAnimalExists(zoo, name, age, type, animalName);
            if (typeAnimalCorrect) {
                Iterator<Entry<Person, ArrayList<Animal>>> iterator = zoo.entrySet().iterator();
                while (iterator.hasNext()) {
                    Entry<Person, ArrayList<Animal>> nextMember = iterator.next();
                    if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
                        ArrayList<Animal> animalList = nextMember.getValue();
                        Iterator<Animal> iterator2 = animalList.iterator();
                        while (iterator2.hasNext()) {
                            Animal next2 = iterator2.next();
                            if (next2.getType().equalsIgnoreCase(type)
                                    && next2.getName().equalsIgnoreCase(animalName)) {
                                iterator2.remove();
                                System.out.println("Animal " + next2.toString() + " was deleted from " + nextMember.getKey() );
                            }
                        }
                    }
                }
            } else {
                System.out.println("Wrong animal");
            }
        } else {
            System.out.println("Wrong member");
        }
    }


    public void removeZooMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input person`s name: ");
        String name = scanner.next();
        System.out.println("Input person`s age: ");
        int age = scanner.nextInt();

        boolean booool = isZooMemberExists(zoo, name, age);
        if (booool) {
            Iterator<Entry<Person, ArrayList<Animal>>> iterator = zoo.entrySet().iterator();
            while (iterator.hasNext()) {
                Entry<Person, ArrayList<Animal>> nextMember = iterator.next();
                if (nextMember.getKey().getName().equalsIgnoreCase(name) && nextMember.getKey().getAge() == age) {
                    iterator.remove();
                    System.out.println("Member " + nextMember.getKey().toString() + " was deleted");
                }
            }
        } else {
            System.out.println("Wrong member");
        }
    }


    public void removeAnimalFromAllMembers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input animal: ");
        String type = scanner.next();
        System.out.println("Input animal`s name: ");
        String animalName = scanner.next();

        Iterator<Entry<Person, ArrayList<Animal>>> iterator = zoo.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<Person, ArrayList<Animal>> nextMember = iterator.next();
            ArrayList<Animal> animalList = nextMember.getValue();
            Iterator<Animal> iterator2 = animalList.iterator();
            while (iterator2.hasNext()) {
                Animal next2 = iterator2.next();
                if (next2.getType().equalsIgnoreCase(type)) {
                    iterator2.remove();
                    System.out.println("Animal " + next2.toString() + " was deleted ");
                }
            }
        }
    }


    public void showZoo() {
        Set<Entry<Person, ArrayList<Animal>>> zooClubMembers = zoo.entrySet();
        System.out.println("Zoo Club:");
        for (Entry<Person, ArrayList<Animal>> entry : zooClubMembers) {
            System.out.println(entry.getKey() + " has " + entry.getValue());
        }
    }

}
