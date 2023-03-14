package EX04to09;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SportsMain
{
    public static void main(String[] args) {
        int max = 30, min = 1;
        int random;

        Atleta[] atletasGD = new Atleta[3];

        atletasGD[0] = new Corredor("Fabio de Melo", 18, 70,1.70f);
        atletasGD[1] = new Futebolista("Marcelo Rossi", 40, 85, 1.90f);
        atletasGD[2] = new Tenista("Edir Macedo", 21, 85.3f, 1.5f);
        Arrays.sort(atletasGD);

        for (int i = 0; i < atletasGD.length; i++)
        {
            random = (int) ((Math.random()*(max - min)) + min);

            System.out.print(atletasGD[i].getNome() + " está ");
            atletasGD[i].jogar();
            atletasGD[i].aquecer(random);
            System.out.println();
        }

        ArrayList<Atleta> atletasMTL = new ArrayList<Atleta>();
        atletasMTL.add(new Corredor("James Labrie", 25, 55, 1.65f));
        atletasMTL.add(new Futebolista("Dave Mustaine", 30, 75, 1.80f));
        atletasMTL.add(new Tenista("Scott Ian", 20, 60.5f, 1.7f));
        Collections.sort(atletasMTL);

        for (Atleta atleta: atletasMTL)
        {
            random = (int) ((Math.random()*(max - min)) + min);

            System.out.print(atleta.getNome() + " está ");
            atleta.jogar();
            atleta.aquecer(random);
            System.out.println();
        }


       LocalDate dataOlimpiada =  Atleta.calcularProximaOlimpiada();
       System.out.println("A data da Próxima olimpíada é " + dataOlimpiada);
    }


}
