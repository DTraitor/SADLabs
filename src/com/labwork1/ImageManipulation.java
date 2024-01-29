package com.labwork1;

/**
 * Interface for different image manipulations
 */
public interface ImageManipulation {
    /**
     * Resizes the image
     * @param width The new width of the image
     * @param height The new height of the image
     */
    public void resize(int width, int height);
    /**
     * Gets the colour of a point in the image
     * @param x The x coordinate of the point
     * @param y The y coordinate of the point
     */
    public void getPointColour(int x, int y);
}
