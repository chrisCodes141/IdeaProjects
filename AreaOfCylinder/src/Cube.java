import java.util.Scanner;

public class Cube implements Shape
{
    @Override
    public double getArea(Scanner in)
    {
        double width, height, length;

        System.out.print("What is the width of your cube? :");
        width = in.nextDouble();
        System.out.print("What is the height of your cube? :");
        height = in.nextDouble();
        System.out.print("What is the length of your cube? :");
        length = in.nextDouble();

        in.nextLine();
        return width * height * length;
    }
}
