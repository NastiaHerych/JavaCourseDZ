package com.company;

public class MyThread extends Thread {

    int number;

    public MyThread (int number){
        this.number = number;
    }

    @Override
    public void run(){
        int n0 = 0;
        int n1 = 1;
        int n2;

        if (number < 1){
            System.out.println("Wrong number");
        } else if (number == 1){
            System.out.println(n0);
        }else {
            for (int i = 2; i <= number - 1; i++){
                n2 = n0 + n1;
                System.out.println( n2 + " ");
                n0 = n1;
                n1 = n2;
            }
            System.out.println();
        }
    }
}
