import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int option;

        while (true)
        {
            System.out.print("""
                                                    
                    Selecione o exercício que deseja testar:
                    Exercício 1 - (tecle 1)
                    Exercício 2 - (tecle 2)
                    Exercício 3 - (tecle 3)
                    Encerrar execução - (tecle 0)
                    >\s""");
            option = scanf.nextInt();
            menuDeExercicios(option, scanf);
        }
    }

    public static void menuDeExercicios(int option, Scanner scanf)
    {
        scanf.nextLine();
        switch (option) {
            //case 0 -> System.exit(0);
            case 1 -> {
                System.out.println();
                System.out.print("Primeira string: ");
                String string1 = scanf.nextLine();
                System.out.print("Segunda string: ");
                String string2 = scanf.nextLine();
                if (EX01.stringComp(string1, string2)) {
                    System.out.println("a primeira termina com os caracteres da segunda");
                } else {
                    System.out.println("a primeira não termina com os caracteres da segunda");
                }
                continuar(scanf);
            }
            case 2 -> {
                System.out.print("Entre com a string: ");
                String str = scanf.nextLine();
                HashMap<Character, Integer> map = EX02.charCount(str);
                for (Character key : map.keySet()) {
                    System.out.print("[" + key + ":" + map.get(key) + "] ");
                }
                System.out.println();
                continuar(scanf);
            }
            case 3 -> {
                EX03.quenteFrio();
                continuar(scanf);
            }
            default -> throw new IllegalStateException("Unexpected value: " + option);
        }


    }

    public static void continuar(Scanner scanf)
    {
        System.out.println("Continuar? (tecle - sim ou não)");
        String resposta = scanf.nextLine();

        if (resposta.equalsIgnoreCase("não"))
        {
            System.exit(0);
        }
    }

}

