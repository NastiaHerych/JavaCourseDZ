package com.company;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {

        System.out.println(" HashSet, get element in random order:");
        Set<Class> cl = new HashSet<Class>();
        cl.add(new Class("Nastia  ",40));
        cl.add(new Class("Andrian ",20));
        cl.add(new Class("Andriy  ",50));
        cl.add(new Class("Markiyan",10));
        cl.add(new Class("Anton   ",30));

       for (Class classItem : cl){
           System.out.println(classItem);
       }

        System.out.println();
        System.out.println(" TreeSet, get element in order from Comparator");
        Set<Class> cl1 = new TreeSet<Class>(new IntComparator());
        cl1.add(new Class("Nastia  ", 40));
        cl1.add(new Class("Andrian ", 20));
        cl1.add(new Class("Andriy  ", 50));
        cl1.add(new Class("Markiyan", 10));
        cl1.add(new Class("Anton   ", 30));

        for (Class classItem : cl1) {
            System.out.println(classItem);
        }

        System.out.println();
        System.out.println(" LinkedHashSet, get element in order of their adding: ");
        Set<Class> cl2 = new LinkedHashSet<Class>();
        cl2.add(new Class("Nastia  ",40));
        cl2.add(new Class("Andrian ",20));
        cl2.add(new Class("Andriy  ",50));
        cl2.add(new Class("Markiyan",10));
        cl2.add(new Class("Anton   ",30));

        for (Class classItem : cl2){
            System.out.println(classItem);
        }


    }
}
