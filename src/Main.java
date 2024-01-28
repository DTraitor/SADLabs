
public class Main {
    public static void main(String[] args) {
        // Proxy
        System.out.println("Proxy pattern:");
        ImageManipulation imageManipulation = new ProxyManipulation("image.jpg");
        imageManipulation.resize(100, 100);
        imageManipulation.getPointColour(50, 50);

        // Decorator
        System.out.println("Decorator pattern:");
        FrameDecorator frameDecorator = new FrameDecorator(imageManipulation);
        frameDecorator.addFrame("red");
        frameDecorator.resize(120, 120);
        frameDecorator.getPointColour(60, 60);

        // Composite
        System.out.println("Composite pattern:");
        CompositeManipulation compositeManipulation = new CompositeManipulation();
        compositeManipulation.Add(frameDecorator);
        compositeManipulation.Add(new ProxyManipulation("image2.jpg"));
        compositeManipulation.resize(200, 200);
        compositeManipulation.getPointColour(100, 100);
    }
}