package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input text: ");

        String text = scanner.nextLine();

        System.out.println("Number of words: " + numberOfWords(text));
        System.out.println("Number of sentences: " + numberOfSentences(text));


    }

    static int numberOfWords(String text) {

        String textArray[] = text.split(" ");
        int number = 0;

        for (int i = 0; i < textArray.length; i++) {

            if (textArray[i].length() > 1) {
                number++;
            }
        }
        return number;
    }


    static int numberOfSentences(String text) {

        String textArray[] = text.split("[.!?]");
        int number = 0;

        for (int i = 0; i < textArray.length; i++) {

            if (textArray[i].length() > 1) {
                number++;
            }
        }
        return number;
    }

}
