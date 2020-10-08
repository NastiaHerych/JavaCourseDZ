package com.company;
import java.util.function.Predicate;

public class Main {

    public static void throww() {
        int throwResult = (int) (Math.random() * 2);
        check(throwResult, n -> n == 1);
    }

    public static void check(int throwResult, Predicate<Integer> predicate) {
        if (predicate.test(throwResult)) {
            System.out.println("Орел");
        } else
            System.out.println("Решка");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            throww();
        }
    }
}
