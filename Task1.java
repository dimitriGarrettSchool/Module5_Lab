import java.util.Scanner;

public class Task1
{
    public static void call()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("C: ");
        while (true)
        {
            if (in.hasNextDouble())
            {
                double c = in.nextDouble();

                System.out.println("F: " + (c * (9.0/5.0) + 32.0));

                break;
            }

            else
            {
                System.out.println("Invalid input: " + in.nextLine());
            }
        }
    }
}
