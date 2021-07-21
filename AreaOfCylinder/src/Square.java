import java.util.Scanner;

public class Square implements Shape
{
    @Override
    public double getArea(Scanner in)
    {
        double width, height;

        System.out.print("What is the width of your square? :");
        width = in.nextDouble();
        System.out.print("What is the height of your square? :");
        height = in.nextDouble();

        in.nextLine();
        return width * height;
    }
}
