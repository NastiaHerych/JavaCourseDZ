package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Map<Integer, List<Integers>> map = new Map<>(5, new ArrayList<Integers>(Arrays.asList(new Integers("2"))));
        map.add(7, new ArrayList<Integers>(Arrays.asList(new Integers("3"))));
        map.add(9, new ArrayList<Integers>(Arrays.asList(new Integers("4"))));
        System.out.println("Map:");
        map.showMap();
        map.remove(7);
        System.out.println("Map with deleted key 7");
        map.showMap();
        map.removeFromValue(5);
        System.out.println("Map with deleted value 5");
        map.showMap();
        System.out.println("Set keys:");
        map.showSet();
        System.out.println("List values:");
        map.showList();
        System.out.println("Full map:");
        map.showMap();
        System.out.println();



        System.out.println("Map with objects type String");
        Map<String, Integer> map1 = new Map<>("5", 11);
        map1.add("6", 12);
        map1.add("7", 13);
        System.out.println("Map:");
        map1.showMap();
        map1.remove("5");
        System.out.println("Map with deleted key 5");
        map1.showMap();
        map1.removeFromValue("6");
        System.out.println("Map with deleted value 6");
        map1.showMap();
        System.out.println("Set keys:");
        map1.showSet();
        System.out.println("List values:");
        map1.showList();
        System.out.println("Full map:");
        map1.showMap();

    }

    public static class Integers {
        String integer;

        public Integers(String integer) {
            this.integer = integer;
        }

        public String getInteger() {
            return integer;
        }

        public void setInteger(String integer) {
            this.integer = integer;
        }

        @Override
        public String toString() {
            return integer;
        }


    }
}
