package com.company;

public class Main {

    public static void main(String[] args) {
        int tails = 0;
        int heads = 0;


        for (int i = 0; i < 10; i++)
        {
            int result = (int) (Math.random() * 2) ;
            if (result == 1) {
                heads ++;
            } else {
                tails ++;
            }
        }


        System.out.println("You flip a coin 10 times.\nNumber of heads: " + heads + "\nNumber of tails: " + tails);


    }
}
