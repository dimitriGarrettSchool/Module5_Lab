import java.util.Random;
import java.util.Scanner;

public class Task5
{
    private static int getNumber()
    {
        while (in.hasNextLine())
        {
            if (in.hasNextInt())
            {
                return in.nextInt();
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

        Random rand = new Random();
        int ran = rand.nextInt(10);

        System.out.println("What is your guess: ");
        int guess = getNumber();

        if (guess < ran)
        {
            System.out.println("Too low");
        }

        else if (guess > ran)
        {
            System.out.println("Too high");
        }

        else {
            System.out.println("Just right!");
        }
    }
}
