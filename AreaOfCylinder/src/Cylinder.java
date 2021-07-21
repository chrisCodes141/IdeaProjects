import java.util.Scanner;

public class Cylinder implements Shape
{
    @Override
    public double getArea(Scanner in)
    {
        double radius, height;

        System.out.print("What is the radius of your cylinder? :");
        radius = in.nextDouble();
        System.out.print("What is the height of your cylinder? :");
        height = in.nextDouble();

        in.nextLine();
        return 2 * Math.PI * radius * height + 2 * Math.PI * (radius * radius);
    }
}
