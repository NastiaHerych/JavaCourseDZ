package com.company;

import java.util.Comparator;

public class LenghtComp implements Comparator <Commodity> {

    @Override
    public int compare(Commodity object1, Commodity object2) {
        if (object1.getLength() > object2.getLength()) {
            return 1;
        } else if (object1.getLength() < object2.getLength()) {
            return -1;
        }
        return 0;
    }
}
