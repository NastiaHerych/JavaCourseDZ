package com.company;

public class Main {

    public static void main(String[] args) {
        Pett cow = () -> "Мууу... Я - корова";
        Pett cat = () -> "Мяууу... Я - кіт";
        Pett dog = () -> "Гав-гав... Я - пес";

        voice(cow.voice(), "Cow");
        voice(cat.voice(), "Cat");
        voice(dog.voice(), "Dog");
    }

    public static void voice(String voice, String name) {
        System.out.println(voice + " " + name + "!");
    }

}
