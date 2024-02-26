import java.util.Scanner;

public class Task2
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

        System.out.println("How many gallons?: ");
        double gallons = getNumber();

        System.out.println("What is the fuel efficiency?: ");
        double fuelEff = getNumber();

        System.out.println("What is the price per gallon?: ");
        double pricePerG = getNumber();

        System.out.println("Price per 100 gallons: " + pricePerG * 100);
        System.out.println("You can go: " + gallons * fuelEff + " miles");
    }
}
