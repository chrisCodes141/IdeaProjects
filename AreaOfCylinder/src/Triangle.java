import java.util.Scanner;

public class Triangle implements Shape
{
    @Override
    public double getArea(Scanner in)
    {
        double base, height;

        System.out.print("What is the base of your triangle? :");
        base = in.nextDouble();
        System.out.print("What is the height of your triangle? :");
        height = in.nextDouble();

        in.nextLine();
        return base * height / 2;
    }
}
