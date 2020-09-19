package com.company;

import java.util.Comparator;

public class WidthComp implements Comparator <Commodity> {

    @Override
    public int compare(Commodity object1, Commodity object2) {
        if (object1.getWidth() > object2.getWidth()) {
            return 1;
        } else if (object1.getWidth() < object2.getWidth()) {
            return -1;
        }
        return 0;
    }


}
