package EX04to09;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public abstract class Atleta implements Comparable<Atleta>
{
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    static LocalDate dataProximaOlimpiada = LocalDate.of(2024, 7, 16);
    static LocalDate dataAtual = LocalDate.now();

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

    public static LocalDate calcularProximaOlimpiada()
    {
        long diasParaOlimpiada = ChronoUnit.DAYS.between(dataAtual, dataProximaOlimpiada);
        System.out.println("Faltam " +  diasParaOlimpiada +" dias para a próxima olimpíada");

        return dataProximaOlimpiada;
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
    public String toString() {
        return "Atleta{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    @Override
    public int compareTo(Atleta o) {
        return this.nome.compareTo(o.getNome());
    }
}
