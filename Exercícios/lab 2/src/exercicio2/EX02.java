package exercicio2;

import java.io.*;
import java.util.Scanner;


public class EX02 implements Runnable
{

    String fileS;
    int final_Counter;

    public EX02(String fileS) {
        this.fileS = fileS;
    }

    public void run() {
        try
        {
            Scanner scanner = new Scanner(System.in);

            File file = new File(fileS);
            FileReader leitor = new FileReader(file);
            BufferedReader leitorB = new BufferedReader(leitor);

            String string = leitorB.readLine();
            int counter = 0;
            for (int i = 0; string != null; i++)
            {
                counter = i+1;
                string = leitorB.readLine();
            }
            leitor.close();
            Counting.incrementCounter(counter);
            System.out.println(counter);

        }
        catch (FileNotFoundException e)
        {
            System.out.println("Arquivo não encontrado");
        }
        catch (IOException e)
        {
            System.out.println("Erro ao ler arquivo");
        }
    }


}
