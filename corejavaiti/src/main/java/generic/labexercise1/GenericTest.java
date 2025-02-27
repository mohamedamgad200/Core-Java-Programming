package generic.labexercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class GenericTest {
    public static void drawShape(Collection<? extends Shape> lists) {
        for (Shape s : lists) {
            s.draw();
        }
    }

    public static void main(String[] args) {
        List<Rectangle> list1 = new ArrayList<>();
        list1.add(new Rectangle());
        List<Circle> list2 = new ArrayList<>();
        list2.add(new Circle());
        list2.add(new Circle());
        drawShape(list1);
        drawShape(list2);
    }
}

