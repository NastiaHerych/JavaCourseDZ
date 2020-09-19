package com.company;

import java.util.Comparator;

public class WeightComp  implements Comparator<Commodity> {

    @Override
    public int compare(Commodity object1, Commodity object2) {
        if (object1.getWeight() > object2.getWeight()) {
            return 1;
        } else if (object1.getWeight() < object2.getWeight()) {
            return -1;
        }
        return 0;
    }
}
