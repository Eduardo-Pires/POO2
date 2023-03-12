import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int option;
        while (true) {
            System.out.print("""
                                
                                Selecione o exercício que deseja testar:
                                Exercício 1 - (tecle 1)
                                Exercício 2 - (tecle 2)
                                Exercício 3 - (tecle 3)
                                Exercício 4 á 9 - (tecle 49)
                                Encerrar execução - (tecle 0)
                                >\s""");
            option = scanf.nextInt();
            MenuDeExercicios.Executar(option);
        }
    }
}

