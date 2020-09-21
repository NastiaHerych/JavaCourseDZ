package com.company;

public class Main {

    public static void main(String[] args) {
        Integer[] array = { 54, 7, 5, 34, -8, 55, 1, 0};
        System.out.println("Array : 54, 7, 5, 34, -8, 55, 1, 0");

        Collection collection = new Collection(array);


        Iterator firstIterator = collection.createFirstIterator();
        System.out.println("Array from beginning to end, replacing odd elements with null:");
        while (firstIterator.hasNext()) {
            Integer next = firstIterator.next();
            if (next % 2 != 0) {
                System.out.println("null");
            } else
                System.out.println(next);
        }
        System.out.println();

        

        System.out.println("Array from end to beginning, missing elements");
        Iterator endIterator = collection.createEndIterator();
        while (endIterator.hasNext()) {
            Integer next = endIterator.next();
            System.out.println(next);
        }
        System.out.println();



        System.out.println("Every third element from end to beginning");
        Iterator Anonymousiterator = collection.createAnonymousIterator();
        int i = 1;
        while (Anonymousiterator.hasNext()) {
            Integer next = Anonymousiterator.next();
            if (i % 3 == 0) {
                if (next % 2 != 0) {
                    System.out.println(next);
                }
            }
            i++;
        }
        System.out.println();



        System.out.println("Every 5 element -100 from beginning to end");
        Iterator LocalIterator = collection.createLocalIterator();
        int j = 1;
        while (LocalIterator.hasNext()) {
            Integer next = LocalIterator.next();
            if (j % 5 == 0) {
                if (next % 2 == 0) {
                    System.out.println(next - 100);
                }
            }
            j++;
        }
        System.out.println();



        System.out.println("Replace every second parne on neparne from beginning to end");
        Iterator iteratorStatic = Collection.createStaticIterator();
        int k = 1;
        while (iteratorStatic.hasNext()) {
            Integer next = iteratorStatic.next();
            if (k % 2 == 0) {
                if (next % 2 == 0) {
                    System.out.println(next + 1);
                }
            }
            k++;
        }

    }
}
