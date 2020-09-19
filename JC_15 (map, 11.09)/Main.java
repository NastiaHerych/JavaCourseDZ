package com.company;
import java.util.Scanner;

public class Main {

    static void menu() {
        System.out.println();
        System.out.println("Input 1 to register new member");
        System.out.println("Input 2 to add an animal to member");
        System.out.println("Input 3 to delete an animal from member");
        System.out.println("Input 4 to delete a member");
        System.out.println("Input 5 to delete the type from all members");
        System.out.println("Input 6 to show zoo club");
        System.out.println("Input 7 to exit");
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();
            switch (scanner.nextInt()) {
                case 1: {
                    zoo.addZooMember();
                    break;
                }
                case 2: {
                    zoo.addAnimal();
                    break;
                }
                case 3: {
                    zoo.removeAnimal();
                    break;
                }
                case 4: {
                    zoo.removeZooMember();
                    break;
                }
                case 5: {
                    zoo.removeAnimalFromAllMembers();
                    break;
                }
                case 6: {
                    zoo.showZoo();
                    break;
                }
                case 7: {
                    System.exit(0);
                    break;
                }
            }
        }
    }
}
