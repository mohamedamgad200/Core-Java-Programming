package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        double a = 1, b = -3, c = 2;
        BiFunction<Double,Double,Double> discriminant=(bVal,cVal)->(bVal*bVal)+(4*a*cVal);
        BiConsumer<Double, Double> printRoots = (root1, root2) -> {
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        };
        double d=discriminant.apply(b,c);
        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);
            printRoots.accept(root1, root2);
        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("One real root: " + root);
        } else {
            System.out.println("No real roots (complex numbers).");
        }
    }
}
