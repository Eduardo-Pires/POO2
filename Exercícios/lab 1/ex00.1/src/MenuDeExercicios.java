import java.util.Scanner;
public class MenuDeExercicios {

    static Scanner scanf = new Scanner(System.in);
    public static void Executar(int option)
    {

        switch (option)
        {
            case 0:
                System.exit(0);
            break;
            case 1:
                System.out.println();

                System.out.print("Primeira string: ");
                String string1 = scanf.nextLine();

                System.out.print("Segunda string: ");
                String string2 = scanf.nextLine();

                if (ex01_StringComp.stringComp(string1, string2))
                {
                    System.out.println("a primeira termina com os caracteres da segunda");
                }
                else
                {
                    System.out.println("a primeira não termina com os caracteres da segunda");
                }
                continuar();
                break;
            case 2:


                break;
            default:
                throw new IllegalStateException("Unexpected value: " + option);
        }


    }

    public static void continuar()
    {
        System.out.println("Continuar? (tecle - sim ou não)");
        String resposta = scanf.nextLine();

        if (resposta.equalsIgnoreCase("não"))
        {
            System.exit(0);
        }
    }

}
