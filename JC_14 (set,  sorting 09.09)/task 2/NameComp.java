package com.company;

import java.util.Comparator;

public class NameComp  implements Comparator<Commodity> {

    @Override
    public int compare(Commodity object1, Commodity object2) {
        if (object1.getName().compareTo(object2.getName()) > 0 ) {
            return 1;
        } else if (object1.getName().compareTo(object2.getName()) < 0 ) {
            return -1;
        }
        return 0;
    }
}
