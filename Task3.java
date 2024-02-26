import java.util.Scanner;

public class Task3
{
    private static double getNumber()
    {
        while (in.hasNextLine())
        {
            if (in.hasNextDouble())
            {
                return in.nextDouble();
            }

            else
            {
                System.out.println("Invalid input: " + in.nextLine());
            }
        }

        return 0;
    }

    private static Scanner in;

    public static void call()
    {
        in = new Scanner(System.in);

        System.out.println("What is the width?: ");
        double width = getNumber();

        System.out.println("What is the height?: ");
        double height = getNumber();

        System.out.println("Area: " + width * height);
        System.out.println("Perimeter: " + width * 2.0 + height * 2.0);
        System.out.println("Diagonal: " + (Math.sqrt(width * width + height * height)));
    }
}
