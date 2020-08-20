package com.company;
import java.util.Scanner;

public class Main {

    static String replaceLetters(String text) {

        char textArray[] = text.toCharArray();
        char replaceArray[] = { 'а', 'о', 'є', 'и', 'у', 'і', 'ї', 'е', 'ю', 'я', 'А', 'О', 'Є', 'И', 'У', 'І', 'Е', 'Ї', 'Ю', 'Я' };

        for (int i = 0; i < textArray.length; i++) {

            for (int j = 0; j < replaceArray.length; j++) {

                if (textArray[i] == replaceArray[j]) {
                    textArray[i] = '-';
                }
            }
        }

        String result = new String(textArray);
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Input some text: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println("Replaced text: ");
        System.out.println(replaceLetters(text));
    }


}
