package EX04to09;

public class Futebolista extends Atleta
{

    public Futebolista(String nome, int idade, float peso, float altura) {
        super(nome, idade, peso, altura);
    }

    @Override
    public void jogar() {
        System.out.println("Jogando futebol");
    }
}
