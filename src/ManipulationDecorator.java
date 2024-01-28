/**
 * Abstract class for the decorator design pattern.
 */
public abstract class ManipulationDecorator implements ImageManipulation {
    /**
     * The ImageManipulation object to decorate
     */
    protected ImageManipulation imageManipulation;

    /**
     * Constructor for ManipulationDecorator
     * @param imageManipulation The ImageManipulation object to decorate
     */
    public ManipulationDecorator(ImageManipulation imageManipulation) {
        this.imageManipulation = imageManipulation;
    }

    @Override
    public void resize(int width, int height) {
        imageManipulation.resize(width, height);
    }

    @Override
    public void getPointColour(int x, int y) {
        imageManipulation.getPointColour(x, y);
    }
}
