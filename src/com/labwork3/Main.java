package com.labwork3;

import java.util.Iterator;

/**
 * Main class
 * <p>
 * This class is used to test the CustomString class.
 */
public class Main {
    /**
     * The main method
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        LinList list = new LinList();
        list.add(1);
        list.add(4);
        list.add(8);
        list.add(2);

        System.out.println("Default iterator:");
        for (int i : list) {
            System.out.println(i);
        }

        System.out.println("Sorted iterator:");
        for (Iterator<Integer> it = list.sortedIterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}