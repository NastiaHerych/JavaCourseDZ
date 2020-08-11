package com.company;

public class MonthlySalary implements Salary{

    private double monthSalary;

    public MonthlySalary (double monthSalary){
        this.monthSalary = monthSalary;
    }


    @Override
    public void salary(){
       double msalary = this.monthSalary;
        System.out.println("One worker's salary (by month): " + msalary);
    }
}
