package com.company;

public class Main {

    public static void main(String[] args) {

        HourSalary hourSalary = new HourSalary(87, 100);
        MonthlySalary monthlySalary = new MonthlySalary(7000);

        hourSalary.salary();
        monthlySalary.salary();

    }
}
