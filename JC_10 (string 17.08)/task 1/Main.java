package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

        System.out.println("Input 5 index word: ");
        String word = scan.next();
//        String word = "someWords";
//        System.out.println(Arrays.toString(word.split("")));
//        System.out.println(Arrays.toString(word.toCharArray()));
//        System.out.println(word.charAt(0));

        

        if (word.length() == 5){
            String wordArray [] = word.split("");

            if ((wordArray[0].equalsIgnoreCase(wordArray[4])) && (wordArray[1].equalsIgnoreCase(wordArray[3]))) {
                System.out.println("POLINDROM");
            } else {
                System.out.println("NOT A POLINDROM");
            }

        } else{
            System.out.println("wrong word");
        }


    }
}
