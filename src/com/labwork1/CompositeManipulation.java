package com.labwork1;

import java.util.ArrayList;
import java.util.List;

/**
 * Class implementing the Composite design pattern for com.labwork1.ImageManipulation
 */
public class CompositeManipulation implements ImageManipulation {
    /**
     * List of com.labwork1.ImageManipulation objects
     */
    List<ImageManipulation> imageManipulations = new ArrayList<>();

    /**
     * Adds an com.labwork1.ImageManipulation object to the list
     * @param imageManipulation The com.labwork1.ImageManipulation object to add
     */
    public void Add(ImageManipulation imageManipulation) {
        imageManipulations.add(imageManipulation);
    }

    /**
     * Removes an com.labwork1.ImageManipulation object from the list
     * @param imageManipulation The com.labwork1.ImageManipulation object to remove
     */
    public void Remove(ImageManipulation imageManipulation) {
        imageManipulations.remove(imageManipulation);
    }

    @Override
    public void resize(int width, int height) {
        for (ImageManipulation imageManipulation : imageManipulations) {
            imageManipulation.resize(width, height);
        }
    }

    @Override
    public void getPointColour(int x, int y) {
        for (ImageManipulation imageManipulation : imageManipulations) {
            imageManipulation.getPointColour(x, y);
        }
    }
}
