package EX04to09;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;
import java.util.ArrayList;

public abstract class Atleta implements Comparable<Atleta[]>
        {
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    private LocalDate d;
    static Date d1 = new Date(2024, 07, 16);
    static Date d2 = new Date();

    public Atleta(String nome, int idade, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void aquecer (int minutosDeAquecimento)
    {
        System.out.println("Aquecimento para " + minutosDeAquecimento + " minutos.");

        System.out.print("nesse tempo podemos ");
        if (minutosDeAquecimento == 0)
        {
            System.out.println("fazer nada");
        }
        else if (minutosDeAquecimento < 5)
        {
            System.out.println("pular corda");
        }
        else if (minutosDeAquecimento <= 7)
        {
            System.out.println("fazer uma leve caminhada");
        }
        else if (minutosDeAquecimento <= 15)
        {
            System.out.println("fazer um treinamento de resistência com bandas elásticas");
        }
        else
        {
            System.out.println("fazer uma corrida leve");
        }
    }

    public abstract void jogar();

    public static Date calcularProximaOlimpiada()
    {
        long tempoA = d1.getTime() - d2.getTime();
        long tempo = tempoA/ (1000 * 60 * 60 * 24);
        System.out.println("Faltam " +  tempo +" dias para a próxima olimpíada");
        return d2;

    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public int compareTo(Atleta[] o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
