package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner Day = new Scanner(System.in);
        System.out.print("Який день?");
        int number = (int) Day.nextDouble();
        System.out.print("День:" );
        String dayString;
        switch (number) {
            case 1:  dayString = " Понеділок: 15:30-17:00 Logos";
                break;
            case 2:  dayString = " Вівторок: 18:00-19:00 Dance classes";
                break;
            case 3:  dayString = " Середа: 15:30-17:00 Logos";
                break;
            case 4:  dayString = " Четвер: 18:00-19:00 Dance classes";
                break;
            case 5:  dayString = " П'ятниця: 15:30-17:00 Logos";
                break;
            case 6:  dayString = " Субота: Cleaning day ";
                break;
            case 7:  dayString = " Неділя: free time";
                break;
            default: dayString = " Неправильно введений день";
                break;
        }

       System.out.print(dayString);

    }
}
