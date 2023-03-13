package EX04to09;

import java.util.ArrayList;

public class SportsMain implements Comparable<Object>
{
    public static void main(String[] args) {
        int max = 30, min = 1;
        int random;

        Atleta[] atletasGD = new Atleta[3];

        atletasGD[0] = new Corredor("Fabio de Melo", 18, 70,1.70f);
        atletasGD[1] = new Futebolista("Marcelo Rossi", 40, 85, 1.90f);
        atletasGD[2] = new Tenista("Edir Macedo", 21, 85.3f, 1.5f);


        for (int i = 0; i < atletasGD.length; i++)
        {
            atletasGD[i].jogar();
            atletasGD[i].aquecer((i*10)+1);
            System.out.println();
        }

        ArrayList<Atleta> atletasMTL = new ArrayList<Atleta>();
        atletasMTL.add(new Corredor("James Labrie", 25, 55, 1.65f));
        atletasMTL.add(new Futebolista("Dave Mustaine", 30, 75, 1.80f));
        atletasMTL.add(new Tenista("Scott Ian", 20, 60.5f, 1.7f));

        for (Atleta atleta: atletasMTL)
        {
            random = (int) ((Math.random()*(max - min)) + min);
            atleta.jogar();
            atleta.aquecer(random);
            System.out.println();
        }

        Atleta.calcularProximaOlimpiada();
    }

    @Override
    public int compareTo(Object o) {

        o.getClass().isArray();
        return 0;
    }
}
