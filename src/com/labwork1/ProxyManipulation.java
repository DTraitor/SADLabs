package com.labwork1;

/**
 * Class implementing the Proxy design pattern for com.labwork1.ImageManipulation
 */
public class ProxyManipulation implements ImageManipulation{
    /**
     * The com.labwork1.ImageManipulation object to decorate.
     * This is only created when needed.
     */
    private ImageManipulation imageManipulation;
    /**
     * The name of the file with the image
     */
    private String fileName;

    /**
     * Constructor for com.labwork1.ProxyManipulation
     * @param fileName The name of the file with the image
     */
    public ProxyManipulation(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void resize(int width, int height) {
        if (imageManipulation == null) {
            imageManipulation = new PrimitiveManipulation(fileName);
        }
        imageManipulation.resize(width, height);
    }
    @Override
    public void getPointColour(int x, int y) {
        if (imageManipulation == null) {
            imageManipulation = new PrimitiveManipulation(fileName);
        }
        imageManipulation.getPointColour(x, y);
    }
}
