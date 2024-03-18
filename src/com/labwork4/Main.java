package com.labwork4;

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
        IntArray intArray = new IntArray(new int[]{3, 2, 1, 5, 6, 4});
        System.out.println("Original array: " + intArray);

        intArray.sorter = new SortAsc();
        intArray.sort();
        System.out.println("Sorted array (ascending): " + intArray);

        intArray.sorter = new SortDesc();
        intArray.sort();
        System.out.println("Sorted array (descending): " + intArray);
    }
}