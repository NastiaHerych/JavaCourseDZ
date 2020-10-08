package com.company;

public class RunnableThread implements Runnable {
    int number;

    public RunnableThread (int number){
        this.number = number;
    }

    @Override
    public void run() {
        int n0 = 0;
        int n1 = 1;
        int n2;

        if (number < 1){
            System.out.println("Wrong number");
        } else if (number == 1){
            System.out.println(n0);
        }else {
            Integer[] fib = new Integer[number];
            fib[0] = n0;
            fib[1] = n1;
            System.out.print("Fibonacci numbers in descending order: ");
            for (int i = 2; i < fib.length; i++) {
                n2 = n0 + n1;
                fib[i] = n2;
                n0 = n1;
                n1 = n2;
            }

            for (int i = fib.length - 1; i >= 2; i--) {
                System.out.print(fib[i] + " ");
            }
            System.out.print(fib[1] + " " + fib[0]);
            System.out.println();
        }
    }
}
