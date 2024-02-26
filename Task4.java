import java.util.Scanner;

public class Task4
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

        System.out.println("What is your measurement in meters?:");
        double m = getNumber();

        double feet = m * 3.28084;
        System.out.println("Miles: " + feet / 5280.0);
        System.out.println("Feet: " + feet);
        System.out.println("Inches: " + feet * 12.0);
    }
 }
