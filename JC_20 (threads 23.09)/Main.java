package com.company;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static int getFibonacci(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of Fibonacci :");
        int number = scanner.nextInt();
        return number;
    }

    public static void main(String[] args) {

        int number = getFibonacci();

        MyThread myThread = new MyThread(number);
        myThread.start();
        RunnableThread runnableThread = new RunnableThread(number);
        System.out.println();

        int number2 = getFibonacci();
        ExecutorService executorFTP = Executors.newFixedThreadPool(50);
        ExecutorService executorSTP = Executors.newScheduledThreadPool(50);

        executorFTP.execute( new Runnable() {
            @Override
            public void run() {
                Fibonacci.getFibonaccii(number2, true);
            }
        });
        executorSTP.execute( new Runnable() {
            @Override
            public void run() {
                Fibonacci.getFibonaccii(number2, false);
            }
        });
        executorFTP.shutdown();
        executorSTP.shutdown();
    }
}
