package com.labwork4;

import java.util.Arrays;

/**
 * IntArray class
 * <p>
 * This class is used to store an array of integers and sort it using a custom sorting algorithm.
 */
public class IntArray {
    public final int[] array;
    public IntSorter sorter;

    /**
     * Constructor
     * @param array The array of integers
     */
    public IntArray(int[] array) {
        this.array = array;
    }

    /**
     * Sorts the array using a custom sorting algorithm
     */
    public void sort() {
        if(sorter == null){
            throw new IllegalStateException("No sorting algorithm provided");
        }
        sorter.sort(array);
    }

    /**
     * IntSorter interface
     * <p>
     * This interface is used to define a custom sorting algorithm.
     * Allows to pass a lambda expression to the sort method.
     */
    public interface IntSorter {
        /**
         * Sorts the array
         * @param array The array of integers
         */
        void sort(int[] array);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
