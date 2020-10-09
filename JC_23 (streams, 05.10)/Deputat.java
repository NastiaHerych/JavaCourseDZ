package com.company;
import java.util.Scanner;
import java.util.function.Supplier;

public class Deputat extends Human{

    private String name;
    private String surname;
    private int age;
    private boolean bribe;
    private int bribeSize;

    public Deputat(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public Deputat(String surname, String name, int age, int height, int weight, boolean bribe) {
        super(weight, height);
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.bribe = bribe;
    }

    Supplier<Integer> getBribeAmount = () -> {
        Scanner scanner = new Scanner(System.in);
        int bribeAmount = scanner.nextInt();
        return bribeAmount;
    };



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBribe(){
        return bribe;
    }

    public int getBribeSize() {
        return bribeSize;
    }

    public void setBribeSize(int bribeSize) {
        this.bribeSize = bribeSize;
    }


    public String ifBribeTaker(){
        if (this.bribe){
            return "Briber";
        }else{
            return "Honest person";
        }
    }

    public void giveBribe() {
        if (this.bribe == false) {
            System.out.println("This deputat isn`t a briber");
        }
        if (this.bribe == true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input the number of bribe:");
            int bribeSize = scan.nextInt();

            if (bribeSize > 5000) {
                System.out.println("This deputat is going to be arrested!");
            } else {
                this.bribeSize = bribeSize;
            }
        }
    }

    @Override
    public String toString() {
        return surname + " " + name + ", " + age +
                " age, height: " + super.getHeight() +
                " cm, weight: " + super.getWeight()
                + " kg, " + ifBribeTaker() + " ";
    }

}