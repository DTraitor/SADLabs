import java.util.ArrayList;
import java.util.List;

/**
 * Class implementing the Composite design pattern for ImageManipulation
 */
public class CompositeManipulation implements ImageManipulation {
    /**
     * List of ImageManipulation objects
     */
    List<ImageManipulation> imageManipulations = new ArrayList<>();

    /**
     * Adds an ImageManipulation object to the list
     * @param imageManipulation The ImageManipulation object to add
     */
    public void Add(ImageManipulation imageManipulation) {
        imageManipulations.add(imageManipulation);
    }

    /**
     * Removes an ImageManipulation object from the list
     * @param imageManipulation The ImageManipulation object to remove
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
