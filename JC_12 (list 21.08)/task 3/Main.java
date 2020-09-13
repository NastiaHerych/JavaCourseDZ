package com.company;

public class Main {

    public static void main(String[] args) {
        ArrayList mylist= new ArrayList();

        System.out.println("List at the beginning:");
        System.out.println(mylist.toString());

        mylist.add("10");
        mylist.add("11");
        mylist.add("12");
        mylist.add("13");
        mylist.add("14");
        mylist.add("15");
        System.out.println("\nList with added 6 elements:");
        System.out.println(mylist.toString());

        mylist.add("20");
        System.out.println("\nList with added new element (20) :");
        System.out.println(mylist.toString());

        mylist.remove(2);
        mylist.remove(1);
        System.out.println("\nList with removed elements (with index 1 and 2)");
        System.out.println(mylist.toString());


        System.out.println(mylist.remove(3));
        System.out.println("\nList with removed element with index 3");
        System.out.println(mylist.toString());
    }
}
