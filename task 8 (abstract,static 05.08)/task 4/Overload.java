package com.company;

public class Overload {
    int age;
    int weight;
    int height;

    Overload(int age, int weight){
        this.age = age;
        this.weight = weight;
    }
    Overload(int age, int weight, int height){
        this(age, weight);
        this.height = height;
    }



}
