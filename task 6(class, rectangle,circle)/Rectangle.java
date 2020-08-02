package com.company;

public class Rectangle {
    private int height;
    private int lenght;
    int Square;

    //Без параметрів
    public Rectangle(){
        this.height =10;
        this.lenght=10;
    }

    //Кастомний  з параметрами
    public Rectangle(int a, int b){
        this.height = a;
        this.lenght = b;
    }

    public int getArea(){
        int s;
        s=height*lenght;
        return s;
    }

    public int getPerum(){
        int p;
        p=(height+lenght)*2;
        return p;
    }


}