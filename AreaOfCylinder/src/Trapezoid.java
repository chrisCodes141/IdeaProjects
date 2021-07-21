import java.util.Scanner;

public class Trapezoid implements Shape {
    @Override
    public double getArea(Scanner in) {
        double basea, baseb, height;

        System.out.println("What is the Top length of the Trapezoid (base A): ");
        basea = in.nextDouble();
        System.out.println("What is the Bottom length of the Trapezoid (base B): ");
        baseb = in.nextDouble();
        System.out.println("What is the height of the Trapezoid : ");
        height = in.nextDouble();

        return ((basea + baseb) / 2) * height;
    }
}
