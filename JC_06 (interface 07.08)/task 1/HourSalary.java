package com.company;

public class HourSalary implements Salary {

    private int monthHours;
    private double oneHour;

    public HourSalary (int monthHours, double oneHour) {
        this.monthHours = monthHours;
        this.oneHour = oneHour;

    }

    @Override
    public void salary(){
        double hsalary = this.monthHours * this.oneHour;
        System.out.println("One worker's salary (by hours): " + hsalary);
    }




}
