import java.util.Scanner;

public class Circle implements Shape
{
    @Override
    public double getArea(Scanner in)
    {
        double radius;

        System.out.print("What is the radius of your circle? :");
        radius = in.nextDouble();

        in.nextLine();
        return 2 * Math.PI * (radius * radius);
    }
}
