package com.labwork1;

/**
 * Class implementing the Decorator design pattern for ImageManipulation
 */
public class FrameDecorator extends ManipulationDecorator {
    /**
     * Constructor for com.labwork1.FrameDecorator
     * @param imageManipulation The ImageManipulation object to decorate
     */
    public FrameDecorator(ImageManipulation imageManipulation) {
        super(imageManipulation);
    }

    @Override
    public void resize(int width, int height) {
        imageManipulation.resize(width, height);
        System.out.println("Frame decorator resizing image");
    }

    @Override
    public void getPointColour(int x, int y) {
        imageManipulation.getPointColour(x, y);
        System.out.println("Frame decorator getting point colour");
    }

    /**
     * Adds a frame to the image
     * @param colour The colour of the frame
     */
    public void addFrame(String colour) {
        System.out.println("Adding frame of colour " + colour);
    }
}
