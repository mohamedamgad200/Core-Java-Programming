package interfaceexample.shapes;

public class Circle extends ClosedShape {
    double raduis = 7.5;

    @Override
    public double computeArea() {
        return 3.14*raduis*raduis;
    }

    @Override
    public double computePerimeter() {
        return 2*3.14*raduis;
    }
}
