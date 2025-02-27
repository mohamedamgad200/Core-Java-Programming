package interfaceexample.shapes;

public class Rectangle extends ClosedShape{
    double width=50;
    double hight=30;
    @Override
    public double computeArea() {
        return width*hight;
    }

    @Override
    public double computePerimeter() {
        return 2*(width+hight);
    }
}
