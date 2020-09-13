package com.company;

import java.util.Arrays;

public class ArrayList {

    private int size;
    private String[] element;


    public ArrayList() {
        this.size = 5;
        this.element = new String[this.size];
    }


    public void add(String value) {
        int dataSize = 0;
        for (int i = 0; i < element.length; i++) {
            if (element[i] != null) {
                dataSize++;
            }
        }
        if ((dataSize + 1) > element.length) {
            String[] newElementData = new String[(element.length * 3) / 2 + 1];
            for (int i = 0; i < element.length; i++) {
                newElementData[i] = element[i];
            }
            element = newElementData;
            size = newElementData.length;
        }
        element[dataSize++] = value;
    }


    public String remove(int index) {
        String removedValue = element[index];
        String[] newElementData = new String[element.length - 1];
        for (int i = 0; i < index; i++) {
            newElementData[i] = element[i];
        }
        for (int i = index; i < element.length - 1; i++) {
            newElementData[i] = element[i + 1];
        }
        element = newElementData;
        size = newElementData.length;
        return removedValue;
    }


    @Override
    public String toString() {
        return "MyArrayList: elements: " + Arrays.toString(element) + ", size: " + size ;
    }
}
