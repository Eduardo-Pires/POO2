package EX01to03;

import java.util.Scanner;

public class EX03
{
    public static void quenteFrio()
    {
        int max = 100, min = 1;
        int random = (int) ((Math.random()*(max - min)) + min);
        int chute = 0;
        Scanner scanf = new Scanner(System.in);

        while (chute != random)
        {
            System.out.println("Chute um número de 1 á 100: ");
            chute = scanf.nextInt();

            System.out.print("O chute foi");
            if (chute < random)
            {
                if (random - chute > 50)
                {
                    System.out.print(" muito ");
                }
                else if (random - chute > 25)
                {
                    System.out.print(" um tanto ");
                }
                else if (random - chute > 10)
                {
                    System.out.print(" um pouco ");
                }
                else
                {
                    System.out.print(" um pouquinho ");
                }

                System.out.println("baixo");
            }
            else if (chute > random)
            {
                if (random - chute < -50)
                {
                    System.out.print(" muito ");
                }
                else if (random - chute < -25)
                {
                    System.out.print(" um tanto ");
                }
                else if (random - chute < -10)
                {
                    System.out.print(" um pouco ");
                }
                else
                {
                    System.out.print(" um pouquinho ");
                }

                System.out.println("alto");
            }
        }
        System.out.println(" certeiro!");
    }
}
