package EX04to09;

public class Tenista extends Atleta
{
    public Tenista(String nome, int idade, float peso, float altura) {
        super(nome, idade, peso, altura);
    }

    @Override
    public void jogar() {
        System.out.println("Jogando tênis");
    }
}
