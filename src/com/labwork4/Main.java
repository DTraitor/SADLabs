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

        intArray.sort(array -> {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        });
        System.out.println("Sorted array (ascending): " + intArray);

        intArray.sort(array -> {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j] < array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        });
        System.out.println("Sorted array (descending): " + intArray);
    }
}