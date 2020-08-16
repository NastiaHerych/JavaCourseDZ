package com.company;

public class Methods {
    private static int a;
    private static int b;

    public Methods(int aa, int bb) {
        a = aa;
        b = bb;
    }

    static void except() throws MyException {
        if ((a < 0) && (b < 0)) {
            throw new IllegalArgumentException();
        }
        if (((a == 0) && (b != 0)) || ((a != 0) && (b == 0))) {
            throw new ArithmeticException();
        }
        if ((a == 0) && (b == 0)) {
            throw new IllegalArgumentException();
        }
        if ((a > 0) && (b > 0)) {
            throw new MyException("Wrong");
        }
    }

    public int plus() throws MyException {
        Methods.except();
        return a + b;
    }

    public int minus() throws MyException {
        Methods.except();
        return a - b;
    }

    public double multiply() throws MyException {
        Methods.except();
        return a * b;
    }

    public double divide() throws MyException {
        Methods.except();
        return a / b;
    }

    static void Result(double result) {
        System.out.println("Result: " + result);
    }


}
