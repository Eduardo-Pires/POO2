import java.io.*;
import java.util.Scanner;


public class ex01 extends Thread
{

    String fileS;

    public ex01(String fileS) {
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

            System.out.println(counter);
        }
        catch (FileNotFoundException err)
        {
            System.out.println("arquivo não encontrado");
        }
        catch (IOException err)
        {
            System.out.println("problemas");
        }
    }
}
