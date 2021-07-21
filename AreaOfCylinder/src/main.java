import java.util.*;

public class main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Map<String, Shape> shapes = new TreeMap<>();
        shapes.put("cylinder", new Cylinder());
        shapes.put("square", new Square());
        shapes.put("cube", new Cube());
        shapes.put("circle", new Circle());
        shapes.put("triangle", new Triangle());
        shapes.put("trapezoid", new Trapezoid());

        while(true)
        {
            System.out.println("What shape are we working with? (exit to exit)");
            String shape = in.nextLine().toLowerCase();

            if(shape.equals("exit") || shape.equals("close"))
            {
                break;
            }
            else
            {
                Shape selected = shapes.get(shape);
                if(selected != null)
                {
                    System.out.println("The area of your " + shape + " is " + selected.getArea(in));
                }
                else
                {
                    System.out.println("No shape found for " + shape);
                }
            }
        }
    }
}
