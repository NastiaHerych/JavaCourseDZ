package com.company;

import java.util.Comparator;

public class IntComparator implements Comparator<Class> {

    @Override
    public int compare(Class object1, Class object2) {
        if (object1.getInteger() > object2.getInteger()) {
            return 1;
        } else if (object1.getInteger() < object2.getInteger()) {
            return -1;
        }
        return 0;
    }
}
