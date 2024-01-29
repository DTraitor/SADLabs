package com.labwork1;

/**
 * Primitive class implementing the ImageManipulation interface
 */
public class PrimitiveManipulation implements ImageManipulation {
    /**
     * The name of the file with the image
     */
    private String fileName;

    /**
     * Constructor for com.labwork1.PrimitiveManipulation
     * @param fileName The name of the file with the image
     */
    public PrimitiveManipulation(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void resize(int width, int height) {
        System.out.println("Resizing " + fileName + " to " + width + "x" + height);
    }

    @Override
    public void getPointColour(int x, int y) {
        System.out.println("Getting colour of point (" + x + "," + y + ") in " + fileName);
    }
}
